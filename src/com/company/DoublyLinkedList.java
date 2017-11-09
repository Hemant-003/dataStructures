package com.company;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public boolean ismpty(){
        return first==null;
    }

    public void addElement(int data){
        Node newNode = new Node();
        newNode.value =data;

        if (ismpty()){
            last=newNode.value;
        }

    }
}
