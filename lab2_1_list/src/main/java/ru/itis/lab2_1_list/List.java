package ru.itis.lab2_1_list;

public class List implements StorageCapable {
    private int size = 0;
    private int capacity = 2;
    private Integer[] massive = new Integer[capacity];

    public List() {
    }

    public List(int size) {
        massive = new Integer[size];
        capacity = size + 10;
    }

    public List(Integer[] massive) {
        this.massive = massive;
        size = massive.length;
        capacity = massive.length * 2;
    }

    public void add(Integer e) throws EmptyElementException {
        if (e == null) {
            throw new EmptyElementException();
        }
        if (size == capacity) {
            Integer[] tmp = new Integer[capacity * 2];
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

    public Integer pop() {
        if (this.size == 0) {
            return null;
        }
        size--;
        return massive[this.size];
    }

    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return massive[index];
    }

    public int findFirst(Integer e) {
        int tmpInd = -1;
        for (int i = 0; i < size; ++i) {
            if (massive[i].equals(e)) {
                return i;
            }
        }
        return tmpInd;
    }

    public void deleteAll(Integer e) {
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
