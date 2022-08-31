package Queues.Exercises;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackBy2QueuesPopHeavy {
    private Queue<Integer> q1 = new ArrayDeque<> (  );
    private Queue<Integer> q2 = new ArrayDeque<> (  );

    public void push(int item) {
        q1.add ( item );
    }
    public int pop() {
        while(q1.size () > 1)
            q2.add ( q1.remove () );

        var value = q1.remove ();
        swapQueueNames();
        return value;
    }
    private void swapQueueNames() {
        var temp = q1;
        q1 = q2;
        q2 = temp;
    }
}
