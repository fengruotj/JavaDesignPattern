package com.basic.factorypattern.abstractfactory.model;

import com.basic.factorypattern.abstractfactory.inteface.Gril;

/**
 * locate com.basic.factorypattern.abstractfactory.inteface
 * Created by 79875 on 2017/10/19.
 */
public class MCGril implements Gril {
    @Override
    public void drawWomen() {
        System.out.println("------------------圣诞系列的女孩子--------------");
    }
}
