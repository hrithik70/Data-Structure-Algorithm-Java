package com.dsa.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtBeginning(1);
        linkedList.insertAtBeginning("Hrithik Raj");
        linkedList.insertAtBeginning(true);
        linkedList.insertAtBeginning(3.84);
        linkedList.insertAtBeginning("Java");

        System.out.println("-----------Insertion At Beginning ----------");
        linkedList.printLinkedList();


        System.out.println("-----------Insertion At Last ----------");
        linkedList.insertAtLast("Last Element");
        linkedList.printLinkedList();

        linkedList.getSize();
        linkedList.getMiddleElement();
        System.out.println("----------------- Search Index of Node -------------------");
        linkedList.findIndex("Java");

        linkedList.printLinkedList();
        System.out.println("----------------- Insert at Specific Index of Node -------------------");
        linkedList.insertAtIndex("Developer",2);
        linkedList.printLinkedList();
        System.out.println("----------------- Update at Specific Index of Node -------------------");
        linkedList.updateNodeAtIndex(100,2);
        linkedList.printLinkedList();

    }
}
