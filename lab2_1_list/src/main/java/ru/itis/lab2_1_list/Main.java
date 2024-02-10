package ru.itis.lab2_1_list;

public class Main {
    public static void main(String[] args) throws EmptyElementException {
        List a = new List();
        a.add(Integer.valueOf(2));
        a.add(Integer.valueOf(3));
        a.add(Integer.valueOf(4));
        a.add(Integer.valueOf(5));
        a.delete(3);
        System.out.println(a.get(2));
        System.out.println(a.pop());
//        System.out.println(a.get(2));
        System.out.println("___________________________________________");

        LinkedList b = new LinkedList();
        b.add(Integer.valueOf(12));
        b.add(Integer.valueOf(10));
        b.add(Integer.valueOf(1));
        b.add(Integer.valueOf(19));
        System.out.println(b.size());
        b.delete(1);
        System.out.println(b.get(1));
    }
}