package Hashes;

public class Main {
    public static void main(String[] args) {
        var wordProcessor = new WordProcessor ();
        System.out.println ( wordProcessor
                .FirstNonRepeatingChar ( "this is sathish kumar" )
        );
        System.out.println ( wordProcessor
                .FirstRepeatingCharacter ( "green apple" ));

        var hashTableByChaining = new HashTableByChaining ( 100 );
        hashTableByChaining.put ( 1, "hello" );
        hashTableByChaining.put ( 123, "hai" );
        hashTableByChaining.put ( 123456, "bonjour" );

        System.out.println ( hashTableByChaining.get ( 123456 ) );
        System.out.println ( hashTableByChaining.get ( 1 ) );
        System.out.println ( hashTableByChaining.get ( 123 ) );

        System.out.println ( hashTableByChaining.remove ( 123456 ) );
        System.out.println ( hashTableByChaining.get ( 123456 ) );
    }
}
