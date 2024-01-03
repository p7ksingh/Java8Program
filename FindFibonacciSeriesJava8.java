package com.example.demo;

import java.util.stream.Stream;

public class FindFibonacciSeriesJava8 {

    private static void findFibonacciSeries() {
        Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] }).limit(10).map(f -> f[0])
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        findFibonacciSeries();

    }
}
