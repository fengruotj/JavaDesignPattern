package com.basic.state;

/**
 * locate com.basic.state
 * Created by MasterTj on 2019/1/6.
 */
public class NoQuarterStete implements State {
    private GumballMachine gumballMachine;

    public NoQuarterStete(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.hasQuarterState);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter. ");
    }

    @Override
    public void dispense() {
        System.out.println("you need to pay first");
    }

    @Override
    public void refill() {
    }
}
