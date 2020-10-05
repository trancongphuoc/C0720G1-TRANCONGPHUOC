package java18_string_and_regex.pricise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public static boolean validate(String string) {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static void main(String[] args) {
        final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
        final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

        for (String s : validEmail) {
            System.out.println("Email: " + s + "is valid: " +validate(s));
        }

        for (String s : invalidEmail) {
            System.out.println("Email: " + s + "is valid: " +validate(s));
        }

    }
}
