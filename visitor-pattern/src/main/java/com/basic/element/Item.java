package com.basic.element;

import com.basic.visitor.Visitor;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/8.
 */
public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
