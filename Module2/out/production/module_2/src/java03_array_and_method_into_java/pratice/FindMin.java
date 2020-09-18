package java03_array_and_method_into_java.pratice;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element number " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Array: ");
        for (int value : array) {
            System.out.print(value + "  ");
        }

        System.out.print("\nMin value is: " + findMin(array));

    }

    public static int findMin (int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
