package com.sahil.observer.subjects;

import java.util.Observable;

public class WeatherData extends Observable {
    private Long m_temperature;
    private Long m_humidity;
    private Long m_pressure;

    public void update(Long temp, Long humidity, Long pressure) {
        m_temperature = temp;
        m_humidity = humidity;
        m_pressure = pressure;
        setChanged();
        notifyObservers();
    }

    public Long getTemperature() {
        return m_temperature;
    }

    public Long getHumidity() {
        return m_humidity;
    }

    public Long getPressure() {
        return m_pressure;
    }
}
