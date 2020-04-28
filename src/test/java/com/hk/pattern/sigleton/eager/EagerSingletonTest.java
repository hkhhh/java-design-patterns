package com.hk.pattern.sigleton.eager;

import org.junit.Test;

import static org.junit.Assert.*;

public class EagerSingletonTest {

    @Test
    public void shouldGetInstance() {
        assertNotNull(EagerSingleton.getInstance());
    }

}