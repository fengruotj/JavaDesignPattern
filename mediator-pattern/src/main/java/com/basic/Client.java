package com.basic;

import com.basic.colleague.Alarm;
import com.basic.colleague.Calender;
import com.basic.colleague.CoffeePot;
import com.basic.colleague.Sprinkler;
import com.basic.mediator.ConcreteMediator;
import com.basic.mediator.Mediator;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/7.
 */
public class Client {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        CoffeePot coffeePot = new CoffeePot();
        Calender calender = new Calender();
        Sprinkler sprinkler = new Sprinkler();
        Mediator mediator = new ConcreteMediator(alarm, coffeePot, calender, sprinkler);
        // 闹钟事件到达，调用中介者就可以操作相关对象
        alarm.onEvent(mediator);
    }
}
