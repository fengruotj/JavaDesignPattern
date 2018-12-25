package com.basic.factorypattern.pizzafm;

/**
 * locate com.basic.factorypattern.pizzafm
 * Created by MasterTj on 2018/12/25.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
