package Stacks;

import java.util.Arrays;

interface StackOps {
    void push(int item);
    int pop() throws Exception;
    int peek() throws Exception;
    boolean isEmpty();
    boolean isFull();
}
public class NewStack implements StackOps {

    private int top;
    private final int[] array;
    private final int size;

    public NewStack(int size) {
        array = new int[size];
        top = -1;
        this.size = size;
    }

    @Override
    public void push(int item) {
        if (isFull ())
            throw new StackOverflowError (  );

        array[++top] = item;
    }

    @Override
    public int pop() throws Exception {
        if (isEmpty ())
            throw new Exception ( "Stack is empty." );

        return array[top--];
    }

    @Override
    public int peek() throws Exception {
        if (isEmpty ())
            throw new Exception ( "Stack is empty." );

        return array[top];
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public boolean isFull() {
        return top == size - 1;
    }

    @Override
    public String toString() {
        return Arrays.toString ( array );
    }
}
