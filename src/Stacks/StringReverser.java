package Stacks;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException (  );

        Stack<Character> stack = new Stack<> ();

        for (var ch: input.toCharArray ())
            stack.push ( ch );

        StringBuilder sb = new StringBuilder (  );
        while(!stack.empty ())
            sb.append ( stack.pop () );

        return sb.toString ();
    }
}
