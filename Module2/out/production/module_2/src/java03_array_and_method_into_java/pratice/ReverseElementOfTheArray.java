package java03_array_and_method_into_java.pratice;

import java.util.Scanner;

public class ReverseElementOfTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int temp;
        do {
            System.out.print("Enter length array: ");
            number = scanner.nextInt();
        } while (number > 20);

        //Nhập phần tử cho mảng
        int array[] = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element number: " + (i + 1) + " ");
            array[i] = scanner.nextInt();
        }

        //Mảng trước khi đảo ngược
        System.out.print("Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        //Đảo ngược mảng
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        //Mảng sau khi đảo ngược
        System.out.print("\nReverse array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
