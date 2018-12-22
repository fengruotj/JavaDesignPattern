package com.basic.proxypattern;

import com.basic.proxypattern.customize.Car;
import org.junit.Test;

/**
 * locate com.basic.proxypattern
 * Created by 79875 on 2017/10/14.
 */
public class CarTest {
    @Test
    public void move() throws Exception {
        Car car=new Car();
        car.move();
    }

}
