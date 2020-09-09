package array_and_method_into_java.pratice;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius,fahrenheit;

        System.out.println("Menu");
        System.out.println("1. Celsius to fahrenheit.");
        System.out.println("2. Fahrenheit to celsius.");
        System.out.println("0. Exit");

        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Celsius: ");
                celsius = scanner.nextDouble();
                System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
                break;
            case 2:
                System.out.print("Enter Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));
                break;
            case 0:
                System.exit(0);
        }



    }


    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }


}
