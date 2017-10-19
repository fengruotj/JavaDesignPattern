package com.basic.factorypattern.customize.factory;


import com.basic.factorypattern.customize.inteface.HairInterface;
import com.basic.factorypattern.customize.model.LeftHair;
import com.basic.factorypattern.customize.model.RightHair;

/**
 * locate com.basic.factorypattern.customize.factory
 * Created by 79875 on 2017/10/19.
 * 发型工厂
 */
public class HairFactory {
    /**
     * 根据类型来创建方法
     * @param key
     * @return
     */
    public HairInterface getHair(String key){
        if("left".equals(key)){
            return new LeftHair();
        }else if("right".equals(key))
            return new RightHair();
        return null;
    }

    public HairInterface getHairByClass(String className) {
        try {
            HairInterface hairInterface= (HairInterface) Class.forName(className).newInstance();
            return hairInterface;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
