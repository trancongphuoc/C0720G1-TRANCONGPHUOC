package java11_stack_queue.exercise.reverse_elements_in_array_use_stack;

import java.util.List;
import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        String mWord = "One two three four five";

        Stack<Character> wStack = new Stack<>();

        //Cach 1
//        for (int i = mWord.length() - 1; i >= 0 ; i--) {
//            wStack.push(mWord.charAt(i));
//        }
//
//        System.out.println();
//        System.out.println("Reverse");
//        System.out.println();
//        for (Character i : wStack) {
//            System.out.print(i);
//        }



        // Cach 2
        String outp = "";
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i));
        }

        System.out.println();
        System.out.println("Reverse char");

        for (int i = 0; i < mWord.length(); i++) {
            outp += wStack.pop();
        }
        System.out.println(outp);



        //Cach 3
        Stack<String> wStack1 = new Stack<>();

        String[] strings;
        strings = mWord.split("\\s");

        for (int i = 0; i < strings.length; i++) {
            wStack1.push(strings[i]);
        }
        System.out.println("Reverse vocabulary");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(wStack1.pop() + " ");
        }


    }
}
