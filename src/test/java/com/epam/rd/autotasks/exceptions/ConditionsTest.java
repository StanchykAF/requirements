package com.epam.rd.autotasks.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ConditionsTest {
    private String message;

    @BeforeEach
    public void setUp() {
        this.message = "meeeessage";
    }

    @Test
    public void checkArgumentTest() {
        Assertions.assertDoesNotThrow(() -> Conditions.checkArgument(true));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Conditions.checkArgument(false));

        try {
            Conditions.checkArgument(false, message);
        } catch (IllegalArgumentException illegalArgumentException) {
            Assertions.assertEquals(message, illegalArgumentException.getMessage());
        } catch (Throwable thr) {
            thr.printStackTrace();
            Assertions.fail("Threw wrong type exception " + thr.getMessage());
        }
    }

    @Test
    public void checkElementIndex() {
        Assertions.assertDoesNotThrow(() -> Conditions.checkElementIndex(0, 10));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> Conditions.checkElementIndex(11, 10));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> Conditions.checkElementIndex(10, 10));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> Conditions.checkElementIndex(-1, 10));
    }
}
