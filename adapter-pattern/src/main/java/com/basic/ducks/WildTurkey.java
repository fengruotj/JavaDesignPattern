package com.basic.ducks;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/3.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance.");
    }
}
