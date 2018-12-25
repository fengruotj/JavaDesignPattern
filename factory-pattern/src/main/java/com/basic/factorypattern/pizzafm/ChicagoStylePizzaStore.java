package com.basic.factorypattern.pizzafm;

/**
 * locate com.basic.factorypattern.pizzafm
 * Created by MasterTj on 2018/12/25.
 */
public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        return null;
    }
}
