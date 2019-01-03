package com.basic.simpleremote;

/**
 * locate com.basic
 * Created by MasterTj on 2019/1/3.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
