package com.epam.rd.autotasks.exceptions;

public class Conditions {
    public static void checkArgument(boolean value) {
        checkArgument(value, "value is null");
    }

    public static void checkArgument(boolean value, String message) {
        if (!value) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkNotNull(Object obj) {
        Utils.requireNonNull(obj);
    }


    public static void checkElementIndex(int index, int size) {
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException("Index can't be " + index);
        }
    }

}
