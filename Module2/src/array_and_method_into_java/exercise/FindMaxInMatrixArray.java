package array_and_method_into_java.exercise;

import java.util.Scanner;

public class FindMaxInMatrixArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        int n = scanner.nextInt();
        System.out.print("Enter width: ");
        int m = scanner.nextInt();
        int array[][] = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element number  " + (i+1)+ "," + (j+1) + ": ");
                array[i][j] = scanner.nextInt();
            }
        }

        double max = array[0][0];
        int x = 0;
        int y = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println("Value max is " + max + " at position " + x + "," + y);
    }
}
