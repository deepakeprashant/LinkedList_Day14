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
//        System.out.println("\n:: Pop First Node");
//        linkedListEx.popFirstNode(linkedListEx);
//        linkedListEx.print(linkedListEx);
//        System.out.println("\n:: Pop Last Node :- ");
//        linkedListEx.popLastNode(linkedListEx);
        linkedListEx.print(linkedListEx);
        linkedListEx.searchElement(linkedListEx , 30);
    }
}
