package com.narendra.narendra;

public class Hours {

    public static void main(String[] args) {
     stringChallenge(45);
    }

    public static void stringChallenge(int num) {
        int quotient = 0, reminder = 0;
        quotient = num / 60;
        reminder = num % 60;
        System.out.println(quotient + ":" + reminder);
    }


}
