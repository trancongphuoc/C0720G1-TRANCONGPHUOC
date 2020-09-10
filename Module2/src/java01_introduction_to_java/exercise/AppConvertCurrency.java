package java01_introduction_to_java.exercise;

import java.util.Scanner;

public class AppConvertCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input USD: ");
        double usd = scanner.nextDouble();
        double vnd = usd * 23200;
        System.out.println("VND: " + vnd);
    }
}
