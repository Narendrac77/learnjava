package com.narendra.array;

import java.util.Scanner;

public class RverseAnInteger {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];*/
        test1();


    }

    public static void reverse(int A[], int N) {
        /*
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(A[i]+ " ");
        }*/

        int start = 0;
        int end = N-1;
        while(start < end){
         int temp = A[start];
          A[start] = A[end];
          A[end] = temp;
          start++;
          end--;
        }

        for (int i = 0; i < N; i++)
            System.out.print(A[i] + " ");
    }

    public static void test1() {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        System.out.println();
        int[] input = {3, 51, 54, 99, 32, 60, 76, 68, 39, 12, 26, 86, 94, 39, 95, 70, 34, 78, 67, 1, 97, 2, 17, 92, 52, 56, 1, 80, 86, 41, 65, 89, 44, 19, 40, 29, 31, 17, 97, 71, 81, 75, 9, 27, 67, 56, 97, 53, 86, 65, 6, 83, 19, 24, 28, 71, 32, 29, 3, 19, 70, 68, 8, 15, 40, 49, 96, 23, 18, 45, 46, 51, 21, 55, 79, 88, 64, 28, 41, 50, 93, 0, 34, 64, 24};
        reverse(input, input.length);
        System.out.println();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("total time taken to process");
        System.out.println((endTime - startTime) + "ms");
    }


}
