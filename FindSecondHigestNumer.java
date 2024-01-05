package com.java8.dises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//find the second-highest number in an array.
public class FindSecondHigestNumer {
    public static void main(String[] args) {
        int[] a = { 3, 6, 32, 1, 8, 5, 31, 22 };
        IntStream stream = Arrays.stream(a);
        Stream<Integer> boxed = stream.boxed();
        Stream<Integer> no = boxed.sorted(Comparator.reverseOrder()).skip(2);
        Integer integer = no.findAny().get();
        System.out.println(integer);
    }
}
