package java06_inheritance.exercise.class_triagle;

import java.util.Scanner;

public  class TestTriagle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Mặc định
        Triagle triagle1 = new Triagle(5,5,5);
        System.out.println(triagle1);
        System.out.println();
        //Người dùng nhập
        Triagle triagle = new Triagle();

        System.out.print("Enter color: ");
        triagle.setColor(scanner.nextLine());

        System.out.print("Enter Filled (true or false): ");
        triagle.setFilled(scanner.nextBoolean());

        System.out.print("Enter side1: ");
        triagle.setSide1(scanner.nextDouble());

        System.out.print("Enter side2: ");
        triagle.setSide2(scanner.nextDouble());

        System.out.print("Enter side3: ");
        triagle.setSide3(scanner.nextDouble());

        System.out.println(triagle);
    }
}
