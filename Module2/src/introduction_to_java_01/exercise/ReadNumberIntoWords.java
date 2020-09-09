package introduction_to_java_01.exercise;

import java.util.Scanner;

public class ReadNumberIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
        int hundreds = 0,dozens = 0,unit = 0;
        if (number > 99 && number < 1000) {
            unit = number % 10;
            number = number/10;
            dozens = number % 10;
            number = number/10;
            hundreds = number;
        } else if (number > 9) {
            unit = number % 10;
            number = number/10;
            dozens = number;
        } else if (number > 0) {
            unit = number;
        } else {
            System.out.println("Failed");
        }



        switch (hundreds) {
            case 1:
                System.out.print("One hunderd ");
                break;
            case 2:
                System.out.print("Tow hunderd ");
                break;
            case 3:
                System.out.print("Three hunderd ");
                break;
            case 4:
                System.out.print("Four hunderd ");
                break;
            case 5:
                System.out.print("Five hunderd ");
                break;
            case 6:
                System.out.print("Six hunderd ");
                break;
            case 7:
                System.out.print("Seven hunderd ");
                break;
            case 8:
                System.out.print("Eight hunderd ");
                break;
            case 9:
                System.out.print("Nine hunderd ");
                break;
        }

        switch (dozens) {
            case 1:
                System.out.print("Tenty");
                break;
            case 2:
                System.out.print("Twenty ");
                break;
            case 3:
                System.out.print("Thirty ");
                break;
            case 4:
                System.out.print("Forty ");
                break;
            case 5:
                System.out.print("Fifty ");
                break;
            case 6:
                System.out.print("Sixties ");
                break;
            case 7:
                System.out.print("Seventis ");
                break;
            case 8:
                System.out.print("eighty");
                break;
            case 9:
                System.out.print("ninety");
                break;
        }

        switch (unit) {
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Tow ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            case 10:
                System.out.print("Ten ");
                break;
        }


    }
}
