public class SinglyLinkedListDriver {
    public static void main(String args[]) {
        LinkedList numList = new LinkedList();
        Node nodeA = new Node(23);
        Node nodeB = new Node(9);
        Node nodeC = new Node(41);
        Node nodeD = new Node(12);
        Node nodeE = new Node(33);
        Node nodeF = new Node(17);
        Node nodeG = null;

        //populate the empty list
        numList.append(nodeA);
        numList.append(nodeB);
        numList.append(nodeC);

        System.out.print("The original list: ");
        numList.printList();
        System.out.println();

        //insertAfter fail case
        numList.insertAfter(nodeG, new Node(17)); //non existing node
        System.out.print("New list: ");
        numList.printList();

        //insertAfter working case
        numList.insertAfter(nodeC, nodeD); //existing node
        System.out.print("With insertAfter: ");
        numList.printList();

        //removeafter fail case
        numList.removeAfter(nodeD); //remove after tail node
        System.out.print("With removeAfter tail: ");
        numList.printList();

        //removeAfter working case
        numList.removeAfter(nodeB); //remove after 9
        System.out.print("With removeAfter: ");
        numList.printList();
        System.out.println();

        //prepend test
        numList.prepend(nodeF);
        System.out.print("Prepend 17: ");
        numList.printList();
    }
}
