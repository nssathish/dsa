package Queues;

import java.util.Arrays;

public class PriorityQueue {
    private int[] array = new int[1];
    private int count = 0;

    public void insert(int item) {
        if (isFull())
            resizeArray();

        // shifting items
        int i = count - 1;
        for (; i >= 0; i--) {
            if (array[i] > item)
                array[i + 1] = array[i];
            else
                break;
        }
        array[i + 1] = item;
        count++;
    }

    public int remove() {
        var result = array[0];
        // shifting items
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        count--;
        return result;
    }

    private boolean isEmpty() {
        return count == 0;
    }
    private boolean isFull() {
        return count > array.length - 1;
    }
    private void resizeArray() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < count; i++)
            newArray[i] = array[i];

        array = newArray;
    }

    public void print() {
        System.out.println ( Arrays.toString ( array ) );
    }
}
