package com.p1.java8ex;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 7, 8, 3, 9, 10, 5};

        printDuplicateNumbers(numbers);
    }

    private static void printDuplicateNumbers(int[] numbers) {
        System.out.println("Duplicate Numbers:");

        // Iterate through the array
        for (int i = 0; i < numbers.length - 1; i++) {
            // Check each element with every other element in the array
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    // If a duplicate is found, print it
                    System.out.println(numbers[i]);
                    break;  // Break to avoid printing the same duplicate multiple times
                }
            }
        }
    }
}
