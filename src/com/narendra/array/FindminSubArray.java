package com.narendra.array;

public class FindminSubArray {

    public static void main(String[] args) {

        int nums[] = {  1, 2, 3, 1, 1, 4};
        int target = 7;
        int result = getMinimumArray(nums, target);
        System.out.println(result);

    }

    public static int getMinimumArray(int val[], int target) {
        int min_elements = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        int right = 0;
        while (right < val.length) {
            sum += val[right];
            if (sum >= target) {
                while (sum >= target) {
                    sum -= val[left];
                    left++;
                }
                min_elements = Integer.min(min_elements, right - left + 2);
            }
            right++;
        }

        return min_elements == Integer.MAX_VALUE ? 0 : min_elements;
    }

}
