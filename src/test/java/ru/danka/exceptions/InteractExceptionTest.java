package ru.danka.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InteractExceptionTest {
    @Test
    void checkType() {
        Assertions.assertTrue(Exception.class.isAssignableFrom(InteractException.class));
    }



}
