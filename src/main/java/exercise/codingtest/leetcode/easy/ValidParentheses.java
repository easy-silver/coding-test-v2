package exercise.codingtest.leetcode.easy;

import java.util.Map;
import java.util.Stack;

/**
 * 20. Valid Parentheses
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);

            } else {
                if (stack.isEmpty() || stack.pop() != map.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
