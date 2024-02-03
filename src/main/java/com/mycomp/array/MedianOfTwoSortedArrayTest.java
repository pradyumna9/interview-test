package com.mycomp.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MedianOfTwoSortedArrayTest {
    public static void main(String[] args) {
        MedianOfTwoSortedArray medianOfTwoSortedArray = new MedianOfTwoSortedArray();
        int[] num1 = {1, 3};
        int[] num2 = {2, 2};
        System.out.println(medianOfTwoSortedArray.getMedian(num1, num2));
        System.out.println(medianOfTwoSortedArray.getMedianInTraditionalWay(num1, num2));
        System.out.println(medianOfTwoSortedArray.getMedianInTraditionalWayWithTraditionalSort(num1, num2));
    }
}

class MedianOfTwoSortedArray {
    public double getMedian(int[] a, int[] b) {
        double median = 0.0;
        int[] mergeArray = Arrays.stream(IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray()).sorted().toArray();
        int size = mergeArray.length;
        if (size % 2 == 0) {
            double middle1 = mergeArray[size / 2 - 1];
            double middle2 = mergeArray[size / 2];

            median = (middle1 + middle2) / 2;
        } else {
            median = mergeArray[size / 2];
        }
        return median;
    }

    public double getMedianInTraditionalWay(int[] a, int[] b) {

        int i = 0, j = 0, k = 0;
        double median = 0;
        int sizeOfA = a.length;
        int sizeOfB = b.length;

        int[] merge = new int[sizeOfA + sizeOfB];

        while (i < sizeOfA) {
            merge[k] = a[i];
            i++;
            k++;
        }
        while (j < sizeOfB) {
            merge[k] = b[j];
            j++;
            k++;
        }
        Arrays.sort(merge);
        int lengthOfMerge = merge.length;
        if (lengthOfMerge % 2 == 0) {
            double middle1 = merge[lengthOfMerge / 2 - 1];
            double middle2 = merge[lengthOfMerge / 2];

            median = (middle1 + middle2) / 2;
        } else {
            median = merge[lengthOfMerge / 2];
        }
        return median;
    }

    public double getMedianInTraditionalWayWithTraditionalSort(int[] a, int[] b) {

        int i = 0, j = 0, k = 0;
        double median = 0;
        int sizeOfA = a.length;
        int sizeOfB = b.length;

        int[] merge = new int[sizeOfA + sizeOfB];

        while (i < sizeOfA) {
            merge[k] = a[i];
            i++;
            k++;
        }
        while (j < sizeOfB) {
            merge[k] = b[j];
            j++;
            k++;
        }

        int m = 0, n = 0;
        for (m = 0; m < merge.length; m++) {
            for (n = 1; n < merge.length - m; n++) {
                if (merge[n - 1] > merge[n]) {
                    int temp = merge[n - 1];
                    merge[n - 1] = merge[n];
                    merge[n] = temp;

                }
            }
        }
        int lengthOfMerge = merge.length;
        if (lengthOfMerge % 2 == 0) {
            double middle1 = merge[lengthOfMerge / 2 - 1];
            double middle2 = merge[lengthOfMerge / 2];

            median = (middle1 + middle2) / 2;
        } else {
            median = merge[lengthOfMerge / 2];
        }
        return median;
    }
}

