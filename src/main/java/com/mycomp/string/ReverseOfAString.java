package com.mycomp.string;

public class ReverseOfAString {

    public String reverseOfPrefix(String str,char ch){
        int indexOfChar = str.indexOf(ch)+1;
        return  new StringBuilder(str.substring(0,indexOfChar)).reverse().append(str.substring(indexOfChar)).toString();
    }

    public String reverseOfPrefixTraditional(String str,char ch){
        int indexOfChar = str.indexOf(ch)+1;
        String rightPart = str.substring(indexOfChar);

        String leftPart = str.substring(0,indexOfChar);
        return reverse(leftPart)+rightPart;
    }

    private  String reverse(String str){
        String reverse = "";
        for(int i=0;i<str.length();i++){
            reverse = str.charAt(i)+reverse;
        }
        return reverse;
    }


}


