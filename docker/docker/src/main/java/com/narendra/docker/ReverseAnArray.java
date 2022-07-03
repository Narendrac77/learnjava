package com.narendra.docker;
import java.util.ArrayList;
import java.util.List;

public class ReverseAnArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
       /* list.add(1);
         list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);*/
        list.add(-1);
        list.add(-100);
        list.add(3);
        list.add(99);
        System.out.println(rotate(list,2));


    }

    public static List<Integer> rotate(List<Integer> nums, int offset) {

        int arr[] = new int[nums.size()];
        for(int i =0; i < nums.size(); i++){
            arr[i] = nums.get(i);
        }

        for(int i = 0; i < offset; i++){
            int j, last;
            last = arr[arr.length - 1];
            for(j = arr.length-1; j > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
            result.add(arr[i]);
        }
        return result;
    }
}
