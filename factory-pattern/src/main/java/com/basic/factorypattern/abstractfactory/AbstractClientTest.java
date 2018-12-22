package com.basic.factorypattern.abstractfactory;

import com.basic.factorypattern.abstractfactory.factory.HNFactory;
import com.basic.factorypattern.abstractfactory.factory.MCFactory;
import com.basic.factorypattern.abstractfactory.factory.PersonFactory;
import com.basic.factorypattern.abstractfactory.inteface.HNBoy;
import com.basic.factorypattern.abstractfactory.model.MCBoy;

/**
 * locate com.basic.factorypattern.abstractfactory
 * Created by 79875 on 2017/10/19.
 */
public class AbstractClientTest {
    public static void main(String[] args) {
        PersonFactory mcFactory=new MCFactory();
        PersonFactory hnFactory=new HNFactory();
        MCBoy mcBoy = (MCBoy) mcFactory.getBoy();
        HNBoy hnBoy= (HNBoy) hnFactory.getBoy();
        mcBoy.drawMan();
        hnBoy.drawMan();
    }
}
