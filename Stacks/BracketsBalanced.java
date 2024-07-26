import java.util.Stack;
public class BracketsBalanced {
    
    public static boolean isBalanced(String expression) {
        //Your code goes here
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the expression
        for (char c : expression.toCharArray()) {
            if (c == '(') {
                // If the character is an opening bracket, push it onto the stack
                stack.push(c);
            } else if (c == ')') {
                // If the character is a closing bracket, check if the stack is empty
                if (stack.isEmpty()) {
                    // If the stack is empty, there is no matching opening bracket, so the expression is not balanced
                    return false;
                } else {
                    // If the stack is not empty, pop the top element (which should be an opening bracket)
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}

