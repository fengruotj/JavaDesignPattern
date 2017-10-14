package com.basic.proxypattern.customize;

import java.util.Random;

/**
 * locate com.basic.proxypattern
 * Created by 79875 on 2017/10/14.
 */
public class Car implements Moveable{

    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("Car now move..........");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eat(){
        System.out.println("eat.........");
    }
}
