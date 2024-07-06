package com.dsa.linkedList;

public class LinkedList {

    Node headNode;

    public void insertAtBeginning(Object data)
    {
        Node newNode = new Node(data);
        newNode.nextNode = headNode;
        headNode = newNode;
    }

    public void insertAtLast(Object data) {
        Node newNode = new Node(data);
        if (headNode == null)
            headNode = newNode;
        else {
            Node currentNode = headNode;
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = newNode;
        }
    }

    public void printLinkedList()
    {
        Node currentNode =headNode;
        while (currentNode != null)
        {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.nextNode;
        }
        System.out.print("null");
        System.out.println();
    }
}
