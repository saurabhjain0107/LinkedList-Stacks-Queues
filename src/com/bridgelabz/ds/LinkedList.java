package com.bridgelabz.ds;

public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;

    public void push(E key) {
        Node<E> newNode = new Node<>(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void print() {
        Node<E> temp = head;
        while (temp!=null){
            System.out.print(temp.key+"->");
            temp= temp.next;
        }
    }
    public void add(E key) {
        Node<E> newNode = new Node<>(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
           tail.next = newNode;
           tail = newNode;
        }
    }

    public E pop() {
        E deleteData = head.key;
        head = head.next;
        return deleteData;
    }
}
