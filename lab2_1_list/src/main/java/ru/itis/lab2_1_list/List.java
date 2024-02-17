package ru.itis.lab2_1_list;

public class List<T> implements StorageCapable<T> {
    private int size = 0;
    private int capacity = 2;
    private Object[] massive = new Object[capacity];

    public List() {
    }

    public List(int size) {
        massive = new Object[size];
        capacity = size + 10;
    }

    public List(T[] massive) {
        this.massive = massive;
        size = massive.length;
        capacity = massive.length * 2;
    }

    public void add(T e) throws EmptyElementException {
        if (e == null) {
            throw new EmptyElementException();
        }
        if (size == capacity) {
            Object[] tmp = new Object[capacity * 2];
            System.arraycopy(massive, 0, tmp, 0, size);
            massive = tmp;
            capacity *= 2;
        }
        massive[size] = e;
        size++;
    }

    public void delete(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; ++i) {
            massive[i] = massive[i + 1];
        }
        size--;
    }

    public T pop() {
        if (this.size == 0) {
            return null;
        }
        size--;
        return (T) massive[this.size];
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (T) massive[index];
    }

    public int findFirst(T e) {
        int tmpInd = -1;
        for (int i = 0; i < size; ++i) {
            if (massive[i].equals(e)) {
                return i;
            }
        }
        return tmpInd;
    }

    public void deleteAll(T e) {
        for (int i = 0; i < size; ++i) {
            if (massive[i].equals(e)) {
                this.delete(i);
                i--;
            }
        }
    }

    public int size() {
        return size;
    }
}
