package com.mycomp.array;
/*
Example 1:

        Input: nums = [1,1,2]
        Output: 2, nums = [1,2,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
        It does not matter what you leave beyond the returned k (hence they are underscores).
*/

public class RemoveDuplicateFromSortedArrayTest {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray = new RemoveDuplicateFromSortedArray();
       System.out.println(removeDuplicateFromSortedArray.removeDuplicateFromSortedArray(nums));
       // System.out.println(removeDuplicateFromSortedArray.removeDuplicates(nums));
       // System.out.println(removeDuplicateFromSortedArray.removeDuplicatesNum(nums));
    }
}

class RemoveDuplicateFromSortedArray {

    public int removeDuplicatesNum(int[] nums) {
        int size = nums.length;
        int j= 0;
        int result[] = new int[size];
        for(int i=0;i<size-1;i++){
            if(nums[i]!=nums[i+1])
                result[j++]= nums[i] ;
        }
        result[j++] = nums[size-1];
        for(int i=0;i<j;i++){
            nums[i]=result[i];
        }
        return nums.length;
    }


    public int removeDuplicateFromSortedArray(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        int k=0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]){
                result[k++] = nums[i];
            }
        }
        result[k++] = nums[size-1];
        int[] newArray = new int[k];

        for (int l = 0; l < k; l++) {
            newArray[l] = result[l];
        }

        return newArray.length;
    }

     int removeDuplicates(int arr[])
    {
        int n = arr.length;
        // Return, if array is empty or
        // contains a single element
        if (n == 0 || n == 1)
            return n;

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)

            // If current element is not equal to next
            // element then store that current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];

        // Store the last element as whether it is unique or
        // repeated, it hasn't stored previously
        temp[j++] = arr[n - 1];

        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }

}
