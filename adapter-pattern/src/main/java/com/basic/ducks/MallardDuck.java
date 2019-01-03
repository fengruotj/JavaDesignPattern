package com.basic.ducks;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/3.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
