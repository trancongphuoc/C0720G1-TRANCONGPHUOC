package java11_stack_queue.exercise.convert_decimal_system_into_binary_system;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class DecimalInto_Binary {
     static String dicimalIntoBynary(int number) {
        String strings = "";
        Stack<Integer> temp = new Stack<Integer>();
        do {
            temp.push(number%2);
            number /=2;
        }
        while (number != 0);
        Stack<Integer> binary = new Stack<Integer>();
        int size = temp.size();
        for (int i = 0; i < size ; i++) {
            binary.push(temp.pop());
        }
        for (Integer i : binary) {
            strings = strings + i + " ";
        }
        return strings;
    }


    static int binaryIntoDecimal(int number) {
        Map<Integer, Integer> temp = new TreeMap<Integer, Integer>();
        int numberDecimal = 0;
        int flag = 1;
        temp.put(flag, number%10);
        number /= 10;
        while (number >= 1) {
            temp.put(flag *= 2 , number%10 );
            number /= 10;
        }
        for (Integer key : temp.keySet()) {
            System.out.println(key + " : " + temp.get(key));
        }

        for (Integer key : temp.keySet()) {
            if (temp.get(key) == 1) {
                numberDecimal += key;
            }
        }
        return numberDecimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.println(dicimalIntoBynary(number));
        System.out.println(binaryIntoDecimal(1101111));


    }
}
