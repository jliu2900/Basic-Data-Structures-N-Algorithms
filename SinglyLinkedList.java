class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList () {
        head = null;
        tail = null;
    }

    public void append(Node newNode) {
        if (head == null) { //empty list
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    } //end append

    public void prepend(Node newNode) {
        if (head == null) { //empty list
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    } //end prepend

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    } //end printList

    public void insertAfter(Node curNode, Node newNode) {
        Node node = head;
        while (node != null) { //not an empty list
            if (node == curNode) { //searched node is found
                if (node == tail) { //inserting after the tail
                    tail.next = newNode;
                    tail = newNode;
                } else {
                    newNode.next = node.next;
                    node.next = newNode;
                }
            }
            node = node.next;
        }
    } //end insertAfter

    public void removeAfter(Node curNode) {
        Node node = head;
        while (node != null) { //not an empty
            if (node == curNode) { //curNode is found
                if (node.next == tail) { //remove tail
                    tail = node;
                    node.next = null;
                } else if (node == tail) {}
                else {
                    node.next = node.next.next;
                }
            }
            node = node.next;
        }
    } //end removeAfter

} //end class LinkedList