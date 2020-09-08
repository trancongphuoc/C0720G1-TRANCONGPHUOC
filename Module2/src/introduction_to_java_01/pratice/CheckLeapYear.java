package introduction_to_java_01.pratice;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input year need check: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("This not a leap year");
            } else {
                System.out.println("This is a leap year");
            }
        } else {
            System.out.println("This not a leap year");
        }
    }
}
