package com.basic.factory;

import com.basic.adapter.Goose;
import com.basic.adapter.GooseAdapter;
import com.basic.decorator.QuackCounter;
import com.basic.ducks.*;

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
