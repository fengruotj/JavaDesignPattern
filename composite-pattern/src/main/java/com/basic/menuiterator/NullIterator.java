package com.basic.menuiterator;

import java.util.Iterator;

/**
 * locate com.basic.menuiterator
 * Created by MasterTj on 2019/1/6.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
