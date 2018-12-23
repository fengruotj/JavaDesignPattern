package com.basic.model;

import com.basic.FlyWithWings;
import com.basic.Quack;

/**
 * locate com.basic.model
 * Created by MasterTj on 2018/12/23.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("display!");
    }
}
