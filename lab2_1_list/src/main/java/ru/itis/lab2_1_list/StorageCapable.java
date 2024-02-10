package ru.itis.lab2_1_list;

public interface StorageCapable {
    void add(Integer e) throws EmptyElementException;
    void delete(int index) throws IndexOutOfBoundsException;
    Integer pop();
    Integer get(int index) throws IndexOutOfBoundsException;
    int size();
}
