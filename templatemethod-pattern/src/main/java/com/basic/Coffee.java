package com.basic;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/4.
 */
public class Coffee {
    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void brewCoffeeGrinds(){
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public void addSugarAndMilk(){
        System.out.println("Adding Sugar and Milk");
    }

    public void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }
}
