package Hashes.Exercises;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEntriesInArray {
    Map<Integer, Integer> hashTable = new HashMap<> (  );
    public int mostFrequentEntryInArray(int[] array) {
        loadHashTable (array);
        int max = Integer.MIN_VALUE;
        int maxEntry = Integer.MIN_VALUE;
        for (var item : hashTable.entrySet ()) {
            if (item.getValue () > max) {
                max = item.getValue ();
                maxEntry = item.getKey ();
            }
        }

        return maxEntry;
    }
    private void loadHashTable(int[] array) {
        for (var item : array) {
            if (hashTable.containsKey ( item ))
                hashTable.put ( item, hashTable.get ( item ) + 1 );
            else
                hashTable.put ( item, 1 );
        }
    }
}
