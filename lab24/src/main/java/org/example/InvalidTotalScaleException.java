package org.example;

public class InvalidTotalScaleException extends Exception {
    public InvalidTotalScaleException(int currentsc, int validsc) {
        super(String.format("Total has scale=%d instead of scale=%d", currentsc, validsc));
    }
}
