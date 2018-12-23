package com.basic.model;

import com.basic.inter.DisplayElement;
import com.basic.inter.Observer;

/**
 * locate com.basic
 * Created by MasterTj on 2018/12/23.
 */
public class CurrentConditaionsDisplay implements Observer,DisplayElement {
    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditaionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature: "+temperature+" humidity: "+ humidity);
    }

    @Override
    public void update(float temp, float humidity, float preesure) {
        this.humidity=humidity;
        this.temperature=temp;
        display();
    }
}
