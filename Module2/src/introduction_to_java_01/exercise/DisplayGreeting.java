package introduction_to_java_01.exercise;

import java.util.Scanner;

public class DisplayGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String string = scanner.nextLine();
        System.out.println("Hello " + string);
    }
}
