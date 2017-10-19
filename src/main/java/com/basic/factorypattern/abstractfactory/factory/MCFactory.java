package com.basic.factorypattern.abstractfactory.factory;

import com.basic.factorypattern.abstractfactory.inteface.Boy;
import com.basic.factorypattern.abstractfactory.inteface.Gril;
import com.basic.factorypattern.abstractfactory.model.MCBoy;
import com.basic.factorypattern.abstractfactory.model.MCGril;

/**
 * locate com.basic.factorypattern.abstractfactory.factory
 * Created by 79875 on 2017/10/19.
 * 圣诞系列加工厂
 */
public class MCFactory implements PersonFactory {
    @Override
    public Boy getBoy() {

        return new MCBoy();
    }

    @Override
    public Gril getGril() {
        return new MCGril();
    }
}
