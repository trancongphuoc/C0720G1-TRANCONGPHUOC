package java06_inheritance.exercise.class_triagle;

import java06_inheritance.pricise.ClassGeometry;

import java.util.Scanner;


//Class shape ở phần pricise
public class Triagle extends ClassGeometry.Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triagle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triagle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triagle() {

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double haflPerimeter = getPerimeter() / 2;
        return Math.sqrt(haflPerimeter * (haflPerimeter - side1) * (haflPerimeter - side2) * (haflPerimeter - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled") +
                "\nTriagle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}' + "\nPerimeter = " + getPerimeter() +
                "\nArea = " + getArea();
    }


}
