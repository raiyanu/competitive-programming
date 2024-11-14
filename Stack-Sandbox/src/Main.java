import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        parenthesisValidator p =  new parenthesisValidator();

        if (!p.isValid("[][][}")) System.out.print("1.Passed \t");
        else System.out.println("\n 1. Failed");

        if (p.isValid("[][][]")) System.out.print("2.Passed \t");
        else System.out.println("\n 2. Failed");

        if (!p.isValid("]")) System.out.print("3.Passed \t");
        else System.out.println("\n 3. Failed");

        if (!p.isValid("{")) System.out.print("4.Passed \t");
        else System.out.println("\n 4. Failed");

        if (!p.isValid("}()()()}")) System.out.print("5.Passed \t");
        else System.out.println("\n 5. Failed");

        if (!p.isValid("}()<>()}")) System.out.print("6.Passed \t");
        else System.out.println("\n 6. Failed");

        if (!p.isValid("}()()(>}")) System.out.print("7.Passed \t");
        else System.out.println("\n 7. Failed");

        if (p.isValid("{()()<>}")) System.out.print("8.Passed \t");
        else System.out.println("\n 8. Failed");
    }
    public static void OldStyleValidation(String[] args) {
        System.out.println(reverseStr("Hello world"));
        if (!balancedBracket("[][][}")) System.out.println("1. Passed");
        else System.out.println("1. Failed");
        if (balancedBracket("[][][]")) System.out.println("2. Passed");
        else System.out.println("2. Failed");
        if (!balancedBracket("]")) System.out.println("3. Passed");
        else System.out.println("3. Failed");
        if (!balancedBracket("{")) System.out.println("4. Passed");
        else System.out.println("4. Failed");
        if (!balancedBracket("}()()()}")) System.out.println("5. Passed");
        else System.out.println("5. Failed");
    }

    static boolean balancedBracket(String input) {
        Stack<Character> brackets = new Stack<Character>();
        for (char bracket : input.toCharArray())
            switch (bracket) {
                case '{':
                case '[':
                case '(':
                    brackets.push(bracket);
                    break;
                case '}':
                    if (brackets.isEmpty() || brackets.pop() != '{') return false;
                    break;
                case ']':
                    if (brackets.isEmpty() || brackets.pop() != '[') return false;
                    break;
                case ')':
                    if (brackets.isEmpty() || brackets.pop() != '(') return false;
                    break;
                default:
                    return false;
            }
        return brackets.isEmpty();
    }

    static String reverseStr(String str) {
        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < str.length(); i++)
//            stack.push(str.charAt(i));
        for (char ch : str.toCharArray())
            stack.push(ch);

        StringBuffer reversed = new StringBuffer();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop().toString());
        }
        return reversed.toString();
    }
}
