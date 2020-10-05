package java18_string_and_regex.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNameClass {
    private static final String REGEX = "^(C|A|P)\\d{4}(G|H|I|K|L|M)$";

    public static boolean validName(String nameClass) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(nameClass);
        return matcher.find();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name class: ");
        String nameClass = scanner.nextLine();
        if (validName(nameClass)) {
            System.out.println(nameClass + " hợp lệ.");
        } else {
            System.err.println(nameClass + " không hợp lệ.");
        }
    }
}
