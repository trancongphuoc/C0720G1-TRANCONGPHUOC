package array_and_method_into_java.exercise;

import java.util.Scanner;

public class DelElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,5,3,6,9,4,5};
        int[] array1 = new int[array.length];
        System.out.println("Enter element need del: ");
        int x = scanner.nextInt();
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != x) {
                array1[j] = array[i];
                j++;
            }
        }
        for (int i : array1) {
            System.out.print(i + "\t");
        }
    }
}
