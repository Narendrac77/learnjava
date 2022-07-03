package com.narendra.docker;

import java.util.Set;
import java.util.TreeSet;

public class TestAddMain {
    public static void main(String[] args) {
        TestAdd myAdd = new TestAdd("firstName1","lastName1");
        TestAdd myAdd2 = new TestAdd("firstName2","lastName2");

        Set<TestAdd> treeSet = new TreeSet<>();
        treeSet.add(myAdd2);
        treeSet.add(null);
        treeSet.add(myAdd);

        for (TestAdd t: treeSet  ) {
            System.out.println(t);
        }
    }
}
