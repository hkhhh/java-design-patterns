package com.hk.pattern.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void shouldProduce() {
        Factory factory1 = new ConcreteFactory1();
        factory1.getProduct().produce();
        assertEquals(factory1.getProduct().getClass().getName(), ConcreteProduct1.class.getName());
        Factory factory2 = new ConcreteFactory2();
        factory2.getProduct().produce();
        assertEquals(factory2.getProduct().getClass().getName(), ConcreteProduct2.class.getName());
    }

}