package com.dsa.linkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    Node headNode;

    public void updateNodeAtIndex(Object updateData, int index)
    {
        Node currentNode = headNode;
        int count = 0;
        while (currentNode != null && index>count)
        {
            currentNode = currentNode.nextNode;
            count++;
        }
        currentNode.data = updateData;
    }

    public void insertAtIndex(Object data, int index)
    {
        Node currentNode = headNode;
        Node newNode = new Node(data);
        int count = 1;
        while (currentNode != null && index>count)
        {
            currentNode = currentNode.nextNode;
            count++;
        }
        newNode.nextNode = currentNode.nextNode;
        currentNode.nextNode = newNode;
    }

    public void insertAtBeginning(Object data) {
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

    public void printLinkedList() {
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.nextNode;
        }
        System.out.print("null");
        System.out.println();
    }

    public void getSize() {
        int size = 0;
        Node newNode = headNode;
        while (newNode != null) {
            size++;
            newNode = newNode.nextNode;
        }
        System.out.println("Size : " + size);
        ;
    }

    public void getMiddleElement() {
        Node currentNode = headNode;
        List<Object> list = new ArrayList<Object>();
        while (currentNode != null) {
            list.add(currentNode.data);
            currentNode = currentNode.nextNode;
        }
        if (list.isEmpty())
            System.out.println("The list is empty.");
        else {
            int middleIndex = list.size() / 2;
            Object middleElement = list.get(middleIndex);
            System.out.println("Middle Element : ["+middleElement+"]");
        }
    }

    public void findIndex(Object key)
    {
        Node currentNode = headNode;
        int index =0;
        while (currentNode != null)
        {
            if(currentNode.data.equals(key))
            {
                System.out.println("Index of " + key +" is ["+index+"]");
            }
            currentNode = currentNode.nextNode;
            index++;
        }
    }

    public void getMiddleNode()
    {
        Node currentNode = headNode;
        List<Object> list = new ArrayList<>();
        while (currentNode != null)
        {
            list.add(currentNode.data);
            currentNode = currentNode.nextNode;
        }
        System.out.println("Middle Element : ["+list.get(list.size()/2)+"]");
    }
}
