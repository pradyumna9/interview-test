package com.mycomp.array;

public class HappyNumber {

    public boolean isHappy(int n) {
      int slow = square(n);
      int fast = square(square(n));
      while(slow!=fast){
          slow = square(slow);
          fast = square(square(fast));
      }
        return slow==1;
    }

    public int square(int n){
        int sum =0;

        while(n>0){
            int d = (n%10);
            n = n/10;
            sum+=d*d;
        }
        return sum;
    }
}

class HappyNumberTest{
    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        happyNumber.isHappy(12);

    }
}
