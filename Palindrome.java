package com.p1.java8ex;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Is Palindrome No : " + isPalidromNumberByJava8(16461));
    }

    private static boolean isPalidromNumberByJava8(int i) {
        String value = String.valueOf(i);
        int len = value.length();
        boolean isPalindromeNumber = IntStream.range(0, len / 2)
                .anyMatch(index -> value.charAt(index) == value.charAt(len - index - 1));
        return isPalindromeNumber;
    }
}
