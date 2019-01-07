package com.basic.proxypattern.gumballrmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * locate com.basic.proxypattern.gumballrmi
 * Created by MasterTj on 2019/1/7.
 */
public class MyRemoteClient {
    public void go(){
        try {
            MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1/Remote");
            String sayhello = myRemote.sayhello();
            System.out.println(sayhello);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }
}
