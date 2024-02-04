package com.mycomp.array;
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.


        Example 1:

        Input: s = "()"
        Output: true
*/

import java.util.Stack;

public class ParenthesisValidationTest {
    public static void main(String[] args) {
        ParenthesisValidation parenthesisValidation = new ParenthesisValidation();
        System.out.println("Parenthesis Validation: " + parenthesisValidation.getValidParenthesis("{}"));
        System.out.println("Parenthesis Validation: " + parenthesisValidation.getValidParenthesis("([}}])"));
    }
}

class ParenthesisValidation {
    public boolean getValidParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : str.toCharArray()) {
            if (isEligibleForPush(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if (!isEligibleForPop(ch, top)) {
                    return false;
                } else {
                    stack.pop();
                }
            }

        }
        return stack.isEmpty();
    }

    private boolean isEligibleForPush(Character ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private boolean isEligibleForPop(Character ch, char top) {
        return ch == ')' && top == '(' || ch == '}' && top == '{' ||
                ch == ']' && top == '[';
    }
}
