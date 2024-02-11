package com.mycomp.array;

public class RainWaterProblemTest {

    public static void main(String[] args) {
       // int[] nums = {3,2,1,3,1,3,2};
        int[] nums = {3,1,2,4,0,1,3,2};
        RainWaterProblem rainWaterProblem = new RainWaterProblem();
        System.out.println(rainWaterProblem.getAmountOfWaterAbsorbed(nums));
    }
}

class RainWaterProblem{

    public int getAmountOfWaterAbsorbed(int[] nums){
        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        left[0] = nums[0];
        for(int i=1;i< length;i++){
            left [i] = Math.max(left[i-1],nums[i]);
        }
        right[length-1] = nums[length-1];
        for(int i=length-2;i>=0;i--){
            right[i] = Math.max(right[i+1],nums[i]);
        }
        int ans = 0;
        for(int i =0;i<length;i++){
            ans += Math.min(left[i], right[i]) - nums[i];
        }
        return ans;
    }
}
