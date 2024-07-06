package com.dsa.Question.LinkedList;

/*
@Author
Hrithik-Raj
*/
public class InsertionAtLast {

    Node head;

    public void insertAtLast(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node currentNode = head;
            while (currentNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode = newNode;
        }
    }
}
