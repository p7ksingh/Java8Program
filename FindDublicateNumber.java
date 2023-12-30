package com.p1.java8ex;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDublicateNumber {
    public static void main(String[] args) {
        int a[] = { 1, 4, 5, 2, 12, 34, 2, 11 };
        System.out.println("Duplicate number by java 1.8 : " + findDuplicateNumberByJava1_8(a));

    }

    private static int findDuplicateNumberByJava1_8(int[] a) {
        Map<Integer, Long> map = Arrays.stream(a).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int dublicate = map.keySet().stream().filter(dt -> map.get(dt) > 1).findFirst().orElse(0);
        map.keySet().stream().filter(dt -> map.get(dt) > 1).forEach(System.out::println);
        return dublicate;
    }
}
