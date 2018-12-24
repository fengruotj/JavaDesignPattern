package com.basic.concrete;

import com.basic.Beverage;

/**
 * locate com.basic
 * Created by MasterTj on 2018/12/24.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        descripiton="HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
