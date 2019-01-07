package com.basic;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/7.
 */
public abstract class Handler {
    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handlerRequest(Request request);
}
