package com.sahil.observer.displays;

import com.sahil.observer.Observer;
import com.sahil.observer.WeatherDisplay;
import com.sahil.observer.subjects.WeatherData;

public class WeatherDisplay2 implements Observer, WeatherDisplay {

    private WeatherData m_weatherData;

    public WeatherDisplay2(WeatherData weatherData) {
        m_weatherData = weatherData;
        weatherData.subscribe(this);
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Display 2");
        System.out.println("Temperature is " + m_weatherData.getTemperature());
    }
}
