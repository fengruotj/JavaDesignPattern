package com.basic;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/7.
 * 只能接受处理Type1请求
 */
public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    protected void handlerRequest(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.println(request.getName() + " is handle by ConcreteHandler1");
            return;
        }
        if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
