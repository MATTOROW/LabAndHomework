package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mas = {4, 5, 7, 10, 12, 23, 100};
        int num;
        try {
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            System.out.println(findNearest(mas, num));
        } catch (LessThanMinNumberException | NegativeNumberException e) {
                System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error input");
        }
    }

    public static int findNearest(int[] masssive, int num) throws LessThanMinNumberException, NegativeNumberException {
        int[] razn = new int[masssive.length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < masssive.length; ++i) {
            razn[i] = num - masssive[i];
            if (min > razn[i] && razn[i] > 0) {
                min = razn[i];
            }
        }

        if (razn[0] < 0) {throw new LessThanMinNumberException();}
        if (num < 0) {throw new NegativeNumberException();}
        return num - min;
    }
}