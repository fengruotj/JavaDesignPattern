package com.basic.proxypattern.gumball;

import java.rmi.RemoteException;

/**
 * locate com.basic.proxypattern.gumball
 * Created by MasterTj on 2019/1/7.
 */
public class GumballMointorTestDrive {
    public static void main(String[] args) throws RemoteException {
        int count=0;
        if (args.length > 2 ){
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(0);
        }

        count=Integer.parseInt(args[1]);
        GumballMachine gumballMachine=new GumballMachine(args[0],count);

        GumballMonitor gumballMonitor=new GumballMonitor(gumballMachine);
        gumballMonitor.report();;
    }
}
