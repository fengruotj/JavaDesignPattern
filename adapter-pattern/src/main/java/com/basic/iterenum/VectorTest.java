package com.basic.iterenum;

import java.util.Vector;

/**
 * locate com.basic.iterenum
 * Created by MasterTj on 2019/1/3.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        for (int i = 0; i < 5; i++) {
            vector.add(i);
        }

        EnumerationIterator enumerationIterator=new EnumerationIterator(vector.elements());
        while (enumerationIterator.hasNext()){
            Object next = enumerationIterator.next();
            System.out.println(next);
        }
    }
}
