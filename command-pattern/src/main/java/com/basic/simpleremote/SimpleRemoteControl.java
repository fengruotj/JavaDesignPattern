package com.basic.simpleremote;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/3.
 */
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command){
        this.slot=command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
