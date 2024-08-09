import java.util.Arrays;
import java.util.Stack;

// two-sum : Easy
@SuppressWarnings("ALL")
public class Main {
    public static boolean isValid(String s) {
        if (s.length() <= 1) return false;
        Stack<Character> stack = new Stack<>();
        for (char Br : s.toCharArray()) {
            switch (Br) {
                case '(':
                case '[':
                case '{':
                    stack.push(Br);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] testCases = {
                "[",
                "((", // Invalid
                "(){}{]", // Invalid
                "({[()]})", // Valid
                "({[)()]}", // Invalid
                "[({})]", // Valid
                "[({])}", // Invalid
                ")", // Invalid
                "([]){}", // Valid
                "([]{})", // Valid
                "{[}", // Invalid
                "({[()]})[{}]" // Valid
        };

        for (String testCase : testCases) {
            System.out.println("Test case: \"" + testCase + "\" is " + (isValid(testCase) ? "VALID" : "INVALID"));
        }
    }
}