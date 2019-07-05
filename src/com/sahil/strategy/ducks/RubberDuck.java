package com.sahil.strategy.ducks;

import com.sahil.strategy.Duck;
import com.sahil.strategy.fly.FlyHigh;
import com.sahil.strategy.quack.QuackLikeLion;

public class RubberDuck extends Duck {
    public RubberDuck () {
        setFly(new FlyHigh());
        setQuack(new QuackLikeLion());
    }
}
