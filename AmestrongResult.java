package com.p1.java8ex;

public class AmestrongResult {
    private static boolean isAmestrong(int n) {

        int len = String.valueOf(n).length();
        int num = String.valueOf(n).chars().map(dt -> Character.digit(dt, 10)).map(dt -> (int) Math.pow(dt, len)).sum();

        return num == n;
    }

    public static void main(String[] args) {
        System.out.println("Number is Amstrong :: " + isAmestrong(151));
    }
}