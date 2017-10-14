package com.basic.proxypattern.customize;

/**
 * locate com.basic.proxypattern.customize
 * Created by 79875 on 2017/10/14.
 */
public class LogProxyCar implements Moveable{
    private Moveable moveable;

    public LogProxyCar(Moveable moveable) {
        this.moveable = moveable;
    }

    @Override
    public void move() {
        System.out.println("--------日志开始-------");
        moveable.move();
        System.out.println("--------日志结束-------");
    }

    @Override
    public void eat() {

    }
}
