package com.basic.observer;

import com.basic.decorator.QuackCounter;
import com.basic.observer.ducks.Flock;
import com.basic.observer.ducks.Quackable;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		DuckFactory duckFactory=new DuckFactory();
		simulator.simulate(duckFactory);
	}
  
	void simulate(AbstractDuckFactory duckFactory) {
		Quackologist quackologist=new Quackologist();

		Quackable mallardDuck = duckFactory.createMallardDuck();
		mallardDuck.registerObserver(quackologist);
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		redheadDuck.registerObserver(quackologist);
		Quackable duckCall = duckFactory.createdDuckCall();
		duckCall.registerObserver(quackologist);
		Quackable rubberDuck = duckFactory.createRubberDuck();
		rubberDuck.registerObserver(quackologist);

		System.out.println("\nDuck Simulator");

		Flock flockOfDucks=new Flock();
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);


		flockOfDucks.registerObserver(quackologist);

		simulate(flockOfDucks);
		
		System.out.println("The Ducks quacked "+ QuackCounter.getQuacksCount()+" times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
