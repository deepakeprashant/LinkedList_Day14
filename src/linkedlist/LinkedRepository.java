package linkedlist;

public class LinkedRepository {
    public MyNode head;
    MyNode node = null;

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

    LinkedRepository insertNewPosition(LinkedRepository linkedListEx, int key) {
        node = new MyNode(key);
        node.next = linkedListEx.head.next;
        linkedListEx.head.next = node;
        return linkedListEx;
    }

    LinkedRepository popFirstNode(LinkedRepository linkedListEx) {
        linkedListEx.head = linkedListEx.head.next;
        return linkedListEx;
    }

    public void print(LinkedRepository linkedListEx) {
        System.out.println("Head [ " + linkedListEx.head + " ]");
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
