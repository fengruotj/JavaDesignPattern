package com.basic.winnerstate;

/**
 * locate com.basic.state
 * Created by MasterTj on 2019/1/6.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();

    public void refill();
}
