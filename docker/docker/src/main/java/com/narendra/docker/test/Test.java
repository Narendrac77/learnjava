package com.narendra.docker.test;

import java.util.HashMap;
import java.util.Map;

//Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order,
// return a sorted array of only the integers that appeared in all three arrays in O(n). Make sure the time complexity is met.
//Example 1:
//Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
//Output: [1,5]
//Explanation: Only 1 and 5 appeared in the three arrays.
//**/"
public class Test {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 5, 7, 9};
        int arr3[] = {1, 3, 4, 5, 8};
        int output[] = maxOccur(arr1, arr2, arr3);


    }

    public static int[] maxOccur(int[] arr1, int[] arr2, int[] arr3) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], 1);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                map.put(arr2[i], map.get(arr2[i]) + 1);
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            if (map.containsKey(arr3[i])) {
                map.put(arr3[i], map.get(arr3[i]) + 1);
            }
        }
        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 3) {
                System.out.println(entry.getKey());
            }
        }

        return null;
    }

}
