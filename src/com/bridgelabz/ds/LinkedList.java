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

    public E poplast() {
        E deletedata = tail.key;
        Node<E> temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        temp = tail;
        return deletedata;
    }

    public Node<E> search(E searchdata) {
        Node<E> temp = head;
        while (temp!=null) {
            if (temp.key.equals(searchdata))
                return temp;
            temp = temp.next;
        }
        return null;
    }
    public boolean insertafter(E searchdata, E insertafter) {
        Node<E> newNode = new Node<>(insertafter);
        Node<E> searchedNode = search(searchdata);
        if(searchedNode!=null){
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            return true;
        }
        return false;
    }
}
