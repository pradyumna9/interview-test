package com.mycomp.array;

public class Max3Number {
    public int thirdMax(int[] nums) {
        long max1,max2,max3;
        max1=Long.MIN_VALUE;
        max2=Long.MIN_VALUE;
        max3=Long.MIN_VALUE;
        for(int num:nums){
            if(num>max1){
                max3=max2;
                max2=max1;
                max1=num;
            }
            else if(num< max1 && num>max2){
                max3=max2;
                max2=num;
            }
            else if(num>max3 && num<max2){
                max3=num;
            }

        }
        return max3==Long.MIN_VALUE?(int)max2:(int)max3;
    }
}
class Max3NumberTest{
    public static void main(String[] args) {
       // int[] intValue = {1,3,4,5,5,6,3,3};
        int[] intValue = {1,1,1,1,2};
        Max3Number max3Number = new Max3Number();
        System.out.println(max3Number.thirdMax(intValue));
    }
}
