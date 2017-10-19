package com.basic.factorypattern.customize.model;

import com.basic.factorypattern.customize.inteface.HairInterface;

/**
 * locate com.basic.factorypattern.customize.model
 * Created by 79875 on 2017/10/19.
 */
public class LeftHair implements HairInterface {
    @Override
    public void draw() {
        System.out.println("----------------左偏分发型----------------");
    }
}
