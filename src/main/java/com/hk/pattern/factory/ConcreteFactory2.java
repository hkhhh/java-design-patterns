package com.hk.pattern.factory;

public class ConcreteFactory2 implements Factory {

    Product product;

    public ConcreteFactory2() {
        this.product = new ConcreteProduct2();
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
