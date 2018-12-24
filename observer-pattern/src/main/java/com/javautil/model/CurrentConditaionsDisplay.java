package com.javautil.model;

import com.basic.inter.DisplayElement;

import java.util.Observable;

/**
 * locate com.basic
 * Created by MasterTj on 2018/12/23.
 */
public class CurrentConditaionsDisplay implements java.util.Observer,DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditaionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature: "+temperature+" humidity: "+ humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
           WeatherData weatherData= (WeatherData) o;
           this.temperature=weatherData.getTemperature();
           this.humidity=weatherData.getHumidity();
           display();
        }
    }
}
