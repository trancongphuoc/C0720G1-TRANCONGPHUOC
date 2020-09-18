package java01_introduction_to_java.pratice;

import java.util.Scanner;

public class CalculateBodyWeightIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Input height: ");
        double height = scanner.nextDouble();
        double bmi;

        bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.println("Underweight.");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Normal.");
        } else if (bmi >= 25.0 && bmi <30.0) {
            System.out.println("Overweight");
        } else if (bmi >= 30.0) {
            System.out.println("Obese");
        }
    }
}
