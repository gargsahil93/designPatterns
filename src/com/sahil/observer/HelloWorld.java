package com.sahil.observer;

import com.sahil.observer.displays.WeatherDisplay1;
import com.sahil.observer.displays.WeatherDisplay2;
import com.sahil.observer.subjects.WeatherData;

public class HelloWorld {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        new WeatherDisplay1(wd);
        new WeatherDisplay2(wd);

        wd.update(33L, 10L, 15L);

        wd.update(1L, 1L, 1L);
    }
}
