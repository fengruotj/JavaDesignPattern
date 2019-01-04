package com.basic;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/4.
 */
public class Tea {
    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void steepTeaBag(){
        System.out.println("Steeping the tea");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public void addLemon(){
        System.out.println("Adding Lemon");
    }

    public void prepareReecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }
}
