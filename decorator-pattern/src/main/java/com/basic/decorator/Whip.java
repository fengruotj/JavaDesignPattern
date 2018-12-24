package com.basic.decorator;

import com.basic.Beverage;
import com.basic.CondimentDecorator;

/**
 * locate com.basic.decorator
 * Created by MasterTj on 2018/12/24.
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescripiton() {
        return beverage.getDescripiton()+", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.10;
    }
}
