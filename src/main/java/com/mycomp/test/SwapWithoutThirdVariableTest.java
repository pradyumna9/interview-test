package com.mycomp.test;

public class SwapWithoutThirdVariableTest {

	public static void main(String[] args) {
		int x= 20;
		int y = 12;
		
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println("X:"+x+" Y:"+y);
	}
}
