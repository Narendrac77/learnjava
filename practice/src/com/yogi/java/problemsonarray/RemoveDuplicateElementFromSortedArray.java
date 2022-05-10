package com.yogi.java.problemsonarray;

public class RemoveDuplicateElementFromSortedArray {

    public static void main(String args[]) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        /*System.out.println(" Approach Two");
        test7();
        test8();
        test9();
        test10();
        test11();
        test12();*/
    }

    public static void removeDuplicateElements(int arr[]) {
        int firstElement = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[firstElement] != arr[i]) {
                System.out.print(arr[firstElement]);
                System.out.print(" ");
                firstElement = i;
            }
        }
        System.out.print(arr[firstElement]);
    }

    public static int removeDuplicateElementsTwo(int A[]) {
        int k = 1;
        int firstElement = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[firstElement] != A[i]) {
                A[k] = A[i];
                k++;
                firstElement = i;
            } else {
                A[i] = 999;
            }
        }
        return k;
    }

    public static void test1() {
        System.out.println("test 1");
        int arr[] = {1, 2, 2, 3};
        removeDuplicateElements(arr);
    }
    public static void test2() {
        System.out.println();
        System.out.println("============================");
        System.out.println("test 2");
        int arr[] = {0, 1, 1, 1, 3, 3};
        removeDuplicateElements(arr);
    }

    public static void test3() {
        System.out.println();
        System.out.println("============================");
        System.out.println("test 3");
        int arr[] = {0, 0, 0, 0};
        removeDuplicateElements(arr);
    }

    public static void test4() {
        System.out.println();
        System.out.println("============================");
        System.out.println("test 4");
        int arr[] = {88888, 999999};
        removeDuplicateElements(arr);
    }

    public static void test5() {
        System.out.println();
        System.out.println("============================");
        System.out.println("test 5");
        int arr[] = {3, 3, 3, 3, 3, 4, 5};
        removeDuplicateElements(arr);
    }
    public static void test6() {
        System.out.println();
        System.out.println("============================");
        System.out.println("test 6");
        int arr[] = {2, 2, 2, 3,4};
        removeDuplicateElements(arr);
    }

    public static void test7() {
        System.out.println("test 7");
        int arr[] = {1, 2, 2, 3};
        System.out.println(removeDuplicateElementsTwo(arr));
    }
    public static void test8() {
        System.out.println();
        System.out.println("============================");
        System.out.println("test 8");
        int arr[] = {0, 1, 1, 1, 3, 3};
        System.out.println(removeDuplicateElementsTwo(arr));
    }

    public static void test9() {
        System.out.println();
        System.out.println("============================");
        System.out.println("test 9");
        int arr[] = {0, 0, 0, 0};
        System.out.println(removeDuplicateElementsTwo(arr));
    }

    public static void test10() {
        System.out.println();
        System.out.println("============================");
        System.out.println("test 10");
        int arr[] = {88888, 999999};
        System.out.println(removeDuplicateElementsTwo(arr));    }

    public static void test11() {
        System.out.println();
        System.out.println("============================");
        System.out.println("test 11");
        int arr[] = {3, 3, 3, 3, 3, 4, 5};
        System.out.println(removeDuplicateElementsTwo(arr));
    }
    public static void test12() {
        System.out.println();
        System.out.println("============================");
        System.out.println("test 12");
        int arr[] = {2, 2, 2, 3,4};
        System.out.println(removeDuplicateElementsTwo(arr));
    }

}
