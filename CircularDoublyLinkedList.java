/*
 * Circular Doubly Linked List implementation
 * Each node contains:
 *  - data
 *  - reference to next node
 *  - reference to previous node
 * Last node points to first node (circular)
 */

public class CircularDoublyLinkedList {

    // Node class represents a single element in the list
    class Node {
        int data;      // value stored in node
        Node next;     // pointer to next node
        Node prev;     // pointer to previous node

        Node(int data) {
            this.data = data;
        }
    }

    // Head points to the first node of the list
    private Node head = null;

    /*
     * insert() method
     * Inserts a new node at the end of the list
     */
    public void insert(int data) {
        Node newNode = new Node(data);

        // Case 1: List is empty
        if (head == null) {
            head = newNode;
            head.next = head;  // points to itself (circular)
            head.prev = head;
        }
        // Case 2: List is not empty
        else {
            Node tail = head.prev; // last node

            tail.next = newNode;   // old tail -> new node
            newNode.prev = tail;   // new node -> old tail
            newNode.next = head;   // new node -> head
            head.prev = newNode;   // head -> new node
        }
    }

    /*
     * display() method
     * Prints all elements in the circular doubly linked list
     */
    public void display() {
        // If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        // Loop until we reach head again
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    // Main method to test the list
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
    }
}
