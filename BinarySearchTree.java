// BinarySearchTree.java
// Implementation of Binary Search Tree (BST)

class Node {
    int key;
    Node left, right;

    Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {

    Node root;

    // Insert a key into BST
    Node insert(Node root, int key) {

        // If tree is empty
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Traverse left or right
        if (key < root.key)
            root.left = insert(root.left, key);
        else if (key > root.key)
            root.right = insert(root.right, key);

        return root;
    }

    // Inorder traversal (sorted order)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    // Search a key in BST
    boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.key == key)
            return true;

        if (key < root.key)
            return search(root.left, key);

        return search(root.right, key);
    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        int[] keys = { 50, 30, 70, 20, 40, 60, 80 };

        for (int key : keys)
            tree.root = tree.insert(tree.root, key);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);

        System.out.println("\nSearch 40: " + tree.search(tree.root, 40));
        System.out.println("Search 90: " + tree.search(tree.root, 90));
    }
}
