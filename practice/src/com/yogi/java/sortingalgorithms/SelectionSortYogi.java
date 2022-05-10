package com.yogi.java.sortingalgorithms;

import java.util.Arrays;

public class SelectionSortYogi {

   /* public static void main(String args[]) {

        int a[] = {4, 3, 2, 0, 9};

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - 1; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(a));

    }

}


    public static void main(String args[]){

        int a[]={4,3,2,0,9};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }

            }

        }
        System.out.println(Arrays.toString(a));8/

    */


        public static void main(String args[]){

            int a[]={4,3,2,0,9};
            for(int i=0;i<a.length;i++)
            {
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]>a[j]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;

                    }

                }

            }
            System.out.println(Arrays.toString(a));

        }

    }



