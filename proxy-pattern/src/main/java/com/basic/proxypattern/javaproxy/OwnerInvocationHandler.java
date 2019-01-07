package com.basic.proxypattern.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * locate com.basic.proxypattern.javaproxy
 * Created by MasterTj on 2019/1/7.
 */
public class OwnerInvocationHandler implements InvocationHandler{
    private PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if(method.getName().startsWith("get")){
                return method.invoke(personBean,args);
            }else if(method.getName().startsWith("set")){
                return method.invoke(personBean,args);
            }else if(method.getName().startsWith("setHotOrNotRating")){
                throw new IllegalAccessException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
