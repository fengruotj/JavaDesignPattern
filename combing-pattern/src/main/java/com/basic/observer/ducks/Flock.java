package com.basic.observer.ducks;



import com.basic.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * locate com.basic.iterator
 * Created by MasterTj on 2019/1/7.
 */
public class Flock implements Quackable {
    private Observable observable;

    public Flock() {
        observable=new Observable(this);
    }

    private List<Quackable> quackables=new ArrayList<>();

    public void add(Quackable quackable){
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackables.iterator();
        while (iterator.hasNext()){
            Quackable next = iterator.next();
            next.quack();
        }
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
