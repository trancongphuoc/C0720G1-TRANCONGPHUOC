package java02_loop_in_java.pratice;

import java.util.Scanner;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number prime you want to display: ");
        int n = scanner.nextInt();
        int x = 2;
        int count = 0;
        boolean check = true;

        while (count < n) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            if (check == true) {
                count++;
                System.out.println(x);
            }
            x++;
        }

    }
}
