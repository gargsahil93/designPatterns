package com.sahil.strategy.quack;

import com.sahil.strategy.Quack;

public class QuackLikeLion implements Quack {
    @Override
    public void quack() {
        System.out.println("I quack like lion.");
    }
}
