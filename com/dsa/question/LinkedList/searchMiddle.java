package com.dsa.question.LinkedList;

import java.util.ArrayList;
import java.util.List;

/*
@Author
Hrithik-Raj
*/

public class searchMiddle {

    Node head;

    public void getMiddleNode() {
        Node currentNode = head;
        List<Object> list = new ArrayList<>();
        while (currentNode != null) {
            list.add(currentNode.data);
            currentNode = currentNode.nextNode;
        }
        System.out.println("Middle Element : [" + list.get(list.size() / 2) + "]");
    }
}
