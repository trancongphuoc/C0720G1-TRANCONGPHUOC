package java03_array_and_method_into_java.exercise;

import java.util.Scanner;

public class DelElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 5, 3, 6, 5 , 9, 4, 5};
        System.out.println("Enter element need del: ");
        int x = scanner.nextInt();
        int count = 0;

        //Xóa phần tử
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] == x) {
                count++;
                continue;
            }
            array[j] = array[i];
            j++;
        }

        //Gán các phần tử bị xóa = 0 vào cuối mảng
        for (int i = array.length - 1; i > array.length - count - 1; i--) {
            array[i] = 0;
        }

        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
