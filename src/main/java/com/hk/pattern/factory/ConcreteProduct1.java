package com.hk.pattern.factory;

public class ConcreteProduct1 implements Product {

    @Override
    public void produce() {
        System.out.println(ConcreteProduct1.class.getName() + " produce");
    }
}
