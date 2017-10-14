package com.basic.proxypattern.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * locate com.basic.proxypattern.cglibproxy
 * Created by 79875 on 2017/10/14.
 * Cglib 代理类
 */
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer=new Enhancer();

    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);//设置创建之类的类
        enhancer.setCallback(this);

        return enhancer.create();
    }
    /**
     * 拦截所有目标方法的调用
     * @param o 目标类的实例
     * @param method 目标方法的反射对象
     * @param objects   方法的参数
     * @param methodProxy 代理类的实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        /**
         * 代理类调用父类的方法
         */
        System.out.println("--------日志开始-------");
        methodProxy.invokeSuper(o,objects);
        System.out.println("--------日志结束-------");
        return null;
    }
}
