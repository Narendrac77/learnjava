package com.narendra.docker;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Hacker {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 1, 4, 5, 6, 3, 2);
        int result = countDuplicate(list);
        System.out.println(result);
    }


    public static int countDuplicate(List<Integer> numbers) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.size() ; i++){
            if(map.containsKey(numbers.get(i)))
                map.put(numbers.get(i), numbers.get(i)+1);
            else
                map.put(numbers.get(i), 1);
        }

        int count = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1)
                count++;
        }
        return count;

    }

    public static String compressedString(String message) {
        // Write your code here
        String s = String.valueOf(message.charAt(0));
        for(int i = 1; i < message.length(); i++){
            char curr = message.charAt(i);

        }
        return s;
    }
}
