package org.example;

import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static boolean checkForPalindrome(String input) {
        if (input == null) return false;

        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> stack = new LinkedList<>();

        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        for (char c : cleaned.toCharArray()) {
            if (c != stack.pop()) return false;
        }

        return true;
    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?")); // true
        System.out.println(checkForPalindrome("hello")); // false
        System.out.println(convertDecimalToBinary(13)); // 1101
    }
}
