package Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackBy2QueuesPushHeavy {
    private Queue<Integer> q1 = new ArrayDeque<> (  );
    private Queue<Integer> q2 = new ArrayDeque<> (  );

    public void push(int item) {
        q2.add ( item );
        while (!q1.isEmpty ())
            q2.add ( q1.remove () );

        swapQueueNames();
    }
    public int pop() {
        return q1.remove ();
    }
    private void swapQueueNames() {
        var temp = q1;
        q1 = q2;
        q2 = temp;
    }
}