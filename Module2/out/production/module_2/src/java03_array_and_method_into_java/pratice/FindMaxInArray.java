package java03_array_and_method_into_java.pratice;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        int max = array[0];
        int flag = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value number " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                flag = i + 1;
            }
        }

        System.out.println("Max value is: " + max + " at position " + flag);
    }
}
