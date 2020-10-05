package java18_string_and_regex.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNumberPhone {
    private static final String REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    public static boolean valid(String numberPhone) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(numberPhone);
        return matcher.find();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number phone: ");
        String numberPhone = scanner.nextLine();

        if (valid(numberPhone)) {
            System.out.println(numberPhone + " hợp lệ");
        } else {
            System.err.println(numberPhone + " không hợp lệ");
        }
    }
}
