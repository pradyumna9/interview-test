package com.mycomp.test;

import java.util.Arrays;
import java.util.List;

public class IntArrayReverseTest {

	public static void main(String[] args) {
		int size = 10;
		int pos =7;
		int input[] = new int[] {12,111,8,9,5,4,2,21,23,31,21};
		//expected output
		//{8,111,12,9,5,4,2,21,23,31,21};
		
		//List<Integer> intList = Arrays.asList(input);
		
		int temp = input[0];
		input[0] = input[pos];
		input[pos] = temp;
		
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i] + " ");
		}
	}
}
