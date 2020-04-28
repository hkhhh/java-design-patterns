package com.hk.pattern.adapter;

import com.hk.pattern.adapter.jdk14.JDK14LoggingImpl;
import com.hk.pattern.adapter.stdout.StdoutImpl;

import java.lang.reflect.Constructor;

public class LogFactory {

    private static Constructor<? extends Log> logConstructor;

    static {
        tryImplementation(LogFactory::useJdkLogging);
        tryImplementation(LogFactory::useStdout);
    }

    public static Log getLogger(Class<?> clazz) {
        return getLogger(clazz.getName());
    }

    public static Log getLogger(String className) {
        try {
            return logConstructor.newInstance(className);
        } catch (Throwable t) {
            throw new RuntimeException(t.getMessage());
        }
    }

    public static void useStdout() {
        setImplementation(StdoutImpl.class);
    }

    public static void useJdkLogging() {
        setImplementation(JDK14LoggingImpl.class);
    }

    private static void tryImplementation(Runnable runnable) {
        if (logConstructor == null) {
            try {
                runnable.run();
            } catch (Throwable e) {
                // ignore
            }
        }
    }

    private static void setImplementation(Class<? extends Log> implClass) {
        try {
            Constructor<? extends Log> candidate = implClass.getConstructor(String.class);
            Log log = candidate.newInstance(LogFactory.class.getName());
            if (log.isDebuggerEnable()) {
                log.debug("Logging initialized using '" + implClass + "' adapter.");
            }
            logConstructor = candidate;
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
