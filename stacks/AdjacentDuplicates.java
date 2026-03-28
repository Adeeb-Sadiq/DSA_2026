package stacks;

import java.util.Stack;

public class AdjacentDuplicates {
    static void main() {
        System.out.println(removeAdjacentDuplicates("abbaca"));
        System.out.println(removeAdjacentDuplicates("azxxzy"));
    }

    private static String removeAdjacentDuplicates(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c: str.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for(char c: stack) {
            result.append(c);
        }

        return result.toString();
    }
}
