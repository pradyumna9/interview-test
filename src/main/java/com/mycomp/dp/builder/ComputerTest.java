package com.mycomp.dp.builder;

import java.util.*;

public class ComputerTest {
    public static void main(String[] args) {
        //Identity HashMap

        //HashMap m = new HashMap();
        IdentityHashMap m =new IdentityHashMap();
        m.put(new Integer(10),"10-A");
        m.put(new Integer(10),"10-B");
        System.out.println(m);


    }
}
