package com.mycomp.array;


public class ValidPalindromeTest {
    public static void main(String[] args) {
        String s = ".***0aba0.*?.....";

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(s));
        System.out.println(palindrome.isPalindrome1(s));
        System.out.println(palindrome.isPalindromeUsingRec(s));
    }
}

class Palindrome{
    public boolean isPalindrome(String s) {
        String str = convertStringToValidAlphaNumeric(s);
        StringBuffer buffer = new StringBuffer(str);
        String reverse = buffer.reverse().toString();
        return reverse.equals(str);
    }

    public boolean isPalindromeUsingRec(String s){
        int l=0;
        int r= s.length()-1;
        return isPalindromeUsingRecursion(s,l,r);
    }

    public boolean isPalindromeUsingRecursion(String s,int l,int r){
        if(l>=r)
            return true;
        if(!Character.isLetterOrDigit(s.charAt(l)))
           return  isPalindromeUsingRecursion(s,l+1,r);
        if(!Character.isLetterOrDigit(s.charAt(r)))
           return isPalindromeUsingRecursion(s,l,r-1);
        if(s.charAt(l)!=s.charAt(r))
            return false;
        return isPalindromeUsingRecursion(s,l+1,r-1);
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
