package com.hk.pattern.adapter;

public interface Log {

    boolean isDebuggerEnable();

    void info(String msg);

    void warn(String msg);

    void error(String msg);

    void error(String msg, Throwable throwable);

    void debug(String msg);

}
