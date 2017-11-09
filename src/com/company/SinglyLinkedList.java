package com.company;

public class SinglyLinkedList {

    private Node first;

    public SinglyLinkedList(){

    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void insertElement(int data){
        Node newNode = new Node();
        newNode.value=data;
        newNode.next=first;
        first=newNode;

    }

    // 1->1, 2->3
    // first = 1
    // temp = 1

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void printNode(){
        Node current = first;
        while (current!= null){
            current.displayNode();
            current=current.next;
        }
        System.out.println();

    }

    public void insertAtLast(int data){
        Node newNode =new Node();
        newNode.value=data;
        if (isEmpty()){
           first = newNode;
           return;
        }
        Node current = first;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;

    }

    public void addValue(int data, int indexNo){
        int i=0;
        if(isEmpty() || indexNo==0) {
            insertElement(data);
            return;
        }
        Node current = first;
        Node newNode = new Node();

        while (current.next!=null && i++ < indexNo){
            current=current.next;

        }
        newNode.value =data;
        newNode.next=current.next;
        current.next = newNode;
    }

    
}
