package com.basic;

import com.basic.remotecontrol.ConcreteRemoteControl1;
import com.basic.remotecontrol.ConcreteRemoteControl2;
import com.basic.remotecontrol.RemoteControl;
import com.basic.tv.RCA;
import com.basic.tv.Sony;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/7.
 */
public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl1 = new ConcreteRemoteControl1(new RCA());
        remoteControl1.on();
        remoteControl1.off();
        remoteControl1.tuneChannel();
        RemoteControl remoteControl2 = new ConcreteRemoteControl2(new Sony());
        remoteControl2.on();
        remoteControl2.off();
        remoteControl2.tuneChannel();
    }
}
