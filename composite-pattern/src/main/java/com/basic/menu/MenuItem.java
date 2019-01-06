package com.basic.menu;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/6.
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String decription;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String decription, boolean vegetarian, double price) {
        this.name = name;
        this.decription = decription;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return decription;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }
}
