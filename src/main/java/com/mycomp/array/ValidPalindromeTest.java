package com.mycomp.array;


public class ValidPalindromeTest {
    public static void main(String[] args) {
        String s = "0aba0";
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(s));
        System.out.println(palindrome.isPalindrome1(s));
    }
}

class Palindrome{
    public boolean isPalindrome(String s) {
        String str = convertStringToValidAlphaNumeric(s);
        StringBuffer buffer = new StringBuffer(str);
        String reverse = buffer.reverse().toString();
        return reverse.equals(str);
    }

    public String convertStringToValidAlphaNumeric(String s){
        return s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
    }

    public boolean isPalindrome1(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i)))
                ++i;
            while(i<j && !Character.isLetterOrDigit(s.charAt(j)))
                --j;
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
            ++i;
            --j;
        }
        return true;
    }
}
