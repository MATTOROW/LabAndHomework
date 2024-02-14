package ru.itis.lab2_1_list;

public class LinkedList implements StorageCapable {
    private Node head;
    private Node tail;
    private int size = 0;

    public LinkedList() {
    }

    public LinkedList(Integer[] massive) throws EmptyElementException {
        for (int i = 0; i < massive.length; ++i) {
            this.add(massive[i]);
        }
    }

    public void add(Integer e) throws EmptyElementException {
        if (e == null) {
            throw new EmptyElementException();
        }
        if (size == 0) {
            head = new Node(e);
            tail = head;
        } else {
            Node tmp = new Node(e);
            tmp.setPrev(tail);
            tail.setNext(tmp);
            tail = tail.getNext();
        }
        size++;
    }

    public void delete(int index) throws IndexOutOfBoundsException {
        Node tmp = head;
        for (int i = 0; i < index; ++i) {
            tmp = tmp.getNext();
        }
        Node prev = tmp.getPrev();
        Node next = tmp.getNext();
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

    public Integer pop() {
        if (size == 0) {
            return null;
        }
        tail.getPrev().setNext(null);
        Integer tmp = tail.getValue();
        tail = tail.getPrev();
        size--;
        return tmp;
    }

    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node tmp = head;
        for (int i = 0; i < index; ++i) {
            tmp = tmp.getNext();
        }
        return tmp.getValue();
    }

    public int findFirst(Integer e) {
        int tmpInd = -1;
        Node tmp = head;
        for (int i = 0; i < size; ++i) {
            if (tmp.getValue().equals(e)) {
                return i;
            }
            tmp = tmp.getNext();
        }
        return tmpInd;
    }

    public void deleteAll(Integer e) {
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
