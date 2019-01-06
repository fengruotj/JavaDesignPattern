package com.basic.menu;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/6.
 */
public class Waitress {
    private MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu(){
        menuComponent.print();
    }
}
