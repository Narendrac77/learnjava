package com.narendra.array;

import java.util.Arrays;

public class SortTheArray {

    public static void main(String[] args) {
        int arr[] = {5, 7, 3, 2, 6, 4, 1, 8, 9, 10, 11, 12, 13, 14, 20, 15, 16, 17, 18, 19};
        Arrays.sort(arr);
        long startTime = System.currentTimeMillis();
        int output[] = sortArr(arr, arr.length) ;
        long endTime = System.currentTimeMillis();
        System.out.println("Array Sorted in "+ (endTime - startTime) + "ms");
        System.out.println(Arrays.toString(output));
    }
    static int[] sortArr(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = 1; j < n-i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if(flag == false)
                break;

        }
        return arr;
    }
}
