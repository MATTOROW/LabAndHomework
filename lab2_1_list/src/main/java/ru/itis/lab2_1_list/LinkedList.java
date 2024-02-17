package ru.itis.lab2_1_list;

public class LinkedList<T> implements StorageCapable<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public LinkedList() {
    }

    public LinkedList(T[] massive) throws EmptyElementException {
        for (int i = 0; i < massive.length; ++i) {
            this.add(massive[i]);
        }
    }

    public void add(T e) throws EmptyElementException {
        if (e == null) {
            throw new EmptyElementException();
        }
        if (size == 0) {
            head = new Node<T>(e);
            tail = head;
        } else {
            Node<T> tmp = new Node<T>(e);
            tmp.setPrev(tail);
            tail.setNext(tmp);
            tail = tail.getNext();
        }
        size++;
    }

    public void delete(int index) throws IndexOutOfBoundsException {
        Node<T> tmp = head;
        for (int i = 0; i < index; ++i) {
            tmp = tmp.getNext();
        }
        Node<T> prev = tmp.getPrev();
        Node<T> next = tmp.getNext();
        if (next != null) {
            next.setPrev(prev);
        }
        if (prev != null) {
            prev.setNext(next);
        }
        if (tmp == head) {
            head = tmp.getNext();
        }
        size--;
    }

    public T pop() {
        if (size == 0) {
            return null;
        }
        tail.getPrev().setNext(null);
        T tmp = tail.getValue();
        tail = tail.getPrev();
        size--;
        return tmp;
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> tmp = head;
        for (int i = 0; i < index; ++i) {
            tmp = tmp.getNext();
        }
        return tmp.getValue();
    }

    public int findFirst(T e) {
        int tmpInd = -1;
        Node<T> tmp = head;
        for (int i = 0; i < size; ++i) {
            if (tmp.getValue().equals(e)) {
                return i;
            }
            tmp = tmp.getNext();
        }
        return tmpInd;
    }

    public void deleteAll(T e) {
        for (int i = 0; i < size; ++i) {
            if (this.get(i).equals(e)) {
                this.delete(i);
                i--;
            }
        }
    }

    public int size() {
        return size;
    }
}
