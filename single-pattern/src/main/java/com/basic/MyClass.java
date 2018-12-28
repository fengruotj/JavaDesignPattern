package com.basic;

/**
 * locate com.basic
 * Created by MasterTj on 2018/12/28.
 */
public class MyClass {
    private static MyClass myClass;

    private MyClass(){

    }

    public static MyClass getInstance(){
        if(myClass==null)
            myClass=new MyClass();
            return myClass;
    }


}
