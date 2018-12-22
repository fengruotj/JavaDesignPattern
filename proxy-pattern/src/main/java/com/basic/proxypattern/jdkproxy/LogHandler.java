package com.basic.proxypattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * locate com.basic.proxypattern.jdkproxy
 * Created by 79875 on 2017/10/14.
 */
public class LogHandler implements InvocationHandler {
    private Object target;


    public LogHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("--------日志开始-------");
        method.invoke(target);
        System.out.println("--------日志结束-------");
        return null;
    }
}
