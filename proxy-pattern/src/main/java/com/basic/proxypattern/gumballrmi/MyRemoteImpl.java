package com.basic.proxypattern.gumballrmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * locate com.basic.proxypattern.gumballrmi
 * Created by MasterTj on 2019/1/7.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    @Override
    public String sayhello() throws RemoteException {
        return "Server sys, 'Hellos'";
    }

    public MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) {
        try {
            MyRemote myRemote=new MyRemoteImpl();
            Naming.bind("Remote",myRemote);
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
