package com.basic;

import com.basic.inter.FlyBehavior;

/**
 * locate com.basic
 * Created by MasterTj on 2018/12/23.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
