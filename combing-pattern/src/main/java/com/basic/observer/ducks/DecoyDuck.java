package com.basic.observer.ducks;

import com.basic.observer.Observer;

public class DecoyDuck implements Quackable  {

	private Observable observable;

	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}

	public DecoyDuck() {
		observable=new Observable(this);
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
