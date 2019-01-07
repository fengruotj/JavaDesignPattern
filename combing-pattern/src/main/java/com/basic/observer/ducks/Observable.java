package com.basic.observer.ducks;

import com.basic.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * locate com.basic.observer.ducks
 * Created by MasterTj on 2019/1/7.
 */
public class Observable implements QuackObservable {
    private List<Observer> observers=new ArrayList<>();

    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer next = iterator.next();
            next.update(duck);
        }
    }
}
