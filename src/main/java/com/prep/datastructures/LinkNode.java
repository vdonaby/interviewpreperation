package com.prep.datastructures;

/**
 * Created by z001hk8 on 4/25/17.
 */
public class LinkNode {

    int data;
    LinkNode next;

    LinkNode(int value) {
        data = value;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }
}
