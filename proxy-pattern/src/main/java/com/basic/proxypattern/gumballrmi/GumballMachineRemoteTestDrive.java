package com.basic.proxypattern.gumballrmi;

import com.basic.proxypattern.gumball.GumballMachine;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineRemoteTestDrive {

	public static void main(String[] args) throws RemoteException {
		GumballMachineRemote gumballMachineRemote=null;
		int count=0;
		if (args.length > 2 ){
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(0);
		}

		try {
			count=Integer.parseInt(args[1]);
			gumballMachineRemote=new GumballMachine(args[0],count);
			Naming.rebind("//"+args[0]+"/gumballmachine",gumballMachineRemote);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
