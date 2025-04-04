package com.mycomp.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArray {
    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] num2 = {4,5,6};
        //Using Java8
        int[] mergeArray = IntStream.concat(Arrays.stream(num1), Arrays.stream(num2)).toArray();
        //displayArray(mergeArray);


        //Using arrayCopy
        int[] merge = new int[num1.length+num2.length];
        System.arraycopy(num1,0,merge,0,num1.length);
        System.arraycopy(num2,0,merge,num1.length,num2.length);
        //displayArray(merge);

        //Traditional Approach

        int[] mergeTraditional = new int[num1.length+num2.length];
        for(int i=0;i<num1.length;i++){
            mergeTraditional[i]=num1[i];
        }
        for(int i=0;i<num2.length;i++){
            mergeTraditional[num1.length+i]=num2[i];
        }
        displayArray(mergeTraditional);
    }

    private static void displayArray(int[] mergeArray) {
        for (int i: mergeArray){
            System.out.println(i);
        }
    }
}
