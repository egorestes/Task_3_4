package com.company;

public class MyNode {

    private int value;
    private MyNode next;

    MyNode(int value) {
        this.value = value;
    }

    public MyNode() {
    }

    int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    MyNode getNext() {
        return next;
    }

    void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
