package array_and_method_ịn_java.pratice;

import java.util.Scanner;

public class ReverseElementOfTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        System.out.println("Enter size array: ");
        int n = scanner.nextInt();
        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }
}
