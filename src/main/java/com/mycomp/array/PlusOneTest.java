package com.mycomp.array;

import java.util.Stack;
import java.util.stream.IntStream;

public class PlusOneTest {
    public static void main(String[] args) {
        int[] digits ={9,9};
        PlusOne plusOne = new PlusOne();
        int[] ints = plusOne.plusOneTrad(digits);
        IntStream.of(ints).forEach(System.out::println);
    }
}

class PlusOne{
    public int[] plusOne(int[] digits) {
        int power = digits.length-1;
        long sum =0;
        for(int i=0;i<digits.length;i++){
            sum +=digits[i]* Math.pow(10,power);
            --power;
        }
        long result =sum+1;
        Stack<Long> stack = new Stack<>();
        while(result!=0){
            long digit = result%10;
            stack.push(digit);
            result= result/10;
        }
        int[] ints = new int[stack.size()];
        for(int i=0;i<ints.length;i++){
            ints[i] = Math.toIntExact(stack.pop());
        }
        return ints;


    }

    public int[] plusOneTrad(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}
