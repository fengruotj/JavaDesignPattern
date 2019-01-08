package com.basic.element;

import com.basic.visitor.Visitor;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/8.
 */
public interface Element {
    void accept(Visitor visitor);
}
