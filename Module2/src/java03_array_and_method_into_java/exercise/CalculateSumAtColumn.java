package java03_array_and_method_into_java.exercise;

import java.util.Scanner;

public class CalculateSumAtColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        int n = scanner.nextInt();
        System.out.print("Enter width: ");
        int m = scanner.nextInt();
        double array[][] = new double[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element number " + (i+1)+ "," + (j+1) + ": ");
                array[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("Row Number " + (i+1) + ": ");
            for (double value : array[i]) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("Have " + m + " columns");
        System.out.print("You want calculate at column number " );
        int number = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j == (number-1)) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum of column is " + sum);
    }
}
