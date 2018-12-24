package com.basic;

import com.basic.concrete.DarkRoast;
import com.basic.concrete.Espresso;
import com.basic.concrete.HouseBlend;
import com.basic.decorator.Mocha;
import com.basic.decorator.Soy;
import com.basic.decorator.Whip;

/**
 * locate com.basic
 * Created by MasterTj on 2018/12/24.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1=new Espresso();
        System.out.println(beverage1.getDescripiton()+" $: "+ beverage1.cost());

        Beverage beverage2=new DarkRoast();
        beverage2=new Mocha(beverage2);
        beverage2=new Mocha(beverage2);
        beverage2=new Whip(beverage2);
        System.out.println(beverage2.getDescripiton()+" $: "+ beverage2.cost());

        Beverage beverage3=new HouseBlend();
        beverage3=new Soy(beverage3);
        beverage3=new Mocha(beverage3);
        beverage3=new Whip(beverage3);
        System.out.println(beverage3.getDescripiton()+" $: "+ beverage3.cost());
    }
}
