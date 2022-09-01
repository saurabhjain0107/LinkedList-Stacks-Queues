package com.bridgelabz.ds;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Stack Operation");
        Stack<Integer> stack = new Stack<>();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        stack.print();
        System.out.println();
        stack.pop();
        stack.print();

    }
}
