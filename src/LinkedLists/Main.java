package LinkedLists;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedLists newList = new LinkedLists ();
//        newList.addFirst ( 10 );
//        newList.addFirst ( 20 );
//        newList.addFirst ( 30 );
//        newList.print ();
//        newList.addLast ( 40 );
//        newList.print ();
//        System.out.println ( newList.indexOf(30) );
//        System.out.println ( newList.indexOf(50) );
//        newList.addLast ( 50 );
//        newList.print ();
//        System.out.println (newList.indexOf ( 50 ) );
//        System.out.println (newList.contains ( 10 ) );
//        newList.removeFirst ();
//        newList.print ();
//        newList.removeFirst ();
//        newList.print ();
//
//        newList.removeLast ();
//        newList.print ();
//        newList.removeLast ();
//        newList.print ();
//
//        System.out.println (newList.size() );
//        System.out.println ( Arrays.toString ( newList.toArray ()) );
//        newList.addLast ( 60 );
//        newList.addLast ( 70 );
//        newList.addLast ( 80 );
//        newList.print ();
//
//        var array = newList.reverse();
//        System.out.println (Arrays.toString ( array ) );

        newList = new LinkedLists ();
        newList.addLast ( 10 );
        newList.addLast ( 20 );
        newList.addLast ( 30 );
        newList.addLast ( 40 );
        newList.addLast ( 50 );
//        newList.reverse ();
        System.out.println ( Arrays.toString ( newList.toArray () ) );
//        System.out.println (newList.getKthFromTheEnd ( 0 ) );
//        System.out.println (newList.getKthFromTheEnd ( 1 ) );
//        System.out.println (newList.getKthFromTheEnd ( 2 ) );
//        System.out.println (newList.getKthFromTheEnd ( 3 ) );
//        System.out.println (newList.getKthFromTheEnd ( 4 ) );
//        System.out.println (newList.getKthFromTheEnd ( 5 ) );
//        System.out.println (newList.getKthFromTheEnd ( -1 ) );
//        System.out.println (newList.getKthFromTheEnd ( -2 ) );

        System.out.println (newList.printMiddle () );
        newList.addLast ( 60 );
        newList.addLast ( 70 );
        System.out.println ( newList.printMiddle () );
//        var emptyList = new LinkedLists ();
//        System.out.println ( emptyList.printMiddle () );
        System.out.println ( Arrays.toString ( newList.toArray () ));
        System.out.println ("has loop: " + newList.hasLoop() );
        newList.createLoop();
        System.out.println ("has loop: " + newList.hasLoop() );
    }
}
