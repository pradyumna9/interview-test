package com.mycomp.test;

public class StringContainsVowelTest {

	public static void main(String[] args) {
		StringContainsVowelTest stringContainsVowelTest = new StringContainsVowelTest();
		System.out.println(stringContainsVowelTest.isContainVowel("Hello"));
		System.out.println(stringContainsVowelTest.isContainVowel("xklo"));
	}
	boolean isContainVowel(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}
}

