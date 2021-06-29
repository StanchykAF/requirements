package com.epam.rd.autotasks.exceptions;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Utils {
    public static void requireNonNull(Object obj) {
        requireNonNull(obj, "obj is null");
    }

    public static void requireNonNull(Object obj, String message) {
        if (obj == null) {
            throw new NullPointerException(message);
        }
    }

    public static String toString(Object object) {
        return object.toString();
    }

    public static String toString(Supplier<Object> supplier) {
        return toString(supplier.get());
    }

    public static boolean equals(Object object1, Object object2) {
        return object1.equals(object2);
    }
}
