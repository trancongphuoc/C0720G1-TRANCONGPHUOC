package java03_array_and_method_into_java.exercise;

import java.util.Scanner;

public class CalculateSumDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        int n = scanner.nextInt();
        int array[][] = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element number " + (i+1)+ "," + (j+1) + ": ");
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("Row Number " + (i+1) + ": ");
            for (int value : array[i]) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        int sum = 0;
        //Tổng đường chéo trái sang phải
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j == i) {
                    sum += array[i][j];
                }
            }
        }
        //Tổng đường chéo phải sang trái
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == array.length - i -1) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum: " + sum);

    }
}
