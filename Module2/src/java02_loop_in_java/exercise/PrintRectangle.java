package java02_loop_in_java.exercise;

import java.util.Scanner;

public class PrintRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length");
        int length = scanner.nextInt();
        System.out.println("Enter Width");
        int width = scanner.nextInt();

        for (int i = 0; i < width; i++) {
            System.out.print(" * ");
            for (int j = 0; j < length; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
