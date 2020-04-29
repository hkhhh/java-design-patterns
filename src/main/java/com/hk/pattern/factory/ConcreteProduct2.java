package com.hk.pattern.factory;

public class ConcreteProduct2 implements Product {

    @Override
    public void produce() {
        System.out.println(ConcreteProduct2.class.getName() + " produce");
    }
}
