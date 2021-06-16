package ru.danka.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class InternalExceptionTest {
    @Test
    void checkType() {
        Assertions.assertTrue(RuntimeException.class.isAssignableFrom(InternalException.class));
    }

    @Test
    void checkConstructor() throws NoSuchMethodException {
        Constructor<InternalException> constructor = InternalException.class.getConstructor(String.class);
        Assertions.assertTrue((constructor.getModifiers() & Modifier.PUBLIC) != 0, "Constructor must be public");
    }

    @Test
    void checkField() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<InternalException> constructor = InternalException.class.getConstructor(String.class);
        InternalException test58 = constructor.newInstance("test58");
        Assertions.assertEquals(test58.getMessage(), "test58");


    }


}
