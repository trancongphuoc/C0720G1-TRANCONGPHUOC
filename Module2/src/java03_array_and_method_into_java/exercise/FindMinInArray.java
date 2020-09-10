package java03_array_and_method_into_java.exercise;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int length = scanner.nextInt();
        int array[] = new int[length];


        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element number " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("\nValue min of array: " + min);
    }
}
