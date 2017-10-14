package com.basic.proxypattern;

import com.basic.proxypattern.customize.Car;
import com.basic.proxypattern.customize.ProxyCar2;
import org.junit.Test;

/**
 * locate com.basic.proxypattern
 * Created by 79875 on 2017/10/14.
 */
public class ProxyCar2Test {
    @Test
    public void move() throws Exception {
        Car car=new Car();
        ProxyCar2 proxyCar2=new ProxyCar2(car);
        proxyCar2.move();
    }

}
