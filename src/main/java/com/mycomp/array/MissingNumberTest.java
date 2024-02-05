package com.mycomp.array;

public class MissingNumberTest {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(new MissingNumber().missingNumber(nums));
    }
}
class MissingNumber{
    public int missingNumber(int[] nums) {

        int length = nums.length;
        int sumTotal = (length * (length +1))/2;
        int sumNow = 0;
        for(int i = 0; i< length; i++){
            sumNow += nums[i];
        }
        return sumTotal-sumNow;
    }
}
