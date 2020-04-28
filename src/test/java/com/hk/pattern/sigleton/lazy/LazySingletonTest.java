package com.hk.pattern.sigleton.lazy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LazySingletonTest {

    @Test
    public void shouldGetInstance() {
        assertNotNull(LazySingleton.getInstance());
    }

}