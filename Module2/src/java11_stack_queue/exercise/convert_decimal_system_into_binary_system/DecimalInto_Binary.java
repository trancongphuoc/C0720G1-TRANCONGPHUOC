package java11_stack_queue.exercise.convert_decimal_system_into_binary_system;

import java.util.*;

public class DecimalInto_Binary {
    static void dicimalIntoBynary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        String strings = "";
        Stack<Integer> temp = new Stack<>();
        do {
            temp.push(number % 2);
            number /= 2;
        }
        while (number != 0);
        Stack<Integer> binary = new Stack<>();
        int size = temp.size();
        for (int i = 0; i < size; i++) {
            binary.push(temp.pop());
        }
        for (Integer i : binary) {
            strings = strings + i + " ";
        }
        System.out.println(strings);
    }

    static void binaryIntoDecimal() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int number = scanner.nextInt();
//        Map<Integer, Integer> temp = new TreeMap<>();
//        int numberDecimal = 0;
//        int flag = 1;
//        temp.put(flag, number%10);
//        number /= 10;
//        while (number >= 1) {
//            temp.put(flag *= 2 , number%10 );
//            number /= 10;
//        }
//        for (Integer key : temp.keySet()) {
//            System.out.println(key + " : " + temp.get(key));
//        }
//        for (Integer key : temp.keySet()) {
//            if (temp.get(key) == 1) {
//                numberDecimal += key;
//            }
//        }
//        System.out.println(numberDecimal);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        Queue<Integer> temp = new LinkedList<>();
        int numberDecimal = 0;
        int i = 1;
        while (number >= 1) {
            temp.add(number%10);
            number /= 10;
        }
        for (Integer o : temp) {
            System.out.println(o);
        }
        int size = temp.size();
        for (int j = 0; j <size ; j++) {
            if (temp.poll() == 1) {
                numberDecimal = numberDecimal + i;
            }
            i *= 2;
        }
        System.out.println(numberDecimal);
    }


    static void decimalIntoHexadecimalSystem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        String strings = "";
        Stack<Integer> temp = new Stack<>();
        do {
            temp.push(number % 16);
            number /= 16;
        }
        while (number != 0);
        Stack<Integer> binary = new Stack<>();
        int size = temp.size();
        for (int i = 0; i < size; i++) {
            binary.push(temp.pop());
        }
        for (Integer i : binary) {
            if (i == 10) {
                strings = strings + "A" + " ";
                continue;
            } else if (i == 11) {
                strings = strings + "B" + " ";
                continue;
            } else if (i == 12) {
                strings = strings + "C" + " ";
                continue;
            } else if (i == 13) {
                strings = strings + "D" + " ";
                continue;
            } else if (i == 14) {
                strings = strings + "E" + " ";
                continue;
            } else if (i == 15) {
                strings = strings + "F" + " ";
                continue;
            }
            strings = strings + i + " ";
        }
        System.out.println(strings);
    }

    static void hexadecimalSystemIntoDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String number = scanner.nextLine();
        Queue<Integer> temp = new LinkedList<>();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == 'A') {
                temp.add(10);
                continue;
            } else if (number.charAt(i) == 'B') {
                temp.add(11);
                continue;
            } else if (number.charAt(i) == 'C') {
                temp.add(12);
                continue;
            } else if (number.charAt(i) == 'D') {
                temp.add(13);
                continue;
            } else if (number.charAt(i) == 'E') {
                temp.add(14);
                continue;
            } else if (number.charAt(i) == 'F') {
                temp.add(15);
                continue;
            }
            temp.add((int) number.charAt(i) - 48);
        }
        int numberDecimal = 0;
        int size = temp.size();
        for (int i = 0; i < size; i++) {
            numberDecimal = numberDecimal * 16 + temp.poll();

        }
        System.out.println(numberDecimal);

    }

    static void menu() {
        System.out.println("1.Decimal into binary.");
        System.out.println("2.Binary into Decimal.");
        System.out.println("3.Decimal into hexadecimal system.");
        System.out.println("4.Hexadecimal system into decimal.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Selection: ");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                dicimalIntoBynary();
                menu();
                break;
            case 2:
                binaryIntoDecimal();
                menu();
                break;
            case 3:
                decimalIntoHexadecimalSystem();
                menu();
                break;
            case 4:
                hexadecimalSystemIntoDecimal();
                menu();
                break;
        }
    }


    public static void main(String[] args) {
        menu();
    }
}
