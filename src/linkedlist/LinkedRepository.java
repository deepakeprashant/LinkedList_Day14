package linkedlist;

public class LinkedRepository {
    public MyNode head;
    LinkedRepository insertElement(LinkedRepository linkedListEx, int i) {
        MyNode node = null;
        if (linkedListEx.head == null) {
            node = new MyNode(i);
            linkedListEx.head = node;
        } else {
            node = linkedListEx.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new MyNode(i);
        }
        return linkedListEx;
    }

    public void print(LinkedRepository linkedListEx) {
        System.out.println("Head [ " + linkedListEx.head + " ]");
        MyNode node = linkedListEx.head;
        while (node != null) {
            System.out.print("Node [ " + node.key + " , " + node.next + " ]");
            node = node.next;
            if (node != null) {
                System.out.println("->");
            }
        }
    }
}