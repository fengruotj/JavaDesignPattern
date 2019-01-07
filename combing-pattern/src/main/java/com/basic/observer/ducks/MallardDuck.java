package com.basic.observer.ducks;

import com.basic.observer.Observer;

public class MallardDuck implements Quackable {
	private Observable observable;

	public MallardDuck() {
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
