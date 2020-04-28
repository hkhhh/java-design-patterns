package com.hk.pattern.sigleton.staticHolder;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaticHolderSingletonTest {

    @Test
    public void shouldGetInstance() {
        assertNotNull(StaticHolderSingleton.getInstance());
    }

}