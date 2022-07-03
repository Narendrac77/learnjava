package com.narendra.docker.test;

public class Test4 {

    public static void main(String[] args) {
      /*  char ch[] = {'a', 'b', 'c'};
        int in[] = new int[]*/

        //  charCheck(new char[]{'a', 'b', 'c'});

        String s = "aabbbbbcccd";
        char ch[] = s.toCharArray();
        //  charCheck(ch);
        //charCheckTwo(ch);
        charCheckThree("abaasass");
    }

    public static void charCheck(char input[]) {

        char c[] = new char[256];
        for (int i = 0; i < c.length; i++) {
            c[i] = 1;
        }
        for (char ch : input) {
            int in = ch;
            int value = c[in];
            // System.out.println(value);
            //c[in] = value+1;
            c[in] = (char) (value + 1);
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] != 1) {
                char ch = (char) i;
                int value = c[i];
                System.out.println(ch);
                System.out.println(value);
            }
        }

    }

    public static void charCheckTwo(char input[]) {
        StringBuilder stringBuilder = new StringBuilder();
        char c[] = new char[256];
        for (int i = 0; i < c.length; i++) {
            c[i] = 0;
        }
        for (char ch : input) {
            int in = ch;
            int value = c[in];
            // System.out.println(value);
            //c[in] = value+1;
            c[in] = (char) (value + 1);
        }
        for (int i = 0; i < c.length; i++) {
            char ch = (char) i;
            if (c[i] == 1) {
                stringBuilder.append(ch);
            }
            if (c[i] > 1) {

                int value = c[i];
                stringBuilder.append(ch);
                stringBuilder.append(value);
            }
        }
        System.out.println(stringBuilder);
    }

    public static void charCheckThree(String message) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(message.charAt(0));
        int count = 1;
        for (int i = 1; i < message.length(); i++) {
            char curr = message.charAt(i);
            char prev = message.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    stringBuilder.append(count);
                    count = 1;
                }
                stringBuilder.append(curr);
            }
        }
        if(count > 1){
            stringBuilder.append(count);
            count = 1;
        }
        System.out.println(stringBuilder);
    }
}
