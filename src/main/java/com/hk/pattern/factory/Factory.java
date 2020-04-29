package com.hk.pattern.factory;

import java.lang.reflect.InvocationTargetException;

public interface Factory {

    Product getProduct();

    default Product getProduce(Class<? extends Product> clazz) {
        if (clazz == null) {
            return null;
        }
        Product product = null;
        try {
            product = clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return product;
    }

}
