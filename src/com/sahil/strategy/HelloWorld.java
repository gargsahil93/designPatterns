package com.sahil.strategy;

import com.sahil.strategy.Duck;
import com.sahil.strategy.ducks.RubberDuck;
import com.sahil.strategy.quack.NoQuack;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloWorld {

    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.fly();
        duck.quack();
        duck.setQuack(new NoQuack());
        duck.quack();
    }
}
