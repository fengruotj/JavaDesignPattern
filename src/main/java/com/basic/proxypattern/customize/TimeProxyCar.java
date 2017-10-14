package com.basic.proxypattern.customize;

/**
 * locate com.basic.proxypattern
 * Created by 79875 on 2017/10/14.
 * 聚合的方法实现代理
 */
public class TimeProxyCar implements Moveable{
    private Moveable moveable;

    public TimeProxyCar(Moveable moveable) {
        this.moveable = moveable;
    }

    @Override
    public void move() {
        long startTime=System.currentTimeMillis();
        System.out.println("Car start move..........");
        moveable.move();
        long endTime=System.currentTimeMillis();
        System.out.println("汽车行驶结束...... 汽车行驶时间："+(endTime-startTime)+"ms");
    }

    @Override
    public void eat() {

    }
}
