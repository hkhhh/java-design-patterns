package com.hk.pattern.sigleton.staticHolder;

/**
 * 单例模式静态内部类的实现方式
 *
 * 根据Java类加载机制,当第一次访问到类中的静态字段时,会出发类加载,并且同一个类只加载一次,静态内部类也是如此
 * 类加载过程由类加载器负责加锁,从而保证线程安全
 */
public class StaticHolderSingleton {

    private StaticHolderSingleton() {
        //
    }

    private static class StaticHandlerSingletonHolder {
        public static StaticHolderSingleton instance = new StaticHolderSingleton();
    }

    public static StaticHolderSingleton getInstance() {
        return StaticHandlerSingletonHolder.instance;
    }

}
