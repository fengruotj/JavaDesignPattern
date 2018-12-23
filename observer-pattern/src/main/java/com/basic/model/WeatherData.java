package com.basic.model;

import com.basic.inter.Observer;
import com.basic.inter.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.basic
 * Created by MasterTj on 2018/12/23.
 */
public class WeatherData implements Subject {
    private List<Observer> observerList=new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index=observerList.indexOf(observer);
        if(index>0){
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer1 : observerList) {
            observer1.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float preesure) {
        this.temperature=temp;
        this.humidity=humidity;
        this.pressure=preesure;
        measurementsChanged();
    }
}
