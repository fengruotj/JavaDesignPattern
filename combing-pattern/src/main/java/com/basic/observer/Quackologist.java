package com.basic.observer;

import com.basic.observer.ducks.QuackObservable;

/**
 * locate com.basic.observer
 * Created by MasterTj on 2019/1/7.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("Quackologist："+quackObservable+" just quacked.");
    }
}
