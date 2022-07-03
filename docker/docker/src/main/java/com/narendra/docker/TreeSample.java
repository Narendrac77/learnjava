package com.narendra.docker;

import sun.reflect.generics.tree.Tree;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TreeSample {

    class Tree {

        int value;

        Tree leftNode;
        Tree rightNode;

        Tree(int value) {
            this.value = value;
            this.leftNode = null;
            this.rightNode = null;
        }


    }


    public static void main(String[] args) {

    }

    //    1             1
    //
    // 2     3      2 , 3
    //
    //
    //   4 5    6    4 , 5, 6


    //         7

    static Queue<Tree> getQueue(Tree tree) {
        Queue<Tree> list = new LinkedList<>();

        list.add(tree.leftNode);
        list.add(tree.rightNode);


        return list;
    }

}
