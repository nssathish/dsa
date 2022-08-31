package Queues;

import java.util.NoSuchElementException;
import java.util.Stack;

public class StackQueue {
    private int front, rear, size, count;
    private Stack<Integer> enqueueStack, dequeueStack;

    public StackQueue (int size) {
        this.size = size;
        front = rear = count = 0;
        enqueueStack = new Stack<> ();
        dequeueStack = new Stack<> ();
    }

    public void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException ( "Queue is full." );

        enqueueStack.push ( item );
        count++;
    }
    public int dequeue() {
        if (dequeueStack.empty ())
            throw new NoSuchElementException ( "Queue is empty." );

        while (!enqueueStack.empty ( ))
            dequeueStack.push ( enqueueStack.pop () );

        count--;
        return dequeueStack.pop ();
    }
    public int peek() {
        while (!enqueueStack.empty ( ))
            dequeueStack.push ( enqueueStack.pop () );

        return dequeueStack.peek ();
    }
    private boolean isFull() {
        return count == size;
    }
}