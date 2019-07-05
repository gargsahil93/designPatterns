package com.sahil.observer.subjects;

import java.util.ArrayList;
import java.util.List;

import com.sahil.observer.Observer;
import com.sahil.observer.Subject;

public class WeatherData implements Subject {

    private List<Observer> m_observers = new ArrayList<>();

    private Long m_temperature;
    private Long m_humidity;
    private Long m_pressure;

    @Override
    public void subscribe(Observer o) {
        m_observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        m_observers.remove(o);
    }

    private void sendUpdates() {
        m_observers.forEach(Observer::update);
    }

    public void update(Long temp, Long humidity, Long pressure) {
        m_temperature = temp;
        m_humidity = humidity;
        m_pressure = pressure;
        sendUpdates();
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
