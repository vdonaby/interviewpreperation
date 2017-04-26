package com.prep.datastructures;

/**
 * Created by z001hk8 on 4/25/17.
 */

public class BinarySearchTree {

    BSTNode root;

    public void insert(int value) {

        BSTNode newNode = new BSTNode(value);

        if(root == null) {
            root = newNode;
        } else {
            BSTNode currentNode = root;
            BSTNode parent;

            while(true) {
                parent = currentNode;
                if(value < currentNode.key) {
                    currentNode = currentNode.left;

                    if(currentNode == null) {
                        parent.left = newNode;
                        return;
                    }

                } else {
                    currentNode = currentNode.right;
                    if(currentNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public BSTNode search(int value) {
        BSTNode currentNode = root;

        while(currentNode.key != value) {

            if(value < currentNode.key) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }

            if(currentNode == null) {
                return null;
            }
        }

        return currentNode;
    }
}
