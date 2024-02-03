package com.mycomp.array;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/*Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".



        Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.*/
public class LongestCommonPrefixTest {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"PRAD","PR","P"};
        System.out.println(longestCommonPrefix.getLongestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix.getLongestCommonPrefix(strs2));
    }


}

class LongestCommonPrefix{
    public String getLongestCommonPrefix(String[] s){
        int size = s.length;
        if(size==0) return "";
        if(size==1) return s[0];
        Arrays.sort(s);
        int minimumLength = Math.min(s[0].length(),s[size-1].length());
        int i=0;
        while(i<minimumLength && s[0].charAt(i)==s[size-1].charAt(i)) i++;
        return s[0].substring(0,i);
    }
}
