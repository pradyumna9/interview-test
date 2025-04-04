package com.mycomp.array;

import java.util.Arrays;
import java.util.Comparator;


public class MaxStringLengthInArray {
    public static void main(String[] args) {
        String[] str = {"apple","apricot","lit","Watermelon"};
        fetchMinimumStringInTheArray(str);
        fetchMinimumStringInTheArrayInOptimizedWay(str);
    }

    private static void fetchMinimumStringInTheArray(String[] str) {
        int i = Arrays.stream(str).mapToInt(String::length).min().orElse(0);
        String valueOftheString = Arrays.stream(str).filter(str1 -> str1.length() == i).findFirst().orElseThrow(() -> new IllegalArgumentException("Invalid String"));
        System.out.println("Highest String number:"+i);
        System.out.println(valueOftheString);
    }

    private static void fetchMinimumStringInTheArrayInOptimizedWay(String[] str) {
        String shortestString = Arrays.stream(str).min(Comparator.comparingInt(String::length)).orElseThrow(() -> new IllegalArgumentException("Wrong Input"));
        System.out.println("Shortest String:"+shortestString);
        System.out.println("Shortest String Length:"+shortestString.length());


    }
}
