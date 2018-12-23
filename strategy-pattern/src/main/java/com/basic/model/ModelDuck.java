package com.basic.model;

import com.basic.FlyNoWay;
import com.basic.Quack;

/**
 * locate com.basic.model
 * Created by MasterTj on 2018/12/23.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("display!");
    }
}
