package java06_inheritance.exercise.class_triagle;

import java.util.Scanner;

public  class TestTriagle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Mặc định
        ClassTriagle.Triagle triagle1 = new ClassTriagle.Triagle(5,5,5);
        System.out.println(triagle1);
        System.out.println();
        //Người dùng nhập
        ClassTriagle.Triagle triagle = new ClassTriagle.Triagle();
        System.out.println("Enter color: ");
        String color = scanner.nextLine();
        boolean filled = false;
        System.out.println("Enter side1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side3: ");
        double side3 = scanner.nextDouble();


        triagle.setColor(color);
        triagle.setFilled(filled);
        triagle.setSide1(side1);
        triagle.setSide2(side2);
        triagle.setSide3(side3);
        System.out.println(triagle);
    }
}
