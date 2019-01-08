package com.basic;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/8.
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototype=new ConcretePortotype("hello");
        Prototype myclone = prototype.myclone();
        System.out.println(myclone.toString());
    }
}
