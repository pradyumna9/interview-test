package com.mycomp.array;
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

        You must implement a solution with a linear runtime complexity and use only constant extra space.



        Example 1:

        Input: nums = [2,2,1]
        Output: 1
*/

public class SingleNumberTest {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
//        int[] nums = {2,2,1};
        int[] nums = {4,1,2,1,2};

        System.out.println(singleNumber.getSingleNumber(nums));
    }
}

class SingleNumber{
    int getSingleNumber(int[] nums){
        int ans = 0;
        for(int i=0;i<nums.length;i++)
            ans = ans^nums[i];
        return ans;
    }
}
