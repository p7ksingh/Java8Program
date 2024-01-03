package com.example.demo;

public class FindFibonacciSeries {
    public static int fibNumber(int n) {
        int a = 0;
        int b = 1;
        int c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {

        int fibNumber = fibNumber(9);
        System.out.println(fibNumber);
    }
}
