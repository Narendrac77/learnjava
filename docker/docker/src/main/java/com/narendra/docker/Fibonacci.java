package com.narendra.docker;

import java.util.Arrays;
import java.util.Collections;

///8 5 3 2 1 1 0
//8 5 3 2 1 1
//8 5 3 2 1
//8 5 3 2
//8 5 3
//8 5
//8
public class Fibonacci {

    public static void main(String[] args) {
        print(10);
    }

    public static void print(int n) {
        int result[] = new int[n];


        int index = 0;
        result[index] = 0;
        result[++index] = 1;        // 0 1
        for (int i = 2; i < n; i++) {
            result[++index] = result[index - 1] + result[index - 2];
        }

        //System.out.println(Arrays.toString(result));

        int start = 0, end = result.length - 1;

        while (start <= end) {
            int temp = result[end];
            result[end] = result[start];
            result[start] = temp;
            start++;
            end--;
        }

        // System.out.println(Arrays.toString(result));


        for (int i = result.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(result[j] + " ");
            }
            System.out.println();
        }

    }
}
