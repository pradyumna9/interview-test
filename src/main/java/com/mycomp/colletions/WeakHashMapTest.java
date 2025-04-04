package com.mycomp.colletions;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapTest {

    public static void main(String[] args) throws InterruptedException {
        Temp t = new Temp();
//        HashMap hashMap = new HashMap();
        WeakHashMap hashMap = new WeakHashMap();
        hashMap.put(t,100);
        System.out.println(hashMap);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(hashMap);
    }
}

class Temp{
    public String toString(){
        return "TEMP";
    }

    public void finalize(){
        System.out.println("Garbage Collector called....");
    }
}
