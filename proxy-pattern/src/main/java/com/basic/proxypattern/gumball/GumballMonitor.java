package com.basic.proxypattern.gumball;

import com.basic.proxypattern.gumballrmi.GumballMachineRemote;

import java.rmi.RemoteException;

/**
 * locate com.basic.proxypattern.gumball
 * Created by MasterTj on 2019/1/7.
 */
public class GumballMonitor {
    private GumballMachineRemote gumballMachineRemote;

    public GumballMonitor(GumballMachineRemote gumballMachineRemote) {
        this.gumballMachineRemote = gumballMachineRemote;
    }

    public void report() throws RemoteException {
        System.out.println("Gumball Machine: "+ gumballMachineRemote.getLocation());
        System.out.println("Curreint inventroy: "+ gumballMachineRemote.getCount()+" gumballs");
        System.out.println("Current state: "+gumballMachineRemote.getState());
    }
}
