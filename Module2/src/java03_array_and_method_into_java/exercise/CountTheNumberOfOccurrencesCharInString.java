package java03_array_and_method_into_java.exercise;

import java.util.Scanner;

public class CountTheNumberOfOccurrencesCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = scanner.nextLine();
        char c = 'a';
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
