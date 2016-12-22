package com.java4u.ds.stack.impl;

/**
 * Created by varadago on 11/21/2016.
 */
public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}