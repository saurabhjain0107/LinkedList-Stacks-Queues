package com.bridgelabz.ds;

public class Stack<E> {
    LinkedList<E> linkedList;

    public Stack() {
        this.linkedList = new LinkedList<>();
    }

    public  void push(E key){
        linkedList.add(key);
    }
    public void print(){
        linkedList.print();
    }
}
