package ru.itis.lab2_1_list;

public interface StorageCapable<T> {
    void add(T e) throws EmptyElementException;
    void delete(int index) throws IndexOutOfBoundsException;
    T pop();
    T get(int index) throws IndexOutOfBoundsException;
    int size();
    void deleteAll(T e);
    int findFirst(T e);
}
