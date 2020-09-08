package loop_in_java.pratice;

import java.util.Scanner;

public class AppInterestCalculate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Deposits: ");
        double deposits = scanner.nextDouble();
        System.out.println("Enter Number Month: ");
        int numberMonth = scanner.nextInt();
        System.out.println("Enter Interest Rate: ");
        double interestRate = scanner.nextDouble();
        double totalInterest = 0;

        for (int i = 0; i < numberMonth; i++) {
            totalInterest += deposits * (interestRate/100)/12 * numberMonth;
        }
        totalInterest += deposits;
        System.out.println("Total Interest and Deposits: " + totalInterest);
    }
}
