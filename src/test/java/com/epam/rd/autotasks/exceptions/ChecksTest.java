package com.epam.rd.autotasks.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ChecksTest {
    private String message;

    @BeforeEach
    public void setUp() {
        this.message = "meeeessage";
    }

    @Test
    public void checkArgumentTest() {
        Assertions.assertDoesNotThrow(() -> Checks.checkArgument(true));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Checks.checkArgument(false));

        try {
            Assertions.fail();
            Checks.checkArgument(false, message);
        } catch (IllegalArgumentException illegalArgumentException) {
            Assertions.assertEquals(message, illegalArgumentException.getMessage());
        } catch (Throwable thr) {
            thr.printStackTrace();
            Assertions.fail("Threw wrong type exception " + thr.getMessage());
        }
    }

    @Test
    public void checkElementIndex() {
        Assertions.assertDoesNotThrow(() -> Checks.checkElementIndex(0, 10));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> Checks.checkElementIndex(11, 10));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> Checks.checkElementIndex(10, 10));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> Checks.checkElementIndex(-1, 10));
    }
}
