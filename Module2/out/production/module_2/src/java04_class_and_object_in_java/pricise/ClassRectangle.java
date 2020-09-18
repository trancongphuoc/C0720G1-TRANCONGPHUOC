package java04_class_and_object_in_java.pricise;

import java.util.Scanner;

public class ClassRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height");
        double height = scanner.nextDouble();

        Rectangle myRectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + myRectangle.display());
        System.out.println("Perimeter of the Rectangle: " + myRectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + myRectangle.getArea());
    }

    public static class Rectangle {
        double width, height;

        public Rectangle() {
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }

        public String display() {
            return "Rectangle{" + "width=" + width + ", height=" + height + "}";
        }


    }
}
