package refactore.linkedlist;

public class LinkedRepository {
    Node head;
    Node node;
    int key, pos;

    int getLinkedListSize(Node head) {
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

    public void insertNode(int key) {
        if (head == null) {
            node = new Node(key);
            head = node;
        } else {
            node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(key);
        }
    }

    public void insertNewNode() {
        int size = getLinkedListSize(head);
        if (pos == 1) {
            node = new Node(key);
            node.next = head;
            head = node;
            System.out.println("Successfully Add New Node");
            return;
        }
        node = head;
        Node previousNode = null;
        Node newNode = new Node(key);
        for (int i = 0; i < size; i++) {
            if (i == (pos - 1)) {
                newNode.next = previousNode.next;
                previousNode.next = newNode;
                System.out.println("Successfully Add New Node");
            }
            previousNode = node;
            node = node.next;
        }
    }

    public void popNode() {
        int size = getLinkedListSize(head);
        if (pos == 1) {
            head = head.next;
            System.out.println("Successfully Pop Node");
            return;
        }
        node = head;
        Node previousNode = null;
        for (int i = 0; i < size; i++) {
            if (i == (pos - 1)) {
                previousNode.next = node.next;
                return;
            }
            previousNode = node;
            node = node.next;
        }
    }

    public void ascendingOrder(LinkedRepository linkedListObject) {
        node = linkedListObject.head;
        Node secondNode = node.next;
        if (node.key > secondNode.key) {
            node.next = secondNode.next;
            secondNode.next = node;
            linkedListObject.head = secondNode;
        }
        secondNode = null;
        Node tempNode = null;
        while (node.next != null) {
            secondNode = node.next;
            if (node.key <= secondNode.key) {
                tempNode = node;
                node = node.next;
            } else {
                tempNode.next = secondNode;
                node.next = secondNode.next;
                secondNode.next = node;
                node = node.next;
            }
        }
    }

    public void searchNode() {
        int size = getLinkedListSize(head);
        node = head;
        Node searchNode = new Node(key);
        for (int i = 0; i < size; i++) {
            if (node.key == searchNode.key) {
                System.out.println(key + " Is Present in Linked List");
                return;
            }
            node = node.next;
        }
        System.out.println(key + " Is Not Present in Linked List");
    }
}
