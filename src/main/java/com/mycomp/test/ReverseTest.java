package com.mycomp.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Reverse a string
 */
public class ReverseTest {
public static void main(String[] args) {
	String str = "madam";
//	StringBuilder sb = new StringBuilder(str);
//	StringBuffer sb = new StringBuffer(str);
//	System.out.println(sb.reverse());
	char[] charArray = str.toCharArray();
	for(int i=charArray.length-1;i>=0;i--) {
		System.out.print(charArray[i]);
	}
	//String reverse = str.chars().mapToObj(c->(char)c).reduce("", (s,c)->c+s,(s1,s2)->s1+s2);
	//System.out.println("Reverse: "+reverse);
	
	String reverse = Stream.of(str).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(""));
	System.out.println("Reverse: "+reverse);
	System.out.println(new ReverseTest().isPalindrome(charArray));
	
}
private String isPalindrome(char[]  word) {
	boolean palindrome = true;
	for(int a=0,b=word.length-1;a<=b;a++,b--) {
		if(word[a]!=word[b]) {
			palindrome = false;
		}
	}
	return palindrome?"Word is a Palindrome":"Word Not a palindrome";
}
}
