package com.prep.datastructures;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by z001hk8 on 4/25/17.
 */
public class BinarySearchTreeTest {

    @Test
    public void insertIntoBinarySearchTree() {

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(2);
        bst.insert(3);

        BSTNode testNode1 = new BSTNode(2);
        assertEquals(testNode1.key, bst.search(2).key);

        BSTNode testNode2 = new BSTNode(3);
        assertEquals(testNode2.key, bst.search(3).key);
    }
}
