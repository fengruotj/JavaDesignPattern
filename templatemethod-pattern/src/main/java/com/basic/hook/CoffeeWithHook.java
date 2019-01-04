package com.basic.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * locate com.basic.hook
 * Created by MasterTj on 2019/1/4.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y"))
            return true;
        else
            return false;
    }

    private String getUserInput(){
        String answer=null;
        System.out.println("Would you like milk and sugar with your coffee (y/n) ?");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        try {
            answer=bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(answer==null){
            return "no";
        }
        return answer;
    }
}
