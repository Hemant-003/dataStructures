package com.company;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;

    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertElementAtFirst(int data) {
        Node newNode = new Node();
        newNode.value = data;

        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void inserElementAtLat(int data) {
        Node newNode = new Node();
        newNode.value = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }

    }

    public int deleteData() {
        int temp = first.value;

        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }
}
