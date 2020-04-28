package com.hk.pattern.proxy.staticProxy;

import com.hk.pattern.proxy.RealSubject;
import com.hk.pattern.proxy.Subject;

public class ProxySubject implements Subject {

    private final Subject subject = new RealSubject();

    private void beforeOperation() {
        System.out.println("before operation");
    }

    @Override
    public void operation() {
        beforeOperation();
        subject.operation();
        afterOperation();
    }

    private void afterOperation() {
        System.out.println("after operation");
    }
}
