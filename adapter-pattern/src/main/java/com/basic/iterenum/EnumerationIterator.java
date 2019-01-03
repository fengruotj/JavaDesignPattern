package com.basic.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * locate com.basic.iterenum
 * Created by MasterTj on 2019/1/3.
 */
public class EnumerationIterator implements Iterator{
    private Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
