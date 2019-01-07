package com.basic.colleague;

import com.basic.mediator.Mediator;

/**
 * locate com.basic.colleague
 * Created by MasterTj on 2019/1/7.
 */
public class Sprinkler extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("sprinkler");
    }

    public void doSprinkler() {
        System.out.println("doSprinkler()");
    }
}
