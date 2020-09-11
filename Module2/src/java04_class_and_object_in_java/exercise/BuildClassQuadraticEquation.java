package java04_class_and_object_in_java.exercise;

import java.util.Scanner;

public class BuildClassQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        System.out.println(quadraticEquation.display());
        System.out.println(quadraticEquation.displayResult());
    }

    public static class QuadraticEquation {
        double a, b, c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getDiscriminant() {
            return (Math.pow(b,2) - 4 * a * c);
        }

        public double getRoot1() {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        }

        public double getRoot2() {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        }

        public String display() {
            return "a = " + getA() + "; b = " + getB() + "; c = " + getC();
        }

        public String displayResult() {
            if (getDiscriminant() > 0) {
                return "x1 = " + getRoot1() + "\nx2 = " + getRoot2();
            } else if (getDiscriminant() < 0) {
                return "No solution";
            } else {
                return "x1 = x2 = " + getRoot1();
            }

        }
    }
}
