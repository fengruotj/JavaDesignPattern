package com.basic.menuiterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * locate com.basic.menuiterator
 * Created by MasterTj on 2019/1/6.
 */
public class CompositeIterator implements Iterator {
    private Stack<Iterator> stack=new Stack<>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()){
            return false;
        }else {
            Iterator peek = stack.peek();
            if(peek.hasNext())
                return true;
            else {
                stack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator peek = stack.peek();
            MenuComponent next = (MenuComponent) peek.next();
            if(next instanceof Menu)
                stack.push(next.createIterator());
            return next;

        }else
            return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
