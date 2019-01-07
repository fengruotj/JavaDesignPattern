package com.basic;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/7.
 * 那些不需要共享的Flyweight的子类。
 */
public class UnsharedConcreteFlyweight extends Flyweight {

    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight:" + extrinsic);
    }

}
