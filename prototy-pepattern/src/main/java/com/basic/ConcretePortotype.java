package com.basic;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/8.
 */
public class ConcretePortotype extends Prototype {
    private String filed;

    public ConcretePortotype(String filed) {
        this.filed = filed;
    }

    @Override
    public Prototype myclone() {
        return new ConcretePortotype(filed);
    }
}
