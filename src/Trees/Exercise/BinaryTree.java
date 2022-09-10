package Trees.Exercise;

import java.util.ArrayList;

public class BinaryTree{
    private static class Node {
        int data;
        Node leftChild, rightChild;

        public Node(int value) {
            this.data = value;
            leftChild = null;
            rightChild = null;
        }
    }

    private final Node root;

    public BinaryTree(int value) {
        this.root = new Node ( value );
    }

    public void insert(int value) {
        var node = new Node ( value );
        var current = this.root;

        while (true) {
            if (value < current.data) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    return;
                } else
                    current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    return;
                } else
                    current = current.rightChild;
            }
        }
    }

    public int size() {
        return size(root);
    }
    private int size (Node root) {
        if (root == null) return 0;
        return 1 + size (root.leftChild) + size (root.rightChild);
    }

    public int countLeaves() {
        return countLeaves ( root );
    }
    private int countLeaves (Node root) {
        if (root == null) return 0;
        if (root.leftChild == null && root.rightChild == null) return 1;

        return countLeaves ( root.leftChild ) + countLeaves ( root.rightChild );
    }

    public int max() { return max(root); }
    private int max(Node root) {
        if (root.rightChild == null)
            return root.data;
        return max(root.rightChild);
    }

    public boolean contains(int value) {
        return contains(root, value);
    }
    private boolean contains(Node root, int value) {
        if (root == null) return false;
        if (root.data == value) return true;

        return contains ( root.leftChild, value ) || contains ( root.rightChild, value );
    }

    public boolean areSiblings(int value1, int value2) {
        return areSiblings (root, value1, value2);
    }
    private boolean areSiblings(Node root, int value1, int value2) {
        if (root == null || root.leftChild == null || root.rightChild == null) return false;

        if ( (root.leftChild.data == value1 || root.leftChild.data == value2)
                && (root.rightChild.data == value1 || root.rightChild.data == value2))
            return true;

       return areSiblings ( root.rightChild, value1, value2 ) || areSiblings ( root.leftChild, value1, value2 );
    }

    public ArrayList<Integer> getAncestors(int value) {
        var list = new ArrayList<Integer> (  );
        getAncestors ( root, value, list );
        return list;
    }
    private boolean getAncestors(Node root, int value, ArrayList<Integer> list) {
        if (root == null) return false;
        if (
                (root.leftChild != null && root.leftChild.data == value)
                || (root.rightChild != null && root.rightChild.data == value)
                || getAncestors ( root.leftChild, value, list )
                || getAncestors ( root.rightChild, value, list )
        ) {
            list.add ( root.data );
            return true;
        }
        return false;
    }
}