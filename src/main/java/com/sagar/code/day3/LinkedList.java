package day3;

// Java program to implement
// a Singly Linked List
public class LinkedList {

    static Node head; // head of list

    static int k = 3;

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node new_node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (LinkedList.head == null) {
            LinkedList.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = LinkedList.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node currNode = LinkedList.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    public static void printListRecursion(Node head) {

        if (head == null) {
            return;
        }

        System.out.print(head.data);

        printListRecursion(head.next);

    }

    static void printKFromEnd(Node head) {

        if (head == null)
            return;

        printKFromEnd(head.next);

        // wapas
        k--;
        if (k == 0) {
            System.out.print(head.data);
            return;

        }

    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        printListRecursion(head);
        System.out.println();
        printList(list);
        System.out.println();
        System.out.println("printKFromEnd");
        printKFromEnd(head);
    }
}
