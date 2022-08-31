package Stacks;

import java.util.EmptyStackException;

public class MinStack {
    private int size, top, minStackTop;
    private int[] stack, minStack;

    public MinStack(int size) {
        this.size = size;
        stack = minStack = new int[size];
        minStackTop = top = -1;
    }

    public void push(int item) {
        if (isFull())
            throw new StackOverflowError (  );

        stack[++top] = item;
        if (minStackTop < 0 || minStack[minStackTop] > item)
            minStack[++minStackTop] = item;
        else {
            var minItem = minStack[minStackTop];
            minStack[++minStackTop] = minItem;
        }
    }
    private boolean isFull() {
        return top == size;
    }
    public int pop() {
        try {
            if (isEmpty())
                throw new EmptyStackException ();
            minStackTop--;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return stack[top--];
    }
    private boolean isEmpty() {
        return top < 0;
    }
    public int getMin() {
        try {
            if (isEmpty ())
                throw new EmptyStackException ();
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return minStack[minStackTop];
    }
}
