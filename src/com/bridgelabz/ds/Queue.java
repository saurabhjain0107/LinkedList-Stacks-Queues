package com.bridgelabz.ds;

public class Queue<E> {
    LinkedList<E> linkedList;

    public Queue() {
        this.linkedList = new LinkedList<>();
    }
    public void add(E key) {
        linkedList.add(key);
    }

    public void print() {
        linkedList.print();
    }
}
