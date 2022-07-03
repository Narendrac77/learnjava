package com.narendra.interfaceBY;

public class MainI implements A, B{

    public static void main(String[] args) {
        A a = new MainI();
        a.print();
    }

    @Override
    public void print() {
        System.out.println("Main");
    }
}
