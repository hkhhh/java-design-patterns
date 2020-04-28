package com.hk.pattern.sigleton.eager;

/**
 * 单例模式的饿汉模式实现
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        //
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}
