package draft.form_exercise;

import java.util.Scanner;

public class Exeption {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        int s = a / b;
//        System.out.println(s);
        try {
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("a");
        }
    }
}
