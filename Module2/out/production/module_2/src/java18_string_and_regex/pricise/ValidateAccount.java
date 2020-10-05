package java18_string_and_regex.pricise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public static boolean validateAccount(String string) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }

    public static void main(String[] args) {
        final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
        final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

        for (String s : validAccount) {
            System.out.println("Account is " + s +" is valid: "+ validateAccount(s));
        }

        for (String s : invalidAccount) {
            System.out.println("Account is " + s +" is valid: "+ validateAccount(s));
        }
    }
}
