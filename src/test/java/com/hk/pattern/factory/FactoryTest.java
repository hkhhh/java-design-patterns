package com.hk.pattern.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTest {

    @Test
    public void shouldGetProduct() {
        Factory factory1 = new ConcreteFactory1();
        factory1.getProduct().produce();
        assertEquals(factory1.getProduct().getClass().getName(), ConcreteProduct1.class.getName());
        Factory factory2 = new ConcreteFactory2();
        factory2.getProduct().produce();
        assertEquals(factory2.getProduct().getClass().getName(), ConcreteProduct2.class.getName());
    }

    @Test
    public void shouldReflectorProduct() {
        Factory factory = new DefaultFactory();
        Product product;
        product = factory.getProduce(ConcreteProduct1.class);
        product.produce();
        assertEquals(product.getClass().getName(), ConcreteProduct1.class.getName());
        product = factory.getProduce(ConcreteProduct2.class);
        product.produce();
        assertEquals(product.getClass().getName(), ConcreteProduct2.class.getName());
    }

}