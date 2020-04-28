package com.hk.pattern.proxy;

public class RealSubject implements Subject {

    @Override
    public void operation() {
        System.out.println("operation...");
    }
}
