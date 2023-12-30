package com.p1.java8ex;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumbers1 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 2, 7, 8, 3, 9, 10, 5, 1 };

        printDuplicateNumbers(numbers);
    }

    private static void printDuplicateNumbers(int[] numbers) {
        // Create a HashMap to store the count of each number
        Map<Integer, Integer> numberCountMap = new HashMap<>();

        // Iterate through the array and update the count in the HashMap
        for (int num : numbers) {
            if (numberCountMap.containsKey(num)) {
                // If the number is already present, increment the count
                numberCountMap.put(num, numberCountMap.get(num) + 1);
            } else {
                // If the number is encountered for the first time, add it to the HashMap with
                // count 1
                numberCountMap.put(num, 1);
            }
        }

        // Iterate through the HashMap and print numbers with count greater than 1
        System.out.println("Duplicate Numbers:");
        for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
