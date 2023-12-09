package org.example;

public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Your number less than zero!");
    }
}
