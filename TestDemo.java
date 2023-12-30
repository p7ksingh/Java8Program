package com.p1.java8ex;

public class TestDemo {
    static void printDublicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 3, 8, 10, 1 };
        printDublicate(arr);
    }

}
