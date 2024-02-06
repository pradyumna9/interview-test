package com.mycomp.array;

public class LengthOfLastWordTest {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.getLengthOfLastWord(s));
    }
}
class LengthOfLastWord{
    public int getLengthOfLastWord(String s){
        String[] str = s.split(" ");
        return str[str.length-1].length();
    }
}
