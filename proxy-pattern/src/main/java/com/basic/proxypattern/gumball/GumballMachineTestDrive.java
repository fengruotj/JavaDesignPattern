package com.basic.proxypattern.gumball;

import java.rmi.RemoteException;

public class GumballMachineTestDrive {

	public static void main(String[] args) throws RemoteException {
		GumballMachine gumballMachine = new GumballMachine("JD",2);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		gumballMachine.refill(5);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
