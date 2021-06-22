package com.epam.rd.autotasks.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ObjectsTest {

    private String message;

    @BeforeEach
    void setUp() {
        message = "test message";
    }

    @Test
    public void requireNonNullTest() {
        try {
            Objects.requireNonNull(new Object());
        } catch (Throwable t) {
            Assertions.fail("On non null object throwed exception", t);
            return;
        }

        try {
            Objects.requireNonNull(null);
            Assertions.fail("On null object not throwed exception");
        } catch (NullPointerException npe) {

        } catch (Throwable throwable) {
            Assertions.fail("Wrong exception type on requireNonNull" + throwable.getClass().getSimpleName());
        }

        try {
            Objects.requireNonNull(null, message);
        } catch (Throwable throwable) {
            Assertions.assertEquals(message, throwable.getMessage());
        }
    }


    @Test
    public void toStringTest() {
        Object obj = new Object() {
            @Override
            public String toString() {
                return message;
            }
        };

        Assertions.assertEquals(message, Objects.toString(obj));
        Assertions.assertEquals("null", Objects.toString(null));
    }


    @Test
    public void equalsTest() {
        Object obj1 = new Object();

        Assertions.assertTrue(Objects.equals(obj1, obj1));
        Assertions.assertFalse(Objects.equals(obj1, null));
        Assertions.assertFalse(Objects.equals(null, obj1));
        Assertions.assertTrue(Objects.equals(null, null));
    }
}
