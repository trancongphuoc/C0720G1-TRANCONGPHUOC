package introduction_to_java_01.pratice;

import java.util.Scanner;

public class SolutionQuadraticEquation1 {
    public static void main(String[] args) {
        // ax + b = 0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = scanner.nextDouble();
        System.out.println("Input b: ");
        double b = scanner.nextDouble();
        double x;

        if (a != 0) {
            x = b/a;
            System.out.println("x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
