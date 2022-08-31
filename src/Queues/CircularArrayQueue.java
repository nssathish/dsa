package Queues;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CircularArrayQueue {
    private int front, rear, size, count;
    private int[] array;
    public CircularArrayQueue(int size) {
        this.size = size;
        front = rear = count = 0;
        array = new int[size];
    }

    public void enqueue (int item) {
        if (isFull ())
            throw new IllegalStateException ( "Queue is full." );

        array[rear] = item;
        rear = (rear + 1) % array.length;
        count++;
    }
    public int dequeue() throws NoSuchElementException {
        if (isEmpty ())
            throw new NoSuchElementException ( "Queue is empty." );

        var result = array[front];
        array[front] = 0;
        front = (front + 1) % array.length;
        count --;
        return result;
    }
    public int peek() {
        return array[front];
    }
    public void print() {
        System.out.println ( Arrays.toString ( array ) );
    }
    private boolean isEmpty() {
        return count == 0;
    }
    private boolean isFull() {
        return count == array.length;
    }
}
