package com.narendra.leetcode.AddTwoNodes;

public class MedianTwoSortedArrays {

    public static void main(String[] args) {
       test1();
    }

    public static void test1(){
        int nums1[] = {1, 3, 4};
        int nums2[] = {2, 5, 6};
        double result = median(nums1, nums2);
        System.out.println(result);
    }

    public static void test2(){
        int nums1[] = {1, 3, 4};
        int nums2[] = {2, 5, 6};
        double result = median(nums1, nums2);
        System.out.println(result);
    }

    public static double median(int nums1[], int nums2[]) {
        //we just want to define nums1 is small than nums2
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int m = nums1.length;
        int n = nums2.length;
        // the total numbers in left bound (m + n + 1) / 2
        // in case of over bound
        int leftTotal = m + (n - m + 1) / 2;
        int left = 0;
        int right = m;
        // we only find dividing line in nums1 and the line in num2 will move together
        // bfs here
        while (left < right) {
            int i = left + (right - left + 1) / 2;
            int j = leftTotal - i;
            if (nums1[i - 1] > nums2[j]) {
                right = i - 1;
            } else {
                left = i;
            }
        }
        int nums1Divide = left;
        int nums2Divide = leftTotal - nums1Divide;
        // case 2
        int nums1LeftMax = nums1Divide == 0 ? Integer.MIN_VALUE : nums1[nums1Divide - 1];
        int nums1RightMin = nums1Divide == m ? Integer.MAX_VALUE : nums1[nums1Divide];
        // case 3
        int nums2LeftMax = nums2Divide == 0 ? Integer.MIN_VALUE : nums2[nums2Divide - 1];
        int nums2RightMin = nums2Divide == n ? Integer.MAX_VALUE : nums2[nums2Divide];

        if ((m + n) % 2 == 1) { // odd number
            return Math.max(nums1LeftMax, nums2LeftMax);
        } else {
            return (double) (Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin)) / 2;
        }
    }

}
