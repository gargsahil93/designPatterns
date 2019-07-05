package com.sahil.strategy.fly;

import com.sahil.strategy.Fly;

public class FlyAboveClouds implements Fly {
    @Override
    public void fly() {
        System.out.println("Flying above clouds");
    }
}
