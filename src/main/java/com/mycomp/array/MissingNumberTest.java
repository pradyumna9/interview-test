package com.mycomp.array;

import java.util.Arrays;

public class MissingNumberTest {
    public static void main(String[] args) {
       // int[] nums = {3,0,1};
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(new MissingNumber().missingNumber(nums));
        System.out.println(new MissingNumber().usingXor(nums));
    }
}
class MissingNumber{
    public int missingNumber(int[] nums) {

        int length = nums.length;
        int sumTotal = (length * (length +1))/2;
        int sumNow = Arrays.stream(nums).sum();
        return sumTotal-sumNow;
    }
/*Binary XOR operation where
            0 xor 0 0
            1 xor 1 0
            1 xor 0 1
            0 xor 1 1 */
    public int usingXor(int[] nums) {

        int ans = nums.length;
        for(int i = 0; i< nums.length; i++){
           ans = ans^( i^nums[i]);
        }
        return ans;
    }
}
