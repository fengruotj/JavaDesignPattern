package com.basic.factorypattern.customize;

import com.basic.factorypattern.customize.factory.HairFactory;
import com.basic.factorypattern.customize.inteface.HairInterface;
import com.basic.factorypattern.customize.model.LeftHair;

/**
 * locate com.basic.factorypattern
 * Created by 79875 on 2017/10/19.
 */
public class ClientTest {
    public static void main(String[] args) throws ClassNotFoundException {
//        HairInterface left=new LeftHair();
//        left.draw();
//        HairInterface right=new RightHair();
//        right.draw();

        //工厂模式生成实例
//        HairFactory hairFactory=new HairFactory();
//        HairInterface left = hairFactory.getHair("left");
//        left.draw();
//        HairInterface right = hairFactory.getHair("right");
//        right.draw();

        //反射机制生成实例
        HairFactory hairFactory=new HairFactory();
        HairInterface hairByClass = hairFactory.getHairByClass(LeftHair.class.getName());
        hairByClass.draw();
    }
}
