package com.javautil.model;

import com.basic.inter.DisplayElement;
import java.util.Observable;

public class ForecastDisplay implements java.util.Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Observable observable;

	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {

	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();

			display();
		}
	}
}
