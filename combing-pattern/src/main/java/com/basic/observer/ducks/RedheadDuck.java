package com.basic.observer.ducks;

import com.basic.observer.Observer;

public class RedheadDuck implements Quackable {

	private Observable observable;

	public RedheadDuck() {
		observable=new Observable(this);
	}

	public void quack() {
		System.out.println("Quack");
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
