package com.hk.pattern.factory;

public class ConcreteFactory1 implements Factory {

    Product product;

    public ConcreteFactory1() {
        this.product = new ConcreteProduct1();
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
