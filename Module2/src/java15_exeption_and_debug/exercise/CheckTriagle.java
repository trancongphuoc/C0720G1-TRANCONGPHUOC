package java15_exeption_and_debug.exercise;

import java.util.Scanner;

public class CheckTriagle {

    public static void checkTriagle(double a, double b, double c) throws ExceptionTriangle {
        if (a + b  < c || b + c  < a || c + a  < b || a < 0 || b < 0 || c < 0) {
            throw new ExceptionTriangle("Nhập lại cho đúng");
        } else {
            System.out.println("đây là tam giác");
        }
    }

    public static void loop() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập cạnh a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập cạnh b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhập cạnh c: ");
            double c = scanner.nextDouble();
            checkTriagle(a, b, c);
        } catch (ExceptionTriangle e) {
            System.err.println(e.getMessage());
            System.out.println();
//           e.printStackTrace();
//            System.out.println();
            loop();
        } catch (Exception e) {
            System.err.println("Không được nhập chữ");
            System.out.println();
            loop();
        }
    }

    public static void main(String[] args) {
        loop();
    }
}
