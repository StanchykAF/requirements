package ru.danka.exceptions.checker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StringCheckerTest {
    private Class[] classes = new Class[]{StringIsEmptyException.class, StringIsNullException.class, StringIsTooLongException.class};

    private StringChecker stringChecker;

    @BeforeAll
    void init() {
        stringChecker = new StringChecker(3);
    }

    @Test
    void checkTypes() {
        for (Class clazz : classes) {
            if (!Exception.class.isAssignableFrom(clazz)) {
                Assertions.fail(clazz.getSimpleName() + " is not exception.");
            }
        }
    }

    @Test
    void checkNotNull() {
        call(() -> stringChecker.isNotNull(null), StringIsNullException.class);
    }


    @Test
    void checkIsNotEmpty() {
        call(() -> stringChecker.isNotEmpty(""), StringIsEmptyException.class);
    }

    @Test
    void checkBig() {
        call(() -> stringChecker.isNormalSize("abcd"), StringIsTooLongException.class);
    }



    private void call(Callable<StringCheckerException> checkerExceptionCallable, Class exceptionClass) {
        try {
            checkerExceptionCallable.call();
            Assertions.fail("Exception didn't throwed");
        } catch (StringCheckerException e) {
            if ((Class) e.getClass() == exceptionClass) {
                Assertions.assertTrue(true);
            } else {
                Assertions.fail("Wrong exception required " + exceptionClass.getSimpleName() + " getted " + e.getClass().getSimpleName());
            }
        }
    }



    interface Callable<EXCEPTION extends Exception> {
        void call() throws EXCEPTION;
    }
}
