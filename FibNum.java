package com.example.demo;

public class FibNum {
    static long getFebNum(int n) {
        long a = 0, b = 1, c;
//syspuy
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
        System.out.println(getFebNum(10));
    }
}
