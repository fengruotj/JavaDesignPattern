package com.basic.factorypattern.abstractfactory.factory;

import com.basic.factorypattern.abstractfactory.inteface.Boy;
import com.basic.factorypattern.abstractfactory.inteface.Gril;
import com.basic.factorypattern.abstractfactory.inteface.HNBoy;
import com.basic.factorypattern.abstractfactory.inteface.HNGril;

/**
 * locate com.basic.factorypattern.abstractfactory.factory
 * Created by 79875 on 2017/10/19.
 * 新年系列加工厂
 */
public class HNFactory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new HNBoy();
    }

    @Override
    public Gril getGril() {
        return new HNGril();
    }
}
