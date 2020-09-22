package java11_stack_queue.exercise.check_sym;

import java.util.Stack;

public class CheckSym {
    public static void main(String[] args) {
        String string = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        boolean check = true;
        Stack<Character> stack = new Stack<>();
        int left = 0;
        int right = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                stack.push(string.charAt(i));
                left ++;
            }
            if (string.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    check = false;
                    break;
                } else {
                    stack.pop();
                    right++;
                }
            }
        }
        if (left != right) {
            check = false;
        }

        System.out.println(check);
    }
}
