package com.prep.datastructures;

/**
 * Created by z001hk8 on 4/25/17.
 */
public class LinkedList {

    LinkNode firstNode;

    public void insert(int value) {

        LinkNode newNode = new LinkNode(value);

        if(firstNode == null) {
            firstNode = newNode;
        } else {
            LinkNode currentNode = firstNode;
            while(currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    public void delete(int value) {

        LinkNode currentNode = firstNode;

        if(currentNode == null) {
            return;
        }

        if(currentNode.data == value) {
            firstNode = currentNode.next;
            return;
        }

        while(currentNode.getNext() != null) {

            if(currentNode.getNext().getData() == value) {
                currentNode.next = currentNode.getNext().getNext();
                return;
            }
        }
    }

    public LinkNode search(int value) {

        LinkNode currentNode = firstNode;

        while(currentNode.getData() != value) {
            currentNode = currentNode.getNext();
            if(currentNode == null) {
                return null;
            }
        }
        return currentNode;
    }

    public String toString() {
        String contents = "";
        LinkNode currentNode = firstNode;
        while(currentNode != null) {
            contents += currentNode.getData() + " ";
            currentNode = currentNode.getNext();
        }
        return contents;
    }
}
