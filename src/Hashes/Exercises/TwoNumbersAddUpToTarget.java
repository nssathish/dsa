package Hashes.Exercises;

import java.util.HashMap;
import java.util.HashSet;

public class TwoNumbersAddUpToTarget {
    public static HashSet<Integer> indexOfTwoNumbersAddUpToTarget(int[] array, int target) {
        var hashTable = new HashMap<Integer, Integer> (  );
        var set = new HashSet<Integer> (  );
        for (var i = 0; i < array.length; i++)
            hashTable.put ( array[i], i );

        for (var entry : hashTable.entrySet ()) {
            var x = entry.getKey ();
            var remainder = Math.abs ( target - x );
            if (hashTable.containsKey ( remainder )) {
                set.add ( entry.getValue () );
                set.add ( hashTable.get ( remainder ) );

                return set;
            }
        }

        return null;
    }
}
