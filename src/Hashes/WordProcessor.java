package Hashes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class WordProcessor {
    public char FirstNonRepeatingChar(String sentence) {
        var dictionary = new HashMap<Character, Integer> ();
        var letters = new ArrayList<Character> (  );
        for (var ch : sentence.toCharArray ( )) {
            if (dictionary.containsKey ( ch ))
                dictionary.put ( ch, dictionary.get ( ch ) + 1 );
            else {
                dictionary.put ( ch, 1 );
                letters.add ( ch );
            }
        }

        for (var ch : letters) {
            if (dictionary.get ( ch ) == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }

    public char FirstRepeatingCharacter(String str) {
        var set = new HashSet<Character> (  );
        for (var ch : str.toCharArray ())
            if (!set.add ( ch ))
                return ch;
        return Character.MIN_VALUE;
    }
}
