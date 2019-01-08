package com.basic.element;

import com.basic.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/8.
 */
public class CustomerGroup implements Element{
    private List<Customer> customers = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
