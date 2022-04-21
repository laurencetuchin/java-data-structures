package BinarySearchTree;

public class BinarySearchTree {
    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }
    private Node insertHelper(Node root, Node node) {
        int data = node.data;

        if(root == null) {
            root = node;
            return root;
        }
        else if(data < root.data) {
            root.left = insertHelper(root.left, node);
        }
        else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    private void displayHelper(Node root) {
        if(root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }

    }
    public void display() {
        displayHelper(root);
    }
    public boolean search(int data) {
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data) {
        if(root == null) {
            return false;
        }
        else if(root.data == data) {
            return true;
        }
        else if(root.data > data) {
            return searchHelper(root.left,data);
        }
        else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data) {

    }

    public Node removeHelper(Node root, int data) {
        return null;
    }

    private int successor(Node root) {
        return 0;
    }

    private int predecessor(Node root) {
        return 0;
    }
}
