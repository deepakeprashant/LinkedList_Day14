package refactore.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        System.out.println(":: Linked List Program ::");
        LinkedRepository linkedListObject = new LinkedRepository();
        UserInterface userInterface = new UserInterface();
        linkedListObject.insertNode(56);
        linkedListObject.insertNode(30);
        linkedListObject.insertNode(70);
        userInterface.showLinkedList(linkedListObject);
        while (true){
            switch (userInterface.dashBoard()){
                case 1:
                    userInterface.getNode(linkedListObject);
                    linkedListObject.insertNewNode();
                    break;
                case 2:
                    userInterface.getNode(linkedListObject);
                    linkedListObject.popNode();
                    break;
                case 3:
                    userInterface.getSearchNode(linkedListObject);
                    linkedListObject.searchNode();
                    break;
                case 4:
                    linkedListObject.ascendingOrder(linkedListObject);
                    break;
                case 5:
                    userInterface.showLinkedList(linkedListObject);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice !");
            }
        }
    }
}
