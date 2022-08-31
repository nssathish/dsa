package Hashes.Exercises;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithDiffInArray {
    Map<Integer, Integer> hashTable = new HashMap<> (  );
    public int countPairsWithDiff(int[] array, int k) {
        for (var item : array)
            hashTable.put ( item, 0 );

        int count = 0;
        for (var entry : hashTable.entrySet ()) {
            var key = Math.abs ( entry.getKey () - k);
            if (key != entry.getKey () && hashTable.containsKey ( key ))
                count++;
        }

        return count;
    }
    private void loadHashTable(int[] array, int k) {
        // item - x = k -> item - k = x
        for (var item : array)
            hashTable.put ( item, 0 );
//            hashTable.put ( item, Math.abs ( item - k ) );
    }
}
