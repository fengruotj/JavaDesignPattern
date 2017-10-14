package com.basic.proxypattern.cglibproxy;

import org.junit.Test;

/**
 * locate com.basic.proxypattern.cglibproxy
 * Created by 79875 on 2017/10/14.
 */
public class CglibProxyTest {
    @Test
    public void test(){
        CglibProxy cglibProxy=new CglibProxy();
        Train train = (Train) cglibProxy.getProxy(Train.class);
        train.move();
    }
}
