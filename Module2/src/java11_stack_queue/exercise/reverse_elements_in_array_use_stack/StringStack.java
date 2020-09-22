package java11_stack_queue.exercise.reverse_elements_in_array_use_stack;

import java.util.List;
import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        String mWord = "One two three four five";

        Stack<Character> wStack = new Stack<>();

        for (int i = mWord.length() - 1; i >= 0 ; i--) {
            wStack.push(mWord.charAt(i));
        }

        System.out.println();
        System.out.println("Reverse");
        System.out.println();
        for (Character i : wStack) {
            System.out.print(i);
        }

    }
}
