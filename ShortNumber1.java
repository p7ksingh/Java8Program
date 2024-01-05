package com.java8.dises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//find 2nd higest number
public class ShortNumber1 {
    public static void main(String[] args) {
        int[] a = { 5, 8, 3, 78, 54, 21, 17, 90 };
        Arrays.stream(a).boxed().sorted(Comparator.naturalOrder()).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
