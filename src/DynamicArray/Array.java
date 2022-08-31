package DynamicArray;

import java.util.*;

interface Arrayable {
    void insert(int value);
    void removeAt(int index);
    int indexOf(int value);
    void print();
}
class Array implements Arrayable {
    int[] integerArray;
    int index;

    public Array(int length) {
        integerArray = new int[length];
        index = 0;
    }

    public void insert(int value) {
        if ( index == this.integerArray.length ) {
            int[] newArray = new int[index * 2];
            for (int i = 0; i < index; i++)
                newArray[i] = integerArray[i];

            integerArray = newArray;
        }

        integerArray[index++] = value;
    }

    public void removeAt(int idx) {
        if ( idx - 1 < 0 || idx - 1 >= index )
            throw new IllegalArgumentException();

        shiftItems(integerArray, idx - 1);
    }

    public int indexOf(int value) {
        int idx = -1;
        for (int i = 0; i < this.integerArray.length; i++) {
            if (this.integerArray[i] == value) {
                idx = i + 1;
                break;
            }
        }

        return idx;
    }

    public int max() {
        int max = 0;
        for (int item :
                integerArray) {
            if (item > max)
                max = item;
        }

        return max;
    }

    public int[] intersect (int[] array2) {
        List<Integer> result = new ArrayList<> ( );
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (integerArray[i] == array2[j])
                    result.add ( integerArray[i] );
            }
        }
        int[] resultArray = new int[result.size ()];
        int idx = 0;
        for (Integer item :
                result) {
            resultArray[idx++] = item;
        }
        return resultArray;
    }

    public void reverse() {
        int start = 0;
        int end = index - 1;
        while (start < end) {
            int temp = integerArray[start];
            integerArray[start] = integerArray[end];
            integerArray[end] = temp;
            start++;
            end--;
        }
    }

    public void insertAt(int item, int idx) {
        insert ( item );
        for (int i = index - 1; i > idx; i--) {
            integerArray[i] = integerArray[i - 1];
        }
        integerArray[idx] = item;
    }

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.println (integerArray[i]);
        }
    }

    // Private Methods
    private void shiftItems(int[] array, int idx) {
        for (int i = idx; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        this.integerArray = array;
        this.index--;
    }
}