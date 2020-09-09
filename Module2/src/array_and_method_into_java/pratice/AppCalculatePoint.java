package array_and_method_into_java.pratice;

import java.util.Scanner;

public class AppCalculatePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        do {
            System.out.print("Enter amount students ");
            number = scanner.nextInt();
        } while (number > 30);

        int array[] = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element number " + (i + 1) + ":  ");
            array[i] = scanner.nextInt();
        }
        System.out.print("List: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.println("\nAmount students pass is: " + count);
    }
}
