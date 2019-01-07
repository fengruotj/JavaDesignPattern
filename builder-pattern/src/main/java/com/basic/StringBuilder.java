package com.basic;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/7.
 */
public class StringBuilder extends AbstractStringBuilder {
    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        // Create a copy, don't share the array
        return new String(value, 0, count);
    }
}
