package com.company;

public class MyStack {

    private MyNode head = null;
    private int size = 0;

    boolean push(int value) {
        MyNode node = new MyNode(value);
        if (isEmpty()) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;
        return true;
    }

    int pop() {
        int result = head.getValue();
        head = head.getNext();
        size--;
        return result;
    }

    void clear() {
        head = null;
        size = 0;
    }

    int getSize() {
        return size;
    }
    MyNode getHead() {
        return head;
    }
    boolean isEmpty() {
        return size == 0;
    }

    void print() {
        MyNode cur = head;
        while(cur != null) {
            System.out.print(cur.getValue() + ", ");
            cur = cur.getNext();
        }
    }
}