package com.basic.proxypattern.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * locate com.basic.proxypattern.javaproxy
 * Created by MasterTj on 2019/1/7.
 */
public class NonOwnerInvocationHandler implements InvocationHandler{
    private PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if(method.getName().startsWith("get")){
                throw new IllegalAccessException();
            }else if(method.getName().startsWith("set")){
                throw new IllegalAccessException();
            }else if(method.getName().startsWith("setHotOrNotRating")){
               return method.invoke(personBean,args);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
