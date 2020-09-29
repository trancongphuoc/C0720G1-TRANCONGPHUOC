package java13_algorithm_search.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = scanner.nextLine();
        List<Character> strings = new ArrayList<>();

        Character character = string.charAt(0);
        strings.add(string.charAt(0));

        for (int i = 1; i < string.length(); i++) {

            if (string.charAt(i) > character) {
                character = string.charAt(i);
                strings.add(string.charAt(i));
            }
        }

        for (Character character1: strings) {
            System.out.print(character1 + " ");
        }
    }
}
