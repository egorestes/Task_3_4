package com.company;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        MyStack my_stack = new MyStack();

        int[] arr = ArrayUtils.readIntArrayFromFile("input.txt");
        if(arr.length == 0) {
            System.out.println("Невозможно прочитать с файла");
        } else {
            for (int n : arr) {
                stack.push(n);
                my_stack.push(n);
            }
        }

        // Реализация с использованием встроенного стэка
        System.out.println("До переворота:");
        printStack(stack);

        rearrange(stack);

        System.out.println("\nПосле переворота");
        printStack(stack);

        // Реализация с собственным стэком
        System.out.println("\n\nДо переворота:");
        my_stack.print();

        rearrange(my_stack);

        System.out.println("\nПосле переворота:");
        my_stack.print();

    }

    private static void rearrange(Stack<Integer> stack) {
        Stack<Integer> temp1 = new Stack<>();
        Stack<Integer> temp2 = new Stack<>();

        while (!stack.isEmpty()) {
            temp1.push(stack.pop());
        }

        while (!temp1.isEmpty()) {
            temp2.push(temp1.pop());
        }

        while (!temp2.isEmpty()) {
            stack.push(temp2.pop());
        }
    }

    private static void rearrange(MyStack stack) {
        MyStack temp1 = new MyStack();
        MyStack temp2 = new MyStack();

        while (!stack.isEmpty()) {
            temp1.push(stack.pop());
        }

        while (!temp1.isEmpty()) {
            temp2.push(temp1.pop());
        }

        while (!temp2.isEmpty()) {
            stack.push(temp2.pop());
        }
    }

    private static void printStack(Stack<Integer> s) {
        Stack<Integer> copiedStack = new Stack<>();
        copiedStack.addAll(s);
        while(!copiedStack.isEmpty()) {
            System.out.print(copiedStack.pop() + ", ");
        }
    }
}
