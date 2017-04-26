package com.prep.datastructures;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by z001hk8 on 4/25/17.
 */
public class LinkedListTest {

    @Test
    public void insertIntoLinkedList() {

        LinkedList linkedListTest = new LinkedList();

        linkedListTest.insert(5);
        linkedListTest.insert(4);
        linkedListTest.insert(3);

        System.out.println("Linked list contents: " + linkedListTest.toString());

        LinkNode testLinkNode1 = new LinkNode(5);
        assertEquals(testLinkNode1.data, linkedListTest.search(5).data);

        assertEquals(null, linkedListTest.search(2));

        linkedListTest.delete(4);
        System.out.println("Linked list contents: " + linkedListTest.toString());

        linkedListTest.delete(5);
        System.out.println("Linked list contents: " + linkedListTest.toString());
    }
}
