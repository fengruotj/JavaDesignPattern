package com.basic.concrete;

import com.basic.Beverage;

/**
 * locate com.basic
 * Created by MasterTj on 2018/12/24.
 */
public class Espresso extends Beverage {
    public Espresso() {
        descripiton="Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
