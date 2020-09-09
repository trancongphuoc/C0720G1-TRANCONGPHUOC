package array_and_method_into_java.pratice;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter value need find");
        String string = scanner.nextLine();
        boolean check = false;
        int flag = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(string)) {
                check = true;
                flag = i + 1;
            }
        }

        if (check == true) {
            System.out.println("The value you need find is in position " + flag + " : " + string);
        } else {
            System.out.println("Not find");
        }
    }
}
