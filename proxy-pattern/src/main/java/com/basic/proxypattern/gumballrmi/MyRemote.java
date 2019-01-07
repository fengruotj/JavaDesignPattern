package com.basic.proxypattern.gumballrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * locate com.basic.proxypattern.gumballrmi
 * Created by MasterTj on 2019/1/7.
 */
public interface MyRemote extends Remote{
    public String sayhello() throws RemoteException;
}
