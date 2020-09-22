package java11_stack_queue.exercise.check_panlindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPanlindrome {
    public static void main(String[] args) {
        String strings = "able was I ere I saw elba";

        Stack<Character> stack = new Stack<Character>();

        Queue<Character> queue = new LinkedList<Character>();

        for (int i = 0; i < strings.length(); i++) {
            stack.push(strings.charAt(i));
            queue.add(strings.charAt(i));
        }
        System.out.println("Stack");
        for (Character i : stack) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("Queue");
        for (Character i : queue) {
            System.out.print(i);
        }

        boolean check = true;
        for (int i = 0; i < strings.length(); i++) {
            if (stack.pop() != queue.remove()) {
                check = false;
            }
        }

        System.out.println();

        if (check) {
            System.out.println("Palindrome");
        } else {
            System.out.println("No palindrome");
        }
    }
}
