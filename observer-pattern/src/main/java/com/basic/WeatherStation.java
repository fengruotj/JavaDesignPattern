package com.basic;

import com.basic.model.CurrentConditaionsDisplay;
import com.basic.model.ForecastDisplay;
import com.basic.model.StatisticsDisplay;
import com.basic.model.WeatherData;

/**
 * locate com.basic
 * Created by MasterTj on 2018/12/23.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditaionsDisplay conditaionsDisplay=new CurrentConditaionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,75,35.4f);
        weatherData.setMeasurements(82,75,35.4f);
    }
}
