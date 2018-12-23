package com.basic;

import com.basic.inter.QuackBehavior;

/**
 * locate com.basic
 * Created by MasterTj on 2018/12/23.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
