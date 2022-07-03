package com.narendra.array.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int nums[] = {6, 3, 9, 5, 2, 8};
        divide(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void divide(int num[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(num, si, mid);
        divide(num, mid + 1, ei);
        conquer(num, si, mid, ei);
    }

    public static void conquer(int num[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (num[idx1] <= num[idx2]) {
                merged[x++] = num[idx1++];
            } else {
                merged[x++] = num[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = num[idx1++];
        }

        while (idx2 <= ei) {
            merged[x++] = num[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            num[j] = merged[i];
        }
    }

}
