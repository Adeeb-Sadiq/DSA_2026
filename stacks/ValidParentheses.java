package stacks;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') stack.push(ch);
            if(stack.isEmpty()) return false;
            if(ch == ')' && stack.pop() != '(') return false;
            if(ch == '}' && stack.pop() != '{') return false;
            if(ch == ']' && stack.pop() != '[') return false;
        }

        return stack.isEmpty();
    }

    static void main() {
        String s = "([{}])";
        String b = "[(])";
        System.out.println(isValid(s));
        System.out.println(isValid(b));
    }
}
