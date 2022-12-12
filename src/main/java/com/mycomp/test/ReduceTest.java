package com.mycomp.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReduceTest {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .stream();

        Integer lastElement = stream.reduce((first, second) -> second)
                .orElse(-1);

        System.out.println(lastElement);
    }
}
