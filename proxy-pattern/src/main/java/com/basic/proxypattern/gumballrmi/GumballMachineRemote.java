package com.basic.proxypattern.gumballrmi;

import com.basic.proxypattern.gumball.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * locate com.basic.proxypattern.gumballrmi
 * Created by MasterTj on 2019/1/7.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
