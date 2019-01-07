package com.basic.decorator;

import com.basic.ducks.Quackable;

/**
 * locate com.basic.decorator
 * Created by MasterTj on 2019/1/7.
 */
public class QuackCounter implements Quackable {
    private Quackable quackable;

    private static int numberofQuacks;

    public QuackCounter(Quackable duck) {
        this.quackable = duck;
    }

    @Override
    public void quack() {
        quackable.quack();;
        numberofQuacks++;
    }

    public static int getQuacksCount(){
        return numberofQuacks;
    }
}
