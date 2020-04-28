package com.hk.pattern.adapter.jdk14;

import com.hk.pattern.adapter.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JDK14LoggingImpl implements Log {

    private final Logger logger;

    public JDK14LoggingImpl(String clazz) {
        logger = Logger.getLogger(clazz);
    }

    @Override
    public boolean isDebuggerEnable() {
        return logger.isLoggable(Level.FINE);
    }

    @Override
    public void info(String msg) {
        logger.info(msg);
    }

    @Override
    public void warn(String msg) {
        logger.warning(msg);
    }

    @Override
    public void error(String msg) {
        logger.log(Level.SEVERE, msg);
    }

    @Override
    public void error(String msg, Throwable e) {
        logger.log(Level.SEVERE, msg, e);
    }

    @Override
    public void debug(String msg) {

    }
}
