package java03_array_and_method_into_java.exercise;

import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array1: ");
        int n = scanner.nextInt();
        System.out.println("Enter length of array2: ");
        int m = scanner.nextInt();
        int array1[] = new int[n];
        int array2[] = new int[m];
        int array3[] = new int[array1.length + array2.length];

        //Nhập phần tử cho mảng array1
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter element number " + (i + 1) + " (array1): ");
            array1[i] = scanner.nextInt();
        }

        //Nhập phần tử cho mảng array2
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element number " + (i + 1)+ " (array2): ");
            array2[i] = scanner.nextInt();
        }

        //Gộp array1 và array2 vào array3.
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < (array1.length + array2.length); i++) {
            array3[i] = array2[i - array1.length];
        }
        for (int i : array3) {
            System.out.print(i + "\t");
        }
    }
}
