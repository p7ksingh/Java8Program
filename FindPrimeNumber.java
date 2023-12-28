package com.p1.java8demo;

import java.util.stream.IntStream;

//Prime numbers are natural numbers that are divisible by only 1 and the number itself
public class FindPrimeNumber {
    private static boolean isPrimeByJava8(int dt) {

        if ((dt == 0) || (dt == 1)) {
            return false;
        }
        if (dt == 2) {
            return true;
        }
        boolean isPrime = IntStream.rangeClosed(2, dt / 2).noneMatch(x -> dt % 2 == 0);
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(" Is Prime No : " + isPrimeByJava8(7));
    }
}
