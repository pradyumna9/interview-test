package com.mycomp.array;
/*Given an integer x, return true if x is a
        palindrome
        , and false otherwise.



        Example 1:

        Input: x = 121
        Output: true
        Explanation: 121 reads as 121 from left to right and from right to left.*/
public class PalindromeTest {
    public static void main(String[] args) {
        System.out.println(isPalindrome(19191));
        System.out.println(pureIntWay(121));
    }
    public static boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        StringBuilder buffer = new StringBuilder(number);
        String reverse = buffer.reverse().toString();
        return number.equals(reverse);
    }

    public static boolean pureIntWay(int x) {
        int number;
        int temp = 0;
        int original = x;
       while(x>0){
           number = x % 10;
           temp = temp * 10 + number;
           x = x/10;
       }
        return temp == original;
    }
}
