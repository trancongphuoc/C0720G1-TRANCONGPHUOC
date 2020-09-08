package introduction_to_java_01.pratice;

import java.util.Scanner;

public class UseOperator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input width: ");
        width = scanner.nextFloat();
        System.out.println("Input height: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area = " + area);
    }
}
