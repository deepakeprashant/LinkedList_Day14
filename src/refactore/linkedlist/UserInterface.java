package refactore.linkedlist;

import java.util.Scanner;

public class UserInterface {
    Scanner scan =new Scanner(System.in);
    public int dashBoard() {
        System.out.println("\n\n1] Insert New Node\n2] Pop Node\n3] Search Node\n" +
                           "4] Ascending Order Arrange\n5] Show Linked List\n6] Exit");
        int choice = scan.nextInt();
        return choice;
    }
    public void showLinkedList(LinkedRepository linkedListObject) {
        int size = linkedListObject.getLinkedListSize(linkedListObject.head);
        System.out.println("Head [ " + linkedListObject.head + " ] Linked List Size :- "+size);
        Node node = linkedListObject.head;
        while (node != null) {
            System.out.print("Node [ " + node.key + " ]");
            node = node.next;
            if (node != null) {
                System.out.print(" -> ");
            }
        }
    }
    public void getNode(LinkedRepository linkedListObject){
        System.out.println("\nEnter Node Element");
        linkedListObject.key = scan.nextInt();
        System.out.println("Enter Position");
        linkedListObject.pos = scan.nextInt();
    }
    public void getSearchNode(LinkedRepository linkedRepository){
        System.out.println("\nEnter Node Element");
        linkedRepository.key = scan.nextInt();
    }
}
