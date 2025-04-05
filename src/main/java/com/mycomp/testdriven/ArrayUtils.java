package com.mycomp.testdriven;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayUtils {
    public List<Integer> reverseArray(int[] input) {
        return Arrays.stream(Optional.ofNullable(input).orElseThrow(() -> new IllegalArgumentException("Array Cannot Be Null")))
                    .boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public int maxNumber(int[] input){
        return Arrays.stream(Optional.ofNullable(input).orElseThrow(() -> new IllegalArgumentException("Invalid Array")))
                .max().stream().findFirst().orElseThrow(() -> new RuntimeException("Array not having any value"));
    }
}
