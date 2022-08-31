package Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackByOneQueue {
    private Queue<Integer> queue = new ArrayDeque<> (  );

    public void push(int item) {
        queue.add ( item );
    }
    public int pop() {
        inlineRequeue();
        return queue.remove ();
    }
    private void inlineRequeue() {
        if (queue.isEmpty ())
            throw new IllegalStateException (  );

        for (int i = 0; i < queue.size ( ); i++) {
            var element = queue.remove ();
            queue.add ( element );
        }
    }
}
