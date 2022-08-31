package Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExpressionBracketsValidator {

    private final List<Character> leftBrackets = Arrays.asList ( '{', '(', '[');
    private final List<Character> rightBrackets = Arrays.asList ( '}', ')', ']' );

    public boolean validate(String expression) {
        var stack = new Stack<Character> ();
        var expressionArray = expression.toCharArray ();
        for (char ch: expressionArray) {
            if (isLeftBracket (ch))
                stack.push ( ch );

            if (isRightBracket (ch)) {
                if (stack.empty ()) return false;
                var top = stack.pop ();
                if (!bracketsMatch (top, ch)) return false;
            }
        }
        return true;
    }
    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains ( ch );
    }
    private boolean isRightBracket(char ch) {
        return rightBrackets.contains ( ch );
    }
    private boolean bracketsMatch(char left, char right) {
        return leftBrackets.indexOf (left) == rightBrackets.indexOf (right);
    }
}
