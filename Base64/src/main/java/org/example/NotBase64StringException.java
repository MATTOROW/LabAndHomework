package org.example;

public class NotBase64StringException extends Exception {
    public NotBase64StringException() {
        super("Not valid cypher");
    }
}
