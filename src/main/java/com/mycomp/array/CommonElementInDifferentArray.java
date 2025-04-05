package com.mycomp.array;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementInDifferentArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,9,8,9};
        int[] num2 = {3,4,5,6,9,8,9,9};

        List<Integer> collect = Arrays.stream(num1).filter(num -> Arrays.stream(num2).anyMatch(n -> num == n)).distinct().boxed().collect(Collectors.toList());

        //Another Approach optimize Way

        Set<Integer> num2Set = Arrays.stream(num2).boxed().collect(Collectors.toSet());
        List<Integer> result = Arrays.stream(num1).filter(num2Set::contains).boxed().distinct().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(result);
    }
}
