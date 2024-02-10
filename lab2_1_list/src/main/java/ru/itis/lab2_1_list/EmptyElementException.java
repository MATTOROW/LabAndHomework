package ru.itis.lab2_1_list;

public class EmptyElementException extends Exception {
    public EmptyElementException() {
        super("Your element is empty!");
    }
}
