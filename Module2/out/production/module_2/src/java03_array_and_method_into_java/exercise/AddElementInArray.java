package java03_array_and_method_into_java.exercise;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 5, 6, 3, 4, 9, 7};
        System.out.println("Enter position need add :");
        int position = scanner.nextInt();
        System.out.println("Enter element need add:");
        int element = scanner.nextInt();


        for (int i = 0; i < array.length; i++) {
            if (i == position) {
                for (int j = array.length - 1; j > position; j--) {
                    array[j] = array[j - 1];
                }
                array[i] = element;
            }

        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
