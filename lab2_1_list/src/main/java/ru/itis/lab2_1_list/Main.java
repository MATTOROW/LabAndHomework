package ru.itis.lab2_1_list;

public class Main {
    public static void main(String[] args) throws EmptyElementException {
//        List a = new List();
//        a.add(Integer.valueOf(2));
//        a.add(Integer.valueOf(3));
//        a.add(Integer.valueOf(4));
//        a.add(Integer.valueOf(5));
//        a.delete(3);
//        System.out.println(a.get(2));
//        System.out.println(a.pop());
//        System.out.println(a.get(2));
//        System.out.println("___________________________________________");
//
//        LinkedList b = new LinkedList();
//        b.add(Integer.valueOf(12));
//        b.add(Integer.valueOf(10));
//        b.add(Integer.valueOf(1));
//        b.add(Integer.valueOf(19));
//        System.out.println(b.size());
//        b.delete(1);
//        System.out.println(b.get(1));
//        System.out.println("_____________________________________________");

        List c = new List(new Integer[] {1, 2, 3, 2, 3, 1, 1});
        System.out.println(c.findFirst(Integer.valueOf(23)));
        c.deleteAll(Integer.valueOf(1));
        System.out.println(c.size());
        System.out.println(c.get(0));
        System.out.println("_______________________________________________");

        LinkedList d = new LinkedList(new Integer[] {1, 2, 3, 4, 5, 1, 6, 1, 1, 2, 3, 2});
        System.out.println(d.findFirst(Integer.valueOf(6)));
        d.deleteAll(Integer.valueOf(1));
        System.out.println(d.size());
        System.out.println(d.get(5));
    }
}