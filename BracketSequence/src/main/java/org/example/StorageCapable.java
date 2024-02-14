package org.example;

public interface StorageCapable {
    void add(char e);
    void delete(int index) throws IndexOutOfBoundsException;
    char pop();
    char get(int index) throws IndexOutOfBoundsException;
    int size();
    void deleteAll(char e);
    int findFirst(char e);
}
