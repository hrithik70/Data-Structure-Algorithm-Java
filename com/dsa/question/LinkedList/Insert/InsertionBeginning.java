package com.dsa.question.LinkedList.Insert;
import com.dsa.question.LinkedList.Insert.Node;

/*
@Author
Hrithik-Raj
 */


public class InsertionBeginning {

    Node head;

    public void insertAtBeginning(Object data) {
        Node newNode = new Node(data);
        newNode.nextNode = head;
        head = newNode;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.nextNode;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        InsertionBeginning insertionBeginning = new InsertionBeginning();
        insertionBeginning.insertAtBeginning(1);
        insertionBeginning.insertAtBeginning(2);
        insertionBeginning.insertAtBeginning(3);
        insertionBeginning.insertAtBeginning(4);

        insertionBeginning.printList(); // 4->3->2->1->null
    }


}
