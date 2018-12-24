package com.basic;

/**
 * locate com.basic
 * Created by MasterTj on 2018/12/24.
 */
public abstract class Beverage {
    public String descripiton ="Unknown Berverage";

    public String getDescripiton(){
        return descripiton;
    }

    public abstract double cost();
}
