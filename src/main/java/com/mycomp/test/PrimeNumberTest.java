package com.mycomp.test;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumberTest {

	public static void main(String[] args) {
		PrimeNumberTest pm = new PrimeNumberTest();
		System.out.println(pm.isPrime(119));
		System.out.println(pm.isPrimejava8(19));
		IntStream.iterate(0, i -> i + 2).limit(10);
		
		
		
		IntStream.rangeClosed(0, 5).forEach(PrimeNumberTest::doSomething);
		
		
		
	}
	
	private boolean isPrime(int n) {
		if(n==0 && n==1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		for(int x=2;x<n/2;x++) {
			if(n%x == 0) {
				return false;
			}
		}
		return true;
	}
	private boolean isPrimejava8(int n) {
		IntPredicate isDivisible = index -> n%index ==0;
		return n>1 && IntStream.range(2, n/2).noneMatch(isDivisible);
	}
	
	public static void  doSomething(int i) {
		System.out.println("Number:"+i);
	}
}
