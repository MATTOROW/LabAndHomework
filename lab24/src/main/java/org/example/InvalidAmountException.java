package org.example;

public class InvalidAmountException extends Exception {
    public InvalidAmountException() {
        super("Amount should be greater than 0");
    }
}
