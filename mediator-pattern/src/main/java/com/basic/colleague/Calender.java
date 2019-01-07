package com.basic.colleague;

import com.basic.mediator.Mediator;

/**
 * locate com.basic.colleague
 * Created by MasterTj on 2019/1/7.
 */
public class Calender extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calender");
    }

    public void doCalender() {
        System.out.println("doCalender()");
    }
}
