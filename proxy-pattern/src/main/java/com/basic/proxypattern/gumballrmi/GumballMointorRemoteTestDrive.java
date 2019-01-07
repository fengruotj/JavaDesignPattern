package com.basic.proxypattern.gumballrmi;

import com.basic.proxypattern.gumball.GumballMonitor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * locate com.basic.proxypattern.gumball
 * Created by MasterTj on 2019/1/7.
 */
public class GumballMointorRemoteTestDrive {
    public static void main(String[] args){
        try {
            GumballMachineRemote machine= (GumballMachineRemote) Naming.lookup("rmi://localhost/gumballmachine");
            GumballMonitor gumballMonitor=new GumballMonitor(machine);
            gumballMonitor.report();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
