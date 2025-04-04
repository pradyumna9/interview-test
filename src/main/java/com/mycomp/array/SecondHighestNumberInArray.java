package com.mycomp.array;

import java.util.Arrays;
import java.util.Comparator;


public class SecondHighestNumberInArray {
    public static void main(String[] args) {
        int[] nums = {13, 45, 12, 2, 34, 8,45,2};

        int secondSmallestNumber = Arrays.stream(nums).sorted().distinct().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Invalid"));
        int secondHighestNumber = Arrays.stream(nums).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Invalid"));
        System.out.println("secondHighestNumber:"+secondHighestNumber);
        System.out.println("secondSmallestNumber:"+secondSmallestNumber);
    }
}
