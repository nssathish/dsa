package Stacks;

import java.util.EmptyStackException;

public class MinStackOof1 {
    private int top;
    private int size;
    private int[] stack;
    private int minEle;

    public MinStackOof1(int size) {
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    public void push(int item) {
        if (isFull())
            throw new StackOverflowError (  );

        if ( isEmpty() ) {
            stack[++top] = item;
            minEle = item;
        } else if (topSmallerThan ( item )) {
            stack[++top] = item;
        } else {
            // push 2X - minEle to the stack
            stack[++top] = (2 * item) - minEle;
            minEle = item;
        }
    }
    public int pop() {
        if (isEmpty ())
            throw new EmptyStackException ();

        int topElement = stack[top];
        if (topElement < minEle)
            minEle = (2 * minEle) - topElement;

        return stack[top--];
    }
    public int getMin() {
        if (isEmpty ())
            throw new EmptyStackException ();

        return minEle;
    }
    public int peek() {
        if (isEmpty ())
            throw new EmptyStackException ();

        return stack[top];
    }
    private boolean isFull() {
        return top == size;
    }
    private boolean isEmpty() {
        return top < 0;
    }
    private boolean topSmallerThan(int item) {
        return peek () <= item;
    }
}
