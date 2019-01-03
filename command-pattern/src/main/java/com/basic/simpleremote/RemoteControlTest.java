package com.basic.simpleremote;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/3.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl=new SimpleRemoteControl();
        Light light=new Light("1-1");
        LightOnCommand lightOnCommand=new LightOnCommand(light);
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
