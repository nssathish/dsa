package Stacks;

public class TwoStacksInOne {
    private int[] array;
    private int top1;
    private int top2;
    private int size;

    public TwoStacksInOne(int size) {
        array = new int[size * 2];
        top2 = -2;
        top1 = -1;

        if (size < 1)
            throw new IllegalArgumentException ( "Size should be at least 1." );
        this.size = size;
    }

    public void push1(int item) {
        if (isFull1())
            throw new StackOverflowError (  );

        top1 += 2;
        array[top1] = item;
    }
    public int pop1() throws Exception {
        if (isEmpty1 ())
            throw new Exception ( "Stack is empty." );

        int item = array[top1];
        top1 -= 2;
        return item;
    }
    public int peek1() throws Exception {
        if (isEmpty1 ())
            throw new Exception ( "Stack is empty." );

        return array[top1];
    }
    public boolean isEmpty1() {
        return top1 < 0;
    }
    private boolean isFull1() {
        return top1 >= size;
    }

    public void push2(int item) {
        if (isFull2())
            throw new StackOverflowError (  );

        top2 += 2;
        array[top2] = item;
    }
    public int pop2() throws Exception {
        if (isEmpty2())
            throw new Exception ( "Stack is empty." );

        int item = array[top2];
        top2 -= 2;
        return item;
    }
    public int peek2() throws Exception {
        if (isEmpty2 ())
            throw new Exception ( "Stack is empty." );

        return array[top2];
    }
    public boolean isEmpty2() {
        return top2 < 0;
    }
    public boolean isFull2() {
        return top2 >= size;
    }
}
