package com.narendra.array.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int input[] = {22, 21, 20, 7, 2, 4, 3, 5, 1, 8, 9, 6, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        SelectionSort(input);
        System.out.println(Arrays.toString(input));
    }

    public static void SelectionSort(int nums[]) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
                count++;
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        System.out.println("Number of iterations required: "+ count);
    }
}
