package revise;

import java.util.Stack;

public class ValidParentheses {
    static void main() {
        System.out.println(isValid("[]"));
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("([{]])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            if(stack.isEmpty()) return false;
            if(ch == ')' && stack.pop() != '(') return false;
            if(ch == ']' && stack.pop() != '[') return false;
            if(ch == '}' && stack.pop() != '{') return false;
        }
        return stack.isEmpty();
    }
}
