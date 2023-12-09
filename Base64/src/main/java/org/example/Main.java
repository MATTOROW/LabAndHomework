package org.example;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Base64.encrypt("Hello I am Vlad Dom"));
        System.out.println(Arrays.toString(Base64.decryptToBinaryMas(Base64.encrypt("Никита"))));
        System.out.println(Base64.decryptToString(Base64.encrypt("Никита")));
        try {
            System.out.println(Arrays.toString("Никита".getBytes("cp866")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}