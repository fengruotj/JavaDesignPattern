package com.basic.colleague;

import com.basic.mediator.Mediator;

/**
 * locate com.basic.colleague
 * Created by MasterTj on 2019/1/7.
 */
public class Alarm extends Colleague {

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public void doAlarm() {
        System.out.println("doAlarm()");
    }
}
