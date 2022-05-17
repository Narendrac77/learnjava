package com.narendra.array.day1;

public class ReverseAString {

    public static void main(String[] args) {
        ReverseAString string = new ReverseAString();
        string.test1();
    }

    public void test1(){
        System.out.println(recursive("Narendra"));
    }

    public  String recursive(String input){
        if(input.length() == 0)
            return "";
             return input.charAt(input.length() - 1) + recursive(input.substring(0, input.length() - 1));
        }
    }

