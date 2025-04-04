package com.mycomp.colletions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        String[] str ={"Z","X","A","X","C"};
        Arrays.sort(str,(a,b)->-a.compareTo(b));
        //Arrays.sort(str);
        int c = Arrays.binarySearch(str, "A",(a,b)->-a.compareTo(b));
        System.out.println("Binary : "+ c);
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
        List strings = Arrays.asList(str);
        int b = Collections.binarySearch(strings, "?");
        System.out.println(strings);
        System.out.println(b);
    }
}
