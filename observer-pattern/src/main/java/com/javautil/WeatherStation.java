package com.javautil;


import com.javautil.model.CurrentConditaionsDisplay;
import com.javautil.model.ForecastDisplay;
import com.javautil.model.StatisticsDisplay;
import com.javautil.model.WeatherData;

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
