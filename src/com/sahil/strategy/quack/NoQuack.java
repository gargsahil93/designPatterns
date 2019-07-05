package com.sahil.strategy.quack;

import com.sahil.strategy.Quack;

public class NoQuack implements Quack {
    @Override
    public void quack() {
        System.out.println("I don't quack");
    }
}
