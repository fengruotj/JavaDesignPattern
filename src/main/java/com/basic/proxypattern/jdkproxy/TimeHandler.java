package com.basic.proxypattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * locate com.basic.proxypattern.jdkproxy
 * Created by 79875 on 2017/10/14.
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 被代理的对象
     * @param method 被代理对象方法
     * @param args 被代理对象方法参数
     * @return Object对象
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime=System.currentTimeMillis();
        System.out.println("Car start move..........");
        method.invoke(target);
        System.out.println(target);
        long endTime=System.currentTimeMillis();
        System.out.println("汽车行驶结束...... 汽车行驶时间："+(endTime-startTime)+"ms");
        return null;
    }
}
