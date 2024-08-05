package com.mycomp.example.test;

public final class ImmutableCls {
    private int i;

    public ImmutableCls(int i) {
        this.i = i;
    }

    public ImmutableCls modify(int i){
        if(this.i == i){
            return this;
        }
        else{
            return new ImmutableCls(i);
        }
    }
}

class Test{
    public static void main(String[] args) {
        ImmutableCls i = new ImmutableCls(10);
        ImmutableCls i2 = i.modify(100);
        ImmutableCls i3 = i.modify(10);
        ImmutableCls i4 = i.modify(100);
        System.out.println(i==i2);
        System.out.println(i==i3);
        System.out.println(i2==i4);
    }
}
