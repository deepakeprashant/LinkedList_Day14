package linkedlist;

public class LinkedListEx {
    public static void main(String[] args) {
        System.out.println(":: Welcome To Linked List ::");
        LinkedRepository linkedListEx = new LinkedRepository();
        linkedListEx.insertElement(linkedListEx, 25);
        linkedListEx.insertElement(linkedListEx, 30);
        linkedListEx.insertElement(linkedListEx, 70);

        linkedListEx.print(linkedListEx);
    }
}
