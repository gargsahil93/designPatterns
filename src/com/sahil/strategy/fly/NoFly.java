package com.sahil.strategy.fly;

import com.sahil.strategy.Fly;

public class NoFly implements Fly {
    @Override
    public void fly() {
        System.out.println("I don't fly.");
    }
}
