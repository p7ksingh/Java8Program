package com.p1.java8ex;

public class FindArmstrongNumber {
    // check is number is Armstrong or not
    public static boolean isArmstrongNumber(int num) {
        int originalNumber, reminder, result = 0, n = 0;

        originalNumber = num;

        // find number of digits
        while (originalNumber != 0) {
            originalNumber = originalNumber / 10;
            n = n + 1;

        }
        originalNumber = num;

        // find power
        while (originalNumber != 0) {
            reminder = originalNumber % 10;
            double powerResult = Math.pow(reminder, n);
            result = (int) (result + powerResult);

            originalNumber = originalNumber / 10;
        }

        return result == num;
    }

    public static void main(String[] args) {
        boolean armstrongNumber = isArmstrongNumber(153);
        System.out.println(armstrongNumber);
    }
}
