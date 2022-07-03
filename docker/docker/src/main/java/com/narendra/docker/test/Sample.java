package com.narendra.docker.test;
// Question: For the given string such as "aabbbbbcc" print the longest occurring character,
// index and number of times it occurs.

import java.util.HashMap;
import java.util.Map;

//longest occurring character is b and length is 5 at index 2.
public class Sample {

    public static void main(String[] args) {
        longestOccurence("aabbbbbcc");

    }

    public static void longestOccurence(String input) {
        // char ch[] =input.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        char ch[] = input.toCharArray();
        for (char c : ch) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            }
            else{
                map.put(c, map.get(c)+1);
            }


        }
        System.out.println(map);
        int maxOccurence = 0;
        char maxOccurenceChar = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxOccurence) {
                maxOccurenceChar = entry.getKey();
                maxOccurence = entry.getValue();
            }
        }
         int index = input.indexOf(maxOccurenceChar);
        System.out.println(maxOccurenceChar + " " + maxOccurence+ " " + index);
    }
        /*char chIn[] = new char[256];
        for(int i = 0; i < chIn.length; i++){
            chIn[i] = 1;
        }

        for (int i = 0; i < ch.length; i++){
            chIn[input.charAt(i)++]

        }*/


}

