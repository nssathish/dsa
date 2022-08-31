package LinkedLists;

import java.util.NoSuchElementException;

public class LinkedLists {
    private static class Node {
        private final int data;
        private Node next;

        Node (int item) {
            data = item;
            next = null;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    public void addFirst(int item) {
        var node = new Node ( item );
        if (isEmpty ())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int item) {
        var node = new Node ( item );
        if (isEmpty ())
            first = last = node;
        else {
            last.next = node;
            last = last.next;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while ( current != null ) {
            if (current.data == item) return index;
            current = current.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int item) {
        return indexOf ( item ) != -1;
    }

    public void removeFirst() {
        if (first == null)
            throw new NoSuchElementException (  );

        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty ())
            throw new NoSuchElementException (  );

        if (first == last)
            first = last = null;
        else {
            last = getPrevious ( last );
            last.next = null;
        }

        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }
    public int size() {
        /* O(n) approach

        var pointer = first;
        int count = 0;
        while (pointer != null) {
            pointer = pointer.next;
            count++;
        }

        return count;
         */

        //O(1) approach
        return size;
    }

    public int[] toArray() {
        int[] items = new int[size ()];
        var pointer = first;
        int idx = 0;
        while (pointer != null) {
            items[idx++] = pointer.data;
            pointer = pointer.next;
        }

        return items;
    }

    public void print() {
        var pointer = first;
        while (pointer != null) {
            System.out.println ( pointer.data );
            pointer = pointer.next;
        }
    }

    // 10 -> 20 -> 30 -> 40 -> 50
    public void reverse() {
        if (isEmpty ()) return;

        var previous = first;
        var current = first.next;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (isEmpty ())
            throw new IllegalStateException (  );

        var start = first;
        var end = first;

        for (int i = 0; i < k - 1; i++) {
            end = end.next;
            if (end == null)
                throw new IllegalArgumentException (  );
        }
        while (end != null && end.next != null) {
            start = start.next;
            end = end.next;
        }

        return start.data;
    }

    public int printMiddle() {
        if (isEmpty ())
            throw new IllegalStateException ( );

        var start = first;
        var end = first;

        while (end != null && end.next != null) {
            start = start.next;
            end = end.next.next;
        }

        return start.data;
    }

    // 10 20 <- 30
    public boolean hasLoop() {
        if (isEmpty ())
            throw new IllegalStateException (  );

        var start = first;
        var end = first;

        while (end != null && end.next != null) {
            start = start.next;
            end = end.next.next;
            if (start == end) return true;
        }

        return false;
    }
    public void createLoop() {
        last.next = first;
    }
}