package java02_loop_in_java.pratice;

import java.util.Scanner;

public class FindGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        int max = 0;

        if (a >= b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    max = i;
                }
            }
        } else if (a < b) {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    max = i;
                }
            }
        }

        if (a == 0 || b == 0) {
            System.out.println("Not have greatest common divisor");
        } else {
            System.out.println("Geatest common divisor: " + max);
        }

    }
}
