package com.hk.pattern.proxy.jdkDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SubjectInvocationHandler implements InvocationHandler {

    private final Object target;

    public SubjectInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result = method.invoke(target, args);
        afterInvoke();
        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    private void beforeInvoke() {
        System.out.println(SubjectInvocationHandler.class.getName() + "before invoke");
    }

    private void afterInvoke() {
        System.out.println(SubjectInvocationHandler.class.getName() + "after invoke");
    }

}
