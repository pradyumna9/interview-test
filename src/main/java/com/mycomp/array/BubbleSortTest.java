package com.mycomp.array;

import java.util.stream.IntStream;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] nums = {5, 2, 1, 7, 9, 3, 5};
        BubbleSort bubbleSort = new BubbleSort();
        IntStream.of(bubbleSort.sort(nums)).forEach(System.out::println);

    }
}

class BubbleSort {
    public int[] sort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for(int j=0; j< nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = 0;
        temp = nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
    }
}