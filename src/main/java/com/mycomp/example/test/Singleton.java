package com.mycomp.example.test;

public class Singleton {
    private static Singleton singleton = null;
    private static Singleton singleton2 = null;
    private Singleton(){
        //no-args
    }
    public static Singleton getSingleton(){
        if(singleton==null){
          singleton = new Singleton();
          return  singleton;
        } else if (singleton2 == null) {
            singleton2=new Singleton();
            return singleton2;

        }
        else{
            return Math.random()<0.5?singleton2:singleton;
        }
    }
}


class SingletonTest {
     public static void main(String[] args) {
         Singleton singleton = Singleton.getSingleton();
         Singleton singleton1 = Singleton.getSingleton();
         Singleton singleton2 = Singleton.getSingleton();
         Singleton singleton3 = Singleton.getSingleton();
         System.out.println(singleton.hashCode());
         System.out.println(singleton1.hashCode());
         System.out.println(singleton2.hashCode());
         System.out.println(singleton3.hashCode());

     }
 }


