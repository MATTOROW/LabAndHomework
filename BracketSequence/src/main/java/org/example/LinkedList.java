package org.example;

public class LinkedList implements StorageCapable {
    private Node head;
    private Node tail;
    private int size = 0;

    public LinkedList() {
    }

    public LinkedList(char[] massive) {
        for (int i = 0; i < massive.length; ++i) {
            this.add(massive[i]);
        }
    }

    public void add(char e) {
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

    public char pop() {
        if (tail.getPrev() != null) tail.getPrev().setNext(null);
        char tmp = tail.getValue();
        tail = tail.getPrev();
        size--;
        return tmp;
    }

    public char get(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node tmp = head;
        for (int i = 0; i < index; ++i) {
            tmp = tmp.getNext();
        }
        return tmp.getValue();
    }

    public int findFirst(char e) {
        int tmpInd = -1;
        Node tmp = head;
        for (int i = 0; i < size; ++i) {
            if (tmp.getValue() == e) {
                return i;
            }
            tmp = tmp.getNext();
        }
        return tmpInd;
    }

    public void deleteAll(char e) {
        for (int i = 0; i < size; ++i) {
            if (this.get(i) == e) {
                this.delete(i);
                i--;
            }
        }
    }

    public int size() {
        return size;
    }
}
