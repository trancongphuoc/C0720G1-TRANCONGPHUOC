package array_and_method_into_java.exercise;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 5, 6, 3, 4, 9, 7};
        System.out.println("Enter position need add :");
        int position = scanner.nextInt();
        System.out.println("Enter element need add:");
        int element = scanner.nextInt();
        int flag = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == position) {
//                flag = array[i];
                for (int j = 0; j < array.length - i - 1; j++) {
                    array[i] = array[i-1];
                }
                array[i] = element;
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
