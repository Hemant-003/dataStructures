package com.company;

import java.util.LinkedList;

public class PracticeLinkedList {

    private Node first = null;

    public boolean isEmpty() {
        return (first == null);

    }

    public void printNode() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();

    }

    public void insertElement(int data) {
        Node newNode = new Node();
        newNode.value = data;
        newNode.next = first;
        first = newNode;

    }



    public void addElement(int data, int index){
        Node newNode = new Node();
        if (isEmpty()){
          insertElement(data);
            return;
        }
        Node currentNode= new Node();
        int i = 0;
        while (currentNode.next!=null && i++<index){
            currentNode = currentNode.next;
        }
        newNode.value=data;
        first=newNode;
        newNode.next=currentNode.next;
    }
}
