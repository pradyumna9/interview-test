package com.mycomp.string;

import java.util.stream.IntStream;
/*Specifically, ans is the concatenation of two nums arrays.

        Return the array ans.



        Example 1:

        Input: nums = [1,2,1]
        Output: [1,2,1,1,2,1]
        Explanation: The array ans is formed as follows:
        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
        - ans = [1,2,1,1,2,1]
        Example 2:

        Input: nums = [1,3,2,1]
        Output: [1,3,2,1,1,3,2,1]
        Explanation: The array ans is formed as follows:
        - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
        - ans = [1,3,2,1,1,3,2,1]*/
public class ConcatinationOfTwoNumberTest {
    public static void main(String[] args) {
        int[] num={1,2,3};
        ConcatinationOfTwoNumber concatinationOfTwoNumber = new ConcatinationOfTwoNumber();
      IntStream.of(concatinationOfTwoNumber.getConcatenation(num)).forEach(System.out::println);
    }
}

class ConcatinationOfTwoNumber {
    public int[] getConcatenation(int[] nums) {

        int ans[] = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}
