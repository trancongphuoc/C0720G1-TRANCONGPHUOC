package java11_stack_queue.exercise.reverse_elements_in_array_use_stack;

import java.util.Stack;

public class IntergerStack {
    public static void main(String[] args) {
        System.out.println();
        Stack<Integer> myList = new Stack<Integer>();
        int arr[] = {1,2,3,4,5};


        for (int i : arr) {
            System.out.println(i);
        }

        for (int i = 0; i < arr.length; i++) {
            myList.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = myList.pop();
        }

        System.out.println();
        System.out.println("Reverse");
        System.out.println();
        for (int i : arr) {
            System.out.println(i);
        }
//        myList.push(1);
//        myList.push(2);
//        myList.push(3);
//        myList.push(4);
//        myList.push(5);
//        Stack<Integer> myList2 = new Stack<Integer>();
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//        int flag = myList.size();
//        for (int i = 0; i < flag; i++) {
//            myList2.push(myList.pop());
//        }
//        System.out.println("Reverse");
//        for (Integer i : myList2) {
//            System.out.println(i);
//        }
    }

}
