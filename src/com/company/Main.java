package com.company;


import java.io.IOException;

public class Main {

    public static void main(String args[]) {

//            Node nodeA = new Node();
//            nodeA.value =25;
//
//            Node nodeB = new Node();
//            nodeB.value=30;
//
//            Node nodeC = new Node();
//            nodeC.value= 20;
//
//            Node nodeD = new Node();
//            nodeD.value = 15;
//
//            nodeA.next=nodeB;
//            nodeB.next=nodeC;
//            nodeC.next=nodeD;
//
//
//            System.out.println(printSize(nodeA));
//            System.out.println(printSize(nodeC));
//            modify(nodeA,65);
//
//            System.out.println(nodeA.value);
//        }
//
//        public static int printSize(Node qNode){
//            Node currentNode = qNode;
//            int count =0;
//            while (currentNode !=null){
//                count ++;
//                currentNode =currentNode.next;
//            }
//            System.out.print("Size of linkList is : "  +count);
//            return count;
//
//        }
//
//        public static void modify(Node qNode,int a){
//            Node aNode = new Node();
//            aNode.value=25;
//
//            qNode=aNode;
//
//            System.out.println("value of node has been modified to : " +aNode.toString());
//        }

        SinglyLinkedList singlyLinkedList =new SinglyLinkedList();
        singlyLinkedList.insertElement(25);
//        singlyLinkedList.insertElement(28);
//        singlyLinkedList.insertElement(27);
//        singlyLinkedList.insertElement(77);
//        singlyLinkedList.insertElement(20);
//        singlyLinkedList.insertElement(88);
//        singlyLinkedList.insertElement(99);
//        singlyLinkedList.insertAtLast(35);

//        singlyLinkedList.printNode();
//
//        System.out.println("-------------");
//        singlyLinkedList.addValue(28,0);
//
//        singlyLinkedList.printNode();



        PracticeLinkedList linkedList = new PracticeLinkedList();
        linkedList.insertElement(25);
        linkedList.insertElement(85);
        linkedList.insertElement(77);
        linkedList.insertElement(41);

        linkedList.printNode();
        System.out.println("========");

        linkedList.addElement(85, 3);
        linkedList.printNode();








    }
}
