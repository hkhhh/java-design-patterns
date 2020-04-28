package com.hk.pattern.proxy.jdkDynamic;

import com.hk.pattern.proxy.RealSubject;
import com.hk.pattern.proxy.Subject;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubjectInvocationHandlerTest {

    @Test
    public void shouldProxySubject() {
        Subject subject = new RealSubject();
        subject.operation();
        SubjectInvocationHandler invocationHandler = new SubjectInvocationHandler(subject);
        Subject proxy = (Subject) invocationHandler.getProxy();
        proxy.operation();
    }

}
