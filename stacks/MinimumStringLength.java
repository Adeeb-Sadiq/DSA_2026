package stacks;

import java.util.Stack;

public class MinimumStringLength {
    public static int minLength(String s) {
        char[] cs = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c: cs) {
            if(c == 'B') {
                if(!stack.isEmpty() && stack.peek() == 'A') stack.pop();
                else stack.push(c);
            }
            else if(c == 'D') {
                if(!stack.isEmpty() && stack.peek() == 'C') stack.pop();
                else stack.push(c);
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }

    static void main() {
        int result = minLength("ABFCACDB");
        System.out.println(result);
    }
}
