package com.narendra.array.day1;

//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
public class MinimumNMaximum {

    static class Pair {
        int min;
        int max;

        Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }

    }

    public static void main(String[] args) {
     int nums[] = {1000, 11, 445, 1, 330, 3000};
     Pair result = getMinimumNMaximum(nums,nums.length);
        System.out.println("minimum element: " + result.min+ " maximum element: " + result.max);
    }

    static Pair getMinimumNMaximum(int nums[], int n) {
        int min = 0;
        int max = 0;

        int i = 0;
        if (n == 1) {
            return new Pair(nums[0], nums[0]);
        }
        if (n == 2) {
            if (nums[0] > nums[1])
                return new Pair(nums[1], nums[0]);
            else
                return new Pair(nums[0], nums[1]);
        }

        if (n % 2 == 0) {
           /* min = nums[0];
            max = nums[1];
            i = 2;
        } else if (n % 2 != 0) {
            min = nums[0];
            max = nums[0];
            i = 1;*/
            if (nums[0] > nums[1]) {
                max = nums[0];
                min = nums[1];
            }
            else {
                max = nums[1];
                min = nums[0];
            }
            i = 2;
            }
        else if(n % 2 != 0){
            min = nums[0];
            max = nums[0];
            i = 1;
        }

//1000, 11, 445, 1, 330, 3000
        while (i < n - 1) {
            if (nums[i] > nums[i + 1]) {
                if (nums[i] > max)
                    max = nums[i];
                else if(nums[i+1] < min)
                    min = nums[i+1];
            } else {
                if (nums[i+1] > max)
                    max = nums[i+1];
                else if(nums[i] < min)
                    min = nums[i];
            }
            i += 2;
        }
        return new Pair(min, max);
    }


}
