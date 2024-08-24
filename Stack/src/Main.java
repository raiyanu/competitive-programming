import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println("Stack is empty here? " + (stack.empty() ? "yes" : "no"));
        stack.push("DON LEE");
        stack.push("SRK");
        stack.push("console.log('[object Object]')");
        System.out.println("Stack is empty here v2? " + (stack.empty() ? "yes" : "no"));
    }
}