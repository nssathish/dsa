package Queues;

import Queues.Exercises.QueueReverser;

public class Main {
    public static void main(String[] args) {
        var circularArr = new CircularArrayQueue ( 5 );
        circularArr.print ();
        circularArr.enqueue ( 10 );
        circularArr.enqueue ( 20 );
        circularArr.enqueue ( 30 );
        circularArr.print ();
        circularArr.enqueue ( 40 );
        circularArr.print ();
        circularArr.enqueue ( 50 );
        circularArr.dequeue ();
        circularArr.print ();
        circularArr.dequeue ();
        circularArr.print ();
        circularArr.enqueue ( 60 );
        circularArr.enqueue ( 70 );
        circularArr.print ();
        System.out.println (circularArr.peek () );

        var stackQueue = new StackQueue ( 5 );
        stackQueue.enqueue ( 10 );
        stackQueue.enqueue ( 20 );
        stackQueue.enqueue ( 30 );
        System.out.println ( "StackQueue peek: " + stackQueue.peek () );
        System.out.println ( "StackQueue.dequeue: " + stackQueue.dequeue ());

        var priorityQueue = new PriorityQueue ();
        priorityQueue.insert ( 5 );
        priorityQueue.insert ( 2 );
        priorityQueue.insert ( 1 );
        priorityQueue.insert ( 3 );
        priorityQueue.insert ( 0 );
        priorityQueue.insert ( 4 );
        priorityQueue.print ();
        System.out.println ( priorityQueue.remove () );
        System.out.println ( priorityQueue.remove () );
        priorityQueue.print ();

        var queueReverser = new QueueReverser ( 5 );
        queueReverser.enqueue ( 5 );
        queueReverser.enqueue ( 2 );
        queueReverser.enqueue ( 1 );
        queueReverser.enqueue ( 3 );
        queueReverser.enqueue ( 4 );
        System.out.println ( queueReverser );
        queueReverser.reverseByRange ( 2 );
        System.out.println ( queueReverser );
    }
}
