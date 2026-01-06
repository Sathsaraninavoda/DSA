/*
 * Stack implementation using Linked List
 * Follows LIFO (Last In First Out) principle
 */

public class LinkedListStack {

    // Node class represents a stack element
    class Node {
        int data;    // value stored in node
        Node next;   // pointer to next node

        Node(int data) {
            this.data = data;
        }
    }

    // Top of the stack
    private Node top = null;

    /*
     * push() method
     * Inserts an element at the top of the stack
     */
    public void push(int data) {
        Node newNode = new Node(data);

        // New node points to old top
        newNode.next = top;

        // Update top to new node
        top = newNode;
    }

    /*
     * pop() method
     * Removes and returns top element of the stack
     */
    public int pop() {
        // Stack underflow condition
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data; // store value
        top = top.next;       // move top pointer
        return value;
    }

    /*
     * display() method
     * Prints all stack elements from top to bottom
     */
    public void display() {
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test stack operations
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Popped element: " + stack.pop());
    }
}
