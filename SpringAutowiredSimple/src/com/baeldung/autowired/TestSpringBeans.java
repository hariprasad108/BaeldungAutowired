package com.baeldung.autowired;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestSpringBeans {
    InitBeans tb = new InitBeans();

    @Test
    public void givenWiredAttibute_whenIsNotNull_thenSuccess() {
        assertNotNull("Injection to Attribute", tb.getAttr());
    }

    @Test
    public void givenWiredConstructorParam_whenIsNotNull_thenSuccess() {
        assertNotNull("Injection to Constructor", tb.getCons());
    }

    @Test
    public void givenWiredSetterMetodParam_whenIsNotNull_thenSuccess() {
        assertNotNull("Injection to Method", tb.getSetter());
    }

    @Test
    public void givenWiredAttibuteAndConstructorParam_whenAreNotIdentical_thenSuccess() {
        assertTrue(tb.getAttr()
            .getSimpleBean() != tb.getCons()
                .getSimpleBean());
    }

    @Test
    public void givenConstructorParamAndSetterMethodParam_whenAreNotIdentical_thenSuccess() {
        assertTrue(tb.getCons()
            .getSimpleBean() != tb.getSetter()
                .getSimpleBean());
    }

    @Test
    public void givenWiredAttibuteAndSetterMethodParam_whenAreNotIdentical_thenSuccess() {
        assertTrue(tb.getAttr()
            .getSimpleBean() != tb.getSetter()
                .getSimpleBean());
    }

    protected void finalize() {
        tb.close();
    }

}
