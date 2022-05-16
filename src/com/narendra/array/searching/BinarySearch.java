package com.narendra.array.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target) {

       /* int start = 0;
    while(start < nums.length){
     if(nums[start] == target){
         return start;
     }
        start++;
    }
        return -1;
        */

        return binarySearch(nums, 0, nums.length - 1, target);

    }

    public static int binarySearch(int nums[], int left, int right, int target) {
       if(right >= left) {
           int mid = left + (right - left) / 2;
           if (nums[mid] == target) {
               return mid;
           }

           if (target > nums[mid])
               return binarySearch(nums, mid + 1, right, target);
           else if (target < nums[mid])
               return binarySearch(nums, left, mid - 1, target);
       }
        return -1;
    }

}
