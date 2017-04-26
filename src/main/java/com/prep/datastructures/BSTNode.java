package com.prep.datastructures;

/**
 * Created by z001hk8 on 4/25/17.
 */

public class BSTNode {

    int key;
    String name;
    BSTNode left;
    BSTNode right;

    BSTNode(int key) {
        this.key = key;
    }

    BSTNode(int key, String name) {
        this.key = key;
        this.name = name;
    }
}
