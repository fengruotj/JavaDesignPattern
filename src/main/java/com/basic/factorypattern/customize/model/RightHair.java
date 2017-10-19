package com.basic.factorypattern.customize.model;

import com.basic.factorypattern.customize.inteface.HairInterface;

/**
 * locate com.basic.factorypattern.customize.model
 * Created by 79875 on 2017/10/19.
 */
public class RightHair implements HairInterface {
    @Override
    public void draw() {
        System.out.println("----------------右偏分发型----------------");
    }
}
