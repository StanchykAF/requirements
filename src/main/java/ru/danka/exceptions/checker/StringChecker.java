package ru.danka.exceptions.checker;

public class StringChecker {
    private int maxSize;

    public StringChecker(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * Check if value == null
     * @param value
     * @throws StringCheckerException if value is null
     */
    public void isNotNull(String value) throws StringCheckerException {

    }

    /**
     * Check value is not empty (also check non null)
     * @param value
     * @throws StringCheckerException if value is null or empty
     */
    public void isNotEmpty(String value) throws StringCheckerException {

    }

    /**
     * Check for value.size() < maxSize
     * @param value
     * @throws StringCheckerException if value.size() >= maxSize
     */
    public void isNormalSize(String value) throws StringCheckerException {

    }
}
