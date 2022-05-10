package com.yogi.java.sortingalgorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();

    }

    public static void bubbleSort(int arr[]){

        for(int i = 0 ; i < arr.length-1 ; i++){
            for (int j = 0 ; j < arr.length-1; j++)
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                     arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
    }

    public static void test1(){
        int arr[] =  {64, 25, 12, 22, 11};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void test2(){
        int arr[] =  {6, 9, 4, 3, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void test3(){
        int arr[] =  {1, 2, 4, 0, -1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void test4(){
        int arr[] =  {6, 2, 2, 22, 11};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void test5(){
        int arr[] =  {4, 5, 1, 2, 11};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void test6(){
        int arr[] =  {0, 1, 3, 8, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void test7(){
        int arr[] =  {-1, -1, -1, -2, -1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void test8(){
        int arr[] =  {0, -2, 7, -1, -0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
