package com.mycomp.array;
/*There are N people standing in a circle numbered from 1 to N. Also given an integer K. First, count the K-th number starting from the first one and delete it. Then K numbers are counted starting from the next one and the K-th one is removed again, and so on. The process stops when one number remains. The task is to find the last number.

        Examples:

        Input: N = 6, K = 2
        Output: 5*/
public class JosephusProblemTest {
    public static void main(String[] args) {
        JosephusProblem josephusProblem = new JosephusProblem();
        System.out.println(josephusProblem.josephusGunWinner(5,3));
    }
}

class JosephusProblem {
    public int josephusGunWinner(int n,int k) {
       if(n==1)
           return 0;
      return (josephusGunWinner(n-1,k)+k)%n;
    }
}
