package com.basic.barista;

/**
 * locate com.basic.barista
 * Created by MasterTj on 2019/1/4.
 */
public class Coffee extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
