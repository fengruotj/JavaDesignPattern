package com.basic.factorypattern.pizzafm;

/**
 * locate com.basic.factorypattern.pizzafm
 * Created by MasterTj on 2018/12/25.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore=new NYStylePizzaStore();
        PizzaStore chicagoStylePizzaStore=new ChicagoStylePizzaStore();
        Pizza nyStylePizza = nyStylePizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyStylePizza.getName() + "\n");

        Pizza chicagoPizza = chicagoStylePizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + chicagoPizza.getName() + "\n");
    }
}
