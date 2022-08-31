package DynamicArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] items = new int[] { 10, 20, 30};
        System.out.println(Arrays.toString(items));
        Array numbers = new Array(3);

        numbers.insert ( 10 );
        numbers.insert ( 20 );
        numbers.insert ( 30 );
        numbers.insert ( 40 );
        //numbers.print ( );
        numbers.removeAt ( 4 );
        numbers.print ( );
        System.out.println ( numbers.indexOf ( 10 ) );
        System.out.println ( numbers.indexOf ( 100 ) );
        numbers.insert ( 50 );
        numbers.print ( );
        System.out.println ("max: " + numbers.max () );

        int[] newNumbers = { 20, 3, 50, 7};
        System.out.println (Arrays.toString ( numbers.intersect (newNumbers)));

        numbers.reverse ();
        numbers.print ();
        numbers.insertAt ( 40, 2 );
        numbers.print ();
    }
}
