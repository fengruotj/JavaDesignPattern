package com.basic.element;

import com.basic.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/8.
 */
public class Customer implements Element{
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Order order : orders) {
            order.accept(visitor);
        }
    }
}
