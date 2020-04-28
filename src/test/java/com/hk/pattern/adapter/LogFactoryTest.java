package com.hk.pattern.adapter;

import com.hk.pattern.adapter.jdk14.JDK14LoggingImpl;
import com.hk.pattern.adapter.stdout.StdoutImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogFactoryTest {

    @Test
    public void shouldUseJDKLogging() {
        LogFactory.useJdkLogging();
        Log log = LogFactory.getLogger(LogFactoryTest.class.getName());
        logSomething(log);
        assertEquals(log.getClass().getName(), JDK14LoggingImpl.class.getName());
    }

    @Test
    public void shouldUseStdoutLogging() {
        LogFactory.useStdout();
        Log log = LogFactory.getLogger(LogFactoryTest.class);
        logSomething(log);
        assertEquals(log.getClass().getName(), StdoutImpl.class.getName());
    }

    private void logSomething(Log log) {
        log.info("log info");
        log.debug("log debug");
        log.error("log error");
        log.error("log error with t", new Exception("log error"));
    }

}