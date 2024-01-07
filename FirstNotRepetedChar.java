package com.java8.dises;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//Write a program to print the First Not Repeated Char in string.
public class FirstNotRepetedChar {
    public static void main(String[] args) {
        String input = "Java Stream API is very good concept";  
        Character firstNotRepetedChar = input.chars().mapToObj(x -> Character.toUpperCase((char) x))//converting the object format
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))//find duplicate freq in linkedHashMap
        .entrySet().stream().filter(x -> x.getValue() == 1L).map(x -> x.getKey()).findFirst().get();//filtering the freq which is not first time
    System.out.println("First Not Repeated Char: " + firstNotRepetedChar);
    }
}
