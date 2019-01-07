package com.basic.iterator;

import com.basic.ducks.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * locate com.basic.iterator
 * Created by MasterTj on 2019/1/7.
 */
public class Flock implements Quackable {
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
    }
}
