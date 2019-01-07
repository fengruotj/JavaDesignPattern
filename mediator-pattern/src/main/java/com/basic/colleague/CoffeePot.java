package com.basic.colleague;

import com.basic.mediator.Mediator;

/**
 * locate com.basic.colleague
 * Created by MasterTj on 2019/1/7.
 */
public class CoffeePot extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }

    public void doCoffeePot() {
        System.out.println("doCoffeePot()");
    }
}
