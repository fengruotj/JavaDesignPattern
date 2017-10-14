package com.basic.proxypattern.jdkproxy;

import com.basic.proxypattern.customize.Car;
import com.basic.proxypattern.customize.Moveable;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * locate com.basic.proxypattern.jdkproxy
 * Created by 79875 on 2017/10/14.
 */
public class JDKHandlerTest {
    /**
     * JDK动态代理测试TimeHandler
     * @throws Exception
     */
    @Test
    public void invoke() throws Exception {
        Car car=new Car();
        InvocationHandler handler=new TimeHandler(car);
        /**
         * loader 类加载器
         * interfaces 实现接口
         * InvocationHandler  handler
         *
         * 动态代理实现思路
         * 实现功能:通过Proxy的newProxyInstance返回代理对象
         * 1.声明一段源码(动态产生代理)
         * 2.编译源码（JDK Compiler API）,产生新的类(代理类)
         * 3.将这个类load到内存中，产生一个新的对象(代理对象)
         * 4.return 代理对象
         */
        Moveable moveable= (Moveable) Proxy.newProxyInstance(Car.class.getClassLoader(),Car.class.getInterfaces(),handler);
        moveable.move();
    }

    @Test
    public void Test(){
        Car car=new Car();
        InvocationHandler handler=new TimeHandler(car);
        /**
         * loader 类加载器
         * interfaces 实现接口
         * InvocationHandler  handler
         */
        Moveable timemoveable= (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(),Car.class.getInterfaces(),handler);

        LogHandler logHandler=new LogHandler(timemoveable);
        Moveable logmoveable= (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(),Car.class.getInterfaces(),logHandler);
        logmoveable.move();

    }

}
