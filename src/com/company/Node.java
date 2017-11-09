package com.company;

public class Node {

    public int value;
    int previous;
    Node next = null;

    public void displayNode(){
        System.out.println("{ "+value+" }");
    }


    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
