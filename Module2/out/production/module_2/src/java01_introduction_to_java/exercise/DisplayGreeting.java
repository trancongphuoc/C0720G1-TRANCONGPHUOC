package java01_introduction_to_java.exercise;

import java.util.Scanner;

public class DisplayGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String string = scanner.nextLine();
        System.out.println("Hello " + string);
    }
}
