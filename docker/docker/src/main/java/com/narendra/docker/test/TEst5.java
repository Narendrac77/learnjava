package com.narendra.docker.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TEst5 {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2, 3, 4, 6, 7, 8, 9, 5, 1);
        Comparator<Integer> in = (o1, o2) -> {
            if(o1 > o2){
                return 1;
            }
            else
                return  -1;
        };
      //  Collections.reverse(values, in);
        System.out.println(values);

    }
}
