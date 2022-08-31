package Queues.Exercises;

import java.util.Arrays;

public class QueueReverser {
    private int[] array;
    private int front, rear, count;

    public QueueReverser(int size) {
        array = new int[size];
        front = rear = count = 0;
    }
    public void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException (  );

        array[rear++] = item;
    }
    public void reverseByRange(int range) {
        // 5 1 2 3 4
        int first = front;
        int last = range - 1;
        while (first < last) {
            swap(first, last);
            first++;
            last--;
        }
    }
    @Override
    public String toString() {
        return "QueueReverser{" +
                "array=" + Arrays.toString ( array ) +
                '}';
    }

    private void swap(int first, int last) {
        int temp = array[first];
        array[first] = array[last];
        array[last] = temp;
    }
    private boolean isFull() {
        return count == array.length;
    }
    private boolean isEmpty() {
        return count == 0;
    }
}
