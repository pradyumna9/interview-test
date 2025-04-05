package com.mycomp.array;

/*
Shift the element from the given Number
*/
public class ArrayTest {
	public static void main(String[] args) {
		int[] test = {1,2,3,4,5,6,7};
		int d=9;
		
		
		for (int i=0;i<d;i++) {
			int temp,j;
			temp=test[0];
			for( j=0;j<test.length-1;j++) {
				//System.out.println("i =>"+i+" j==>"+j + " test[i]==>"+test[i]+ " test[j]"+ test[j]);
				test[j]=test[j+1];}
				test[test.length-1]=temp;
			
		}
		for(int i=0;i<test.length;i++) {
			System.out.print(test[i]+" ");
		}
	}

}

