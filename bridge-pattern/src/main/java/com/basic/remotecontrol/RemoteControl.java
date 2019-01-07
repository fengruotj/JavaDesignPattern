package com.basic.remotecontrol;

import com.basic.tv.TV;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/7.
 */
public abstract class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
