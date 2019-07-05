package com.sahil.strategy;

public class Duck {
    private Quack m_quack;
    private Fly m_fly;

    public void setQuack(Quack quack) {
        m_quack = quack;
    }

    public void setFly(Fly fly) {
        m_fly = fly;
    }

    public void fly() {
        m_fly.fly();
    }

    public void quack() {
        m_quack.quack();
    }
}
