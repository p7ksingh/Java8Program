package com.p1.java8ex;

//Armstrong number is the number in any given number base, which forms the total of the same number,
//when each of its digits is raised to the power of the number of digits in the number.
public class AmstrongNumb {

    public static void main(String[] args) {
        System.out.println("Is Armstrong Number : " + isArmstrongNumberByJava8(371));
    }

    private static boolean isArmstrongNumberByJava8(int n) {
        int len = String.valueOf(n).length();
        int sum = String.valueOf(n).chars().map(ch -> Character.digit(ch, 10))
                .map(digit -> (int) Math.pow(digit, len))
                .sum();
        return sum == n;
    }
}