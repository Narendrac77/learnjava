package com.yogi.java.problemsonarray;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayTwo {

    public static void main(String[] args) {
        test();
        test2();
        testThree();
        testFour();
    }

    public static void removeDuplicates(int nums[]) {
        int startIndex = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[startIndex] != nums[i]) {
                startIndex++;
                nums[startIndex] = nums[i];
            }
            if (i == n - 1) {
                for (int j = startIndex; j < n - 1; j++) {
                    startIndex++;
                    nums[startIndex] = -1;
                }
            }

        }
    }

    public static int removeDuplicatesTwo(int[] nums) {
        int start = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                start++;
                nums[start] = nums[i];
            }
        }
        return start + 1;

    }

    public static void test() {
        int nums[] = {1, 1, 2};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void testThree() {
        int nums[] = {1, 1, 2};
        int i = removeDuplicatesTwo(nums);
        System.out.println(i);
        System.out.println(Arrays.toString(nums));
    }

    public static void test2() {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void testFour() {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = removeDuplicatesTwo(nums);
        System.out.println(i);
        System.out.println(Arrays.toString(nums));
    }


}
