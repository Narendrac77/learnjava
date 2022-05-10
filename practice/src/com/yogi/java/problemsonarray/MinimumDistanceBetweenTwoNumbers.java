package com.yogi.java.problemsonarray;

public class MinimumDistanceBetweenTwoNumbers {

    //public  static arraymin(){


    //}

    public static void main(String args[]) {

        test1();
        test2();
        test3();
        test4();
        test5();

    }

    public static int minimumDistance(int arr[], int x, int y) {
        int pointer1 = -1, pointer2 = -1;
        int minimumDistance = -1, difference = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                pointer1 = i;
            if (arr[i] == y)
                pointer2 = i;
            if (pointer1 != -1 && pointer2 != -1 && pointer2 > pointer1) {
                difference = Math.abs(pointer1 - pointer2);
                if(minimumDistance == -1)
                    minimumDistance = difference;
               minimumDistance = Math.min(minimumDistance, difference);
            }
        }
        return minimumDistance;
    }

    public static void test1() {
        int n = 4;
        int arr[] = {1, 2, 3, 2};
        int x = 1;
        int y = 2;
        int i = minimumDistance(arr, x, y);
        System.out.println("result of test1: " + i);
    }

    public static void test2() {
        int n = 4;
        int arr[] = {86, 39, 90, 67, 84, 66, 62};
        int x = 42;
        int y = 12;
        int i = minimumDistance(arr, x, y);
        System.out.println("result of test2: " + i);
    }

    public static void test3() {
        //int n = 4;
        int arr[] = {11, 10, 90, 67, 84, 66, 62};
        int x = 42;
        int y = 12;
        int i = minimumDistance(arr, x, y);
        System.out.println("result of test3: " + i);
    }


    public static void test4() {
        int arr[] = {11, 10, 90, 67, 84, 66, 62, 42, 12};
        int x = 42;
        int y = 12;
        int i = minimumDistance(arr, x, y);
        System.out.println("result of test4: " + i);
    }

    public static void test5() {
        int arr[] = {43, 10, 90, 67, 12, 66, 62, 45, 42};
        int x = 42;
        int y = 12;
        int i = minimumDistance(arr, x, y);
        System.out.println("result of test5: " + i);
    }

}
