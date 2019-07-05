package com.sahil.observer;

public interface Subject {

    void subscribe(Observer o);

    void unsubscribe(Observer o);
}
