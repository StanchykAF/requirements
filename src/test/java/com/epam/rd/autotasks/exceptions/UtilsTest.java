package com.epam.rd.autotasks.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UtilsTest {

    private String message;

    @BeforeEach
    void setUp() {
        message = "test message";
    }

    @Test
    public void requireNonNullTest() {
        Assertions.assertDoesNotThrow(() -> Utils.requireNonNull(new Object()));
        Assertions.assertThrows(NullPointerException.class, () -> Utils.requireNonNull(null));
        try {
            Assertions.fail();
            Utils.requireNonNull(null, message);
        } catch (NullPointerException nullPointerException) {
            Assertions.assertEquals(message, nullPointerException.getMessage());
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

        Assertions.assertEquals(message, Utils.toString(obj));
        Assertions.assertEquals("null", Utils.toString(null));
    }


    @Test
    public void equalsTest() {
        Object obj1 = new Object();

        Assertions.assertTrue(Utils.equals(obj1, obj1));
        Assertions.assertFalse(Utils.equals(obj1, new Object()));
        Assertions.assertFalse(Utils.equals(obj1, null));
        Assertions.assertFalse(Utils.equals(null, obj1));
        Assertions.assertTrue(Utils.equals(null, null));
    }
}
