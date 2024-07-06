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
        linkedList.printLinkedList(); // Java->3.84->true->Hrithik Raj->1->null

        System.out.println("-----------Insertion At Last ----------");
        linkedList.insertAtLast("Last Element");
        linkedList.printLinkedList(); // Java->3.84->true->Hrithik Raj->1->Last Element->null


    }
}
