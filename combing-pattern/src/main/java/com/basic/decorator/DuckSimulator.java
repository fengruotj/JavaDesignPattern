package com.basic.decorator;

import com.basic.adapter.Goose;
import com.basic.adapter.GooseAdapter;
import com.basic.ducks.*;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}
  
	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());

		Goose goose = new Goose();
		Quackable gooseQuack =new GooseAdapter(goose);

		System.out.println("\nDuck Simulator");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseQuack);

		System.out.println("The Ducks quacked "+ QuackCounter.getQuacksCount()+" times");
	}
   
	void simulate(Quackable duck) {
		duck.quack();
	}
}
