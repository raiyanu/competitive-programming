import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class parenthesisValidator {

    private final List<Character> rightBrackets = Arrays.asList('}', ']', '>', ')');
    private final List<Character> leftBrackets = Arrays.asList('{', '[', '<', '(');

    public boolean isValid(String input) {
        Stack<Character> brackets = new Stack<Character>();
        for (char bracket : input.toCharArray()) {
            if (isLeftBracket(bracket)) brackets.push(bracket);
            else if (isRightBracket(bracket)) {
                if (brackets.isEmpty()) return false;
                if (!(isCoveringBracket(brackets.pop(), bracket))) return false;
            } else {
                return false;
            }
        }
        return brackets.isEmpty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean isCoveringBracket(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
