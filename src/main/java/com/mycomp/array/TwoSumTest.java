package com.mycomp.array;

import java.util.stream.IntStream;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
* Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
* */
public class TwoSumTest {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] twoSum = twoSum(nums,9) ;
        for(int i=0;i<twoSum.length;i++){
            System.out.println(twoSum[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] num = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    num = new int[]{i, j};
                }
            }
        }
      return num;
    }
}
