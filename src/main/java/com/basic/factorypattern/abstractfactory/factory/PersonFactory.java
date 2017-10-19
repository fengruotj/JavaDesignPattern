package com.basic.factorypattern.abstractfactory.factory;

import com.basic.factorypattern.abstractfactory.inteface.Boy;
import com.basic.factorypattern.abstractfactory.inteface.Gril;

/**
 * locate com.basic.factorypattern.abstractfactory.factory
 * Created by 79875 on 2017/10/19.
 */
public interface PersonFactory {
    //得到男孩子
    public Boy getBoy();
    //得到女孩子
    public Gril getGril();
}
