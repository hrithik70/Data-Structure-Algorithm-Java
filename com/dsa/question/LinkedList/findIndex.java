package com.dsa.question.LinkedList;

/*
@Author
Hrithik-Raj
*/

public class findIndex {

    Node head;

    public int findIndex(Object key) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data.equals(key)) {
                return index;
            }
            currentNode = currentNode.nextNode;
            index++;
        }
        return -1;
    }
}
