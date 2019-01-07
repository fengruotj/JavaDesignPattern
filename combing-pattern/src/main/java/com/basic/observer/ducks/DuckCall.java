package com.basic.observer.ducks;

import com.basic.observer.Observer;

public class DuckCall implements Quackable {
	private Observable observable;

	public DuckCall() {
		observable=new Observable(this);
	}

	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
