package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Никита\\Documents\\IT\\JavaLessons\\MavenProjects\\Addition\\transport.json";
        String result =  new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
        System.out.println(checker(result));
    }

    public static boolean checker(String str) {
        LinkedList stack = new LinkedList();
        for (int i = 0; i < str.length(); ++i) {
            char chr = str.charAt(i);
            if (chr == '[' || chr == '{' || chr == '(') {
                stack.add(chr);
            } else if (chr == ']' || chr == '}' || chr == ')') {
                if (stack.size() == 0) {
                    return false;
                }
                char prevChar = stack.pop();
                switch (chr) {
                    case ']':
                        if (prevChar != '[') return false;
                        break;
                    case '}':
                        if (prevChar != '{') return false;
                        break;
                    case ')':
                        if (prevChar != '(') return false;
                        break;
                }
            }
        }
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }
}