package com.narendra.array.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int input[] = {22, 21, 20, 7, 2, 4, 3, 5, 1, 8, 9, 6, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        bubbleSort(input);
        System.out.println(Arrays.toString(input));
    }

    public static void bubbleSort(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                count++;
            }
        }
        System.out.println(" Total Number of Iterations: " + count);
    }
}
