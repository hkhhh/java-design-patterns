package com.hk.pattern.adapter.stdout;

import com.hk.pattern.adapter.Log;

public class StdoutImpl implements Log {

    public StdoutImpl(String clazz) {
        // Do nothing
    }

    @Override
    public boolean isDebuggerEnable() {
        return false;
    }

    @Override
    public void info(String msg) {
        System.out.println(msg);
    }

    @Override
    public void warn(String msg) {
        System.out.println(msg);
    }

    @Override
    public void error(String msg) {
        System.err.println(msg);
    }

    @Override
    public void error(String msg, Throwable e) {
        System.err.println(msg);
        e.printStackTrace();
    }

    @Override
    public void debug(String msg) {
        System.out.println(msg);
    }
}
