package com.basic;

import com.basic.model.Duck;
import com.basic.model.MallardDuck;
import com.basic.model.ModelDuck;

/**
 * locate com.basic
 * Created by MasterTj on 2018/12/23.
 */
public class MiniDuckSImulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model=new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRecoketPowered());
        model.performFly();
    }
}
