package com.dsa.question.LinkedList.Insert;
import com.dsa.question.LinkedList.Insert.Node;

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
