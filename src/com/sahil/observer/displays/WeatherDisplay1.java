package com.sahil.observer.displays;

import java.util.Observable;
import java.util.Observer;

import com.sahil.observer.WeatherDisplay;
import com.sahil.observer.subjects.WeatherData;

public class WeatherDisplay1 implements Observer, WeatherDisplay {

    public WeatherDisplay1(Observable weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display(WeatherData wd) {
        System.out.println("Display 1");
        System.out.println("Temperature is " + wd.getTemperature());
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            display((WeatherData) o);
        }
    }
}
