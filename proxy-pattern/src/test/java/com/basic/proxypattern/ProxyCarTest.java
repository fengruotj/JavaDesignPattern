package com.basic.proxypattern;

import com.basic.proxypattern.customize.*;
import org.junit.Test;

/**
 * locate com.basic.proxypattern
 * Created by 79875 on 2017/10/14.
 * 聚合代理比继承代理更加合适
 */
public class ProxyCarTest {
    @Test
    public void move() throws Exception {
        Moveable moveable=new ProxyCar();
        moveable.move();
    }

    @Test
    public void test(){
        Car car=new Car();
        TimeProxyCar timeProxyCar=new TimeProxyCar(car);
        LogProxyCar logProxyCar=new LogProxyCar(timeProxyCar);
        logProxyCar.move();
    }
}
