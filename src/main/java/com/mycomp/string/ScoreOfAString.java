package com.mycomp.string;
/*You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

        Return the score of s.



        Example 1:

        Input: s = "hello"

        Output: 13

        Explanation:

        The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.*/
public class ScoreOfAString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.scoreOfString("hello");
    }
}

class Solution {
    public int scoreOfString(String s) {
        char[] str = s.toCharArray();
        int sum = 0;
        for (int i = 1; i < str.length; i++) {
            sum = sum + abs(str[i - 1] - str[i]);
            System.out.println("SUM"+sum);
        }
        return sum;
    }

    public int abs(int num){
       return  num<0?-1*num:num;
    }
}
