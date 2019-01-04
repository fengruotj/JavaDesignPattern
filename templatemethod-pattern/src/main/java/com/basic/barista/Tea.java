package com.basic.barista;

/**
 * locate com.basic.barista
 * Created by MasterTj on 2019/1/4.
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
