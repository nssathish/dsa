package Queues.Exercises;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListQueue {
    private LinkedList<Integer> linkedList;

    public LinkedListQueue() {
        linkedList = new LinkedList<> (  );
    }

    public void enqueue(int item) {
        linkedList.addLast ( item );
    }
    public int dequeue() {
        return linkedList.removeFirst ();
    }
    public int peek() {
        return linkedList.getFirst ();
    }
    public boolean isEmpty() {
        return linkedList.isEmpty ();
    }

    @Override
    public String toString() {
        var array = linkedList.toArray ();
        return Arrays.toString ( array );
    }
}
