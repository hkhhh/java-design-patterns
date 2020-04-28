package com.hk.pattern.sigleton.lazy;

/**
 * 单例的懒汉模式的实现
 */
public class LazySingleton {

    /**
     * 由于指令重排优化,可能会导致初始化单例对象和将该对象地址赋给instance字段的顺序与预想的顺序不同
     * 例如:
     *    线程A在创建单例对象时,在构造方法调用之前,就为该对象分配了内存空间并将该对象的字段设置为默认值。
     *    此时线程A就可以将分配的内存赋值给instance了,然而该对象可能还没有初始化
     * 因此需要使用volatile关键字修饰instance字段
     * volatile可以禁止指令的重排序优化
     */
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
        //
    }

    /**
     * 虽然这种双重检测锁定的方式可以保证线程安全,
     * 但是每次访问getInstance()方法时,都会进行一次加锁和解锁操作
     */
    public static LazySingleton getInstance() {
        if (instance == null) { // 第一次检测
            synchronized (LazySingleton.class) { // 双重检查锁定
                if (instance == null) { // 第二次检测
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
