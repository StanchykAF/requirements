package com.epam.rd.autotasks.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PreconditionsTest {
    private String message;

    @BeforeEach
    public void setUp() {
        this.message = "meeeessage";
    }

    @Test
    public void checkArgumentTest() {
        try {
            Preconditions.checkArgument(true);
        } catch (Throwable thr) {
            thr.printStackTrace();
            Assertions.fail("Threw exception on true value " + thr.getMessage());
        }

        try {
            Preconditions.checkArgument(false);
        } catch (IllegalArgumentException illegalArgumentException) {

        } catch (Throwable thr) {
            thr.printStackTrace();
            Assertions.fail("Threw wrong type exception " + thr.getMessage());
        }

        try {
            Preconditions.checkArgument(false, message);
        } catch (IllegalArgumentException illegalArgumentException) {
            Assertions.assertEquals(message, illegalArgumentException.getMessage());
        } catch (Throwable thr) {
            thr.printStackTrace();
            Assertions.fail("Threw wrong type exception " + thr.getMessage());
        }
    }

    @Test
    public void checkElementIndex() {
        try {
            Preconditions.checkElementIndex(0, 10);
        } catch (Throwable thr) {
            thr.printStackTrace();
            Assertions.fail("Threw exception on wrong value " + thr.getMessage());
        }

        try {
            Preconditions.checkElementIndex(11, 10);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {

        } catch (Throwable thr) {
            thr.printStackTrace();
            Assertions.fail("Threw exception on wrong value " + thr.getMessage());
        }


        try {
            Preconditions.checkElementIndex(10, 10);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {

        } catch (Throwable thr) {
            thr.printStackTrace();
            Assertions.fail("Threw exception on wrong value " + thr.getMessage());
        }

        try {
            Preconditions.checkElementIndex(-1, 10);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {

        } catch (Throwable thr) {
            thr.printStackTrace();
            Assertions.fail("Threw exception on wrong value " + thr.getMessage());
        }
    }
}
