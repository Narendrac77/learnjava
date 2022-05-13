package com.narendra.array;

public class Sample {

    public static void main(String[] args) {
        String input = "3 51 54 99 32 60 76 68 39 12 26 86 94 39 95 70 34 78 67 1 97 2 17 92 52 56 1 80 86 41 65 89 44 19 40 29 31 17 97 71 81 75 9 27 67 56 97 53 86 65 6 83 19 24 28 71 32 29 3 19 70 68 8 15 40 49 96 23 18 45 46 51 21 55 79 88 64 28 41 50 93 0 34 64 24";
        String output[] = input.split(" ");
        System.out.print("[");
        for (String w: output ) {
            System.out.print(Integer.parseInt(w)+", ");
        }
        System.out.println("]");
    }
}
