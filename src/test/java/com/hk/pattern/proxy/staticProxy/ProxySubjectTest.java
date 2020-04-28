package com.hk.pattern.proxy.staticProxy;

import com.hk.pattern.proxy.Subject;
import org.junit.Test;

public class ProxySubjectTest {

    @Test
    public void shouldProxySubject() {
        Subject subject = new ProxySubject();
        subject.operation();
    }

}