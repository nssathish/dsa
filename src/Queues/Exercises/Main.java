package Queues.Exercises;

public class Main {
    public static void main(String[] args) {
        var linkedListQueue = new LinkedListQueue ();
        linkedListQueue.enqueue ( 10 );
        linkedListQueue.enqueue ( 5 );
        linkedListQueue.enqueue ( 20 );
        linkedListQueue.enqueue ( 4 );

        System.out.println( linkedListQueue );

        System.out.println (linkedListQueue.peek ());
        linkedListQueue.dequeue ();
        System.out.println ( linkedListQueue.peek () );

        //push heavy stack by queues
        var stackBy2Queues = new StackBy2QueuesPushHeavy ();
        stackBy2Queues.push ( 10 );
        stackBy2Queues.push ( 20 );
        stackBy2Queues.push ( 30 );
        System.out.println ( "Push heavy pop(): " + stackBy2Queues.pop () );

        //pop heavy stack by queues
        var stackBy2QueuesPopHeavy = new StackBy2QueuesPopHeavy ();
        stackBy2QueuesPopHeavy.push ( 10 );
        stackBy2QueuesPopHeavy.push ( 20 );
        stackBy2QueuesPopHeavy.push ( 30 );
        System.out.println ( "Pop heavy pop(): " + stackBy2QueuesPopHeavy.pop () );

        //stack by 1 queue
        var stackByOneQueue = new StackByOneQueue ();
        stackByOneQueue.push ( 10 );
        stackByOneQueue.push ( 20 );
        stackByOneQueue.push ( 30 );
        System.out.println ( "Stack by one Queue's pop(): " + stackByOneQueue.pop () );
    }
}
