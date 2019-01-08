package com.basic.visitor;

import com.basic.element.Customer;
import com.basic.element.Item;
import com.basic.element.Order;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/8.
 */
public interface Visitor {
    public void visit(Customer customer);

    public void visit(Order order);

    public void visit(Item item);
}
