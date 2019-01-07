package com.basic.observer.ducks;

import com.basic.observer.Observer;

public class RubberDuck implements Quackable {

	private Observable observable;

	public RubberDuck() {
		observable=new Observable(this);
	}

	public void quack() {
		System.out.println("Squeak");
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
