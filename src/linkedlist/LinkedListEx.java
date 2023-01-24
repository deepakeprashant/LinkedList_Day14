package linkedlist;

public class LinkedListEx {
    public static void main(String[] args) {
        System.out.println(":: Welcome To Linked List ::");
        LinkedRepository linkedListEx = new LinkedRepository();
//        linkedListEx.insertElement(linkedListEx, 70);
//        linkedListEx.insertElement(linkedListEx, 30);
//        linkedListEx.insertElement(linkedListEx, 56);
        linkedListEx.appendElement(linkedListEx, 56);
        linkedListEx.appendElement(linkedListEx, 70);

        linkedListEx.insertNewPosition(linkedListEx, 30);
        linkedListEx.print(linkedListEx);
    }
}
