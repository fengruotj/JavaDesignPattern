package com.basic.dinermergeri;

import java.util.Iterator;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/5.
 */
public class MenuTestDriver {
    public static void main(String[] args) {
        DinerMenu dinerMenu=new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        Waiterss waiterss=new Waiterss(pancakeHouseMenu,dinerMenu);
        waiterss.printMenu();
        Iterator iterator = pancakeHouseMenu.createIterator();
        while (iterator.hasNext()){
            MenuItem next = (MenuItem) iterator.next();
            System.out.println(next);
        }

        System.out.println();

        Iterator dinerMenuIterator = dinerMenu.createIterator();
        while (dinerMenuIterator.hasNext()){
            MenuItem next = (MenuItem) dinerMenuIterator.next();
            System.out.println(next);
        }
    }
}
