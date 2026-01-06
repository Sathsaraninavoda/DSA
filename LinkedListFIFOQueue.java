/*
 * Queue implementation using Linked List
 * Follows FIFO (First In First Out) principle
 */

public class LinkedListFIFOQueue {

    // Node class represents a queue element
    class Node {
        int data;    // value stored
        Node next;   // pointer to next node

        Node(int data) {
            this.data = data;
        }
    }

    // Front and rear pointers
    private Node front = null;
    private Node rear = null;

    /*
     * enqueue() method
     * Inserts an element at the rear of the queue
     */
    public void enqueue(int data) {
        Node newNode = new Node(data);

        // If queue is empty
        if (rear == null) {
            front = rear = newNode;
            return;
        }

        // Add new node at the end
        rear.next = newNode;
        rear = newNode;
    }

    /*
     * dequeue() method
     * Removes and returns element from the front
     */
    public int dequeue() {
        // Queue underflow condition
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = front.data;
        front = front.next;

        // If queue becomes empty
        if (front == null)
            rear = null;

        return value;
    }

    /*
     * display() method
     * Prints all elements from front to rear
     */
    public void display() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test queue operations
    public static void main(String[] args) {
        LinkedListFIFOQueue queue = new LinkedListFIFOQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();
        System.out.println("Dequeued element: " + queue.dequeue());
    }
}
