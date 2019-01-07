package com.basic.iterator;

import com.basic.adapter.Goose;
import com.basic.adapter.GooseAdapter;
import com.basic.decorator.QuackCounter;
import com.basic.ducks.Quackable;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		CountingDuckFactory duckFactory=new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}
  
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createdDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();

		Goose goose = new Goose();
		Quackable gooseQuack =new GooseAdapter(goose);

		System.out.println("\nDuck Simulator");

		Flock flockOfDucks=new Flock();
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseQuack);

		simulate(flockOfDucks);

		System.out.println("The Ducks quacked "+ QuackCounter.getQuacksCount()+" times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
