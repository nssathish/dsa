package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

interface BinarySearchable {
    void insert(int value);
    boolean find(int value);
}

public class BinarySearchTree implements BinarySearchable {
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

    public BinarySearchTree(int value) {
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

    public boolean find(int value) {
        var current = root;

        while (current != null) {
            if (value < current.data)
                current = current.leftChild;
            else if (value > current.data)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }

    public ArrayList<Integer> preOrderTraverse() {
        var current = root;
        return _preOrderTraverse ( current, new ArrayList<Integer> ( ) );
    }

    private ArrayList<Integer> _preOrderTraverse(Node current, ArrayList<Integer> items) {
        if (current != null) {
            items.add ( current.data );
            items = _preOrderTraverse ( current.leftChild, items );
            items = _preOrderTraverse ( current.rightChild, items );
        }

        return items;
    }

    public ArrayList<Integer> postOrderTraverse() {
        var current = root;
        return _postOrderTraverse ( current, new ArrayList<Integer> ( ) );
    }

    private ArrayList<Integer> _postOrderTraverse(Node current, ArrayList<Integer> items) {
        if (current != null) {
            items = _postOrderTraverse ( current.leftChild, items );
            items = _postOrderTraverse ( current.rightChild, items );
            items.add ( current.data );
        }

        return items;
    }

    public ArrayList<Integer> inOrderTraverse() {
        return _inOrderTraverse ( root, new ArrayList<Integer> ( ) );
    }

    private ArrayList<Integer> _inOrderTraverse(Node current, ArrayList<Integer> items) {
        if (current != null) {
            items = _inOrderTraverse ( current.leftChild, items );
            items.add ( current.data );
            items = _inOrderTraverse ( current.rightChild, items );
        }

        return items;
    }

    public ArrayList<Integer> levelOrderTraverse() {
        var items = new ArrayList<Integer> ( );
        var queue = new ArrayDeque<Node> ( );
        queue.add ( root );

        while (!queue.isEmpty ( )) {
            var node = queue.remove ( );
            if (node.leftChild != null) queue.add ( node.leftChild );
            if (node.rightChild != null) queue.add ( node.rightChild );
            items.add ( node.data );
        }

        return items;
    }

    public int height() {
        return height(root);
    }
    private int height (Node current) {
        if (current.leftChild != null && current.rightChild != null)
            return 1 + Math.max ( height ( current.leftChild ), height ( current.rightChild ) );

        return 0;
    }
}