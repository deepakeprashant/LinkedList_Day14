package linkedlist;

import java.util.Scanner;

public class LinkedRepository {
    public MyNode head;
    MyNode node = null;

    Scanner scan = new Scanner(System.in);

    LinkedRepository insertElement(LinkedRepository linkedListEx, int i) {
        if (linkedListEx.head == null) {
            node = new MyNode(i);
            linkedListEx.head = node;
        } else {
            node = new MyNode(i);
            node.next = linkedListEx.head;
            linkedListEx.head = node;
        }
        return linkedListEx;
    }

    LinkedRepository appendElement(LinkedRepository linkedListEx, int key) {
        if (linkedListEx.head == null) {
            node = new MyNode(key);
            linkedListEx.head = node;
        } else {
            node = linkedListEx.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new MyNode(key);
        }
        return linkedListEx;
    }

    LinkedRepository insertPosition(LinkedRepository linkedListEx, int key) {
        node = new MyNode(key);
        node.next = linkedListEx.head.next;
        linkedListEx.head.next = node;
        return linkedListEx;
    }

    LinkedRepository popFirstNode(LinkedRepository linkedListEx) {
        linkedListEx.head = linkedListEx.head.next;
        return linkedListEx;
    }

    LinkedRepository popLastNode(LinkedRepository linkedListEx) {
        node = linkedListEx.head;
        MyNode lastNode = null;
        while (node.next != null) {
            lastNode = node;
            node = node.next;
        }
        lastNode.next = null;
        return linkedListEx;
    }

    void searchElement(LinkedRepository linkedListEx, int key) {
        node = linkedListEx.head;
        MyNode searchNode = new MyNode(key);
        while (node.next != null) {
            if (node.key == searchNode.key) {
                System.out.println("\n:: Element is present");
                System.out.println("Node [" + node.key + " ,(" + node + ")]");
                return;
            }
            node = node.next;
        }
        System.out.println("\n:: Element is Not Present");
    }

    void insertNewPosition(LinkedRepository linkedListEx, int newKey, int key) {
        node = linkedListEx.head;
        MyNode searchNode = new MyNode(key);
        while (node.next != null) {
            if (node.key == searchNode.key) {
                MyNode addNode = new MyNode(newKey);
                addNode.next = node.next;
                node.next = addNode;
                return;
            }
            node = node.next;
        }
        System.out.println("\n:: Element is Not Present");

    }

    void popNewPosition(LinkedRepository linkedListEx, int key) {
        node = linkedListEx.head;
        int size = getLinkedListSize(linkedListEx.head);
        MyNode searchNode = new MyNode(key);
        MyNode previousNode = null;
        for (int i = 0; i < size; i++) {
            if (node.key == searchNode.key){
                previousNode.next = node.next;
                return;
            }
            previousNode = node;
            node = node.next;
        }
        System.out.println("\n:: Element is Not Present");

    }

    int getLinkedListSize(MyNode head) {
        int count = 1;
        if (head.next == null) {
            return 0;
        }
        while (head.next != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public void print(LinkedRepository linkedListEx) {
        int size = getLinkedListSize(head);
        System.out.println("Head [ " + linkedListEx.head + " ] Linked List Size :- "+size);
        MyNode node = linkedListEx.head;
        while (node != null) {
            System.out.print("Node [ " + node.key + " ]");
            node = node.next;
            if (node != null) {
                System.out.print(" -> ");
            }
        }
    }
}
