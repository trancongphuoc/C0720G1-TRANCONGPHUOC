package java06_inheritance.exercise;

public class ClassCircleAndClassCylinder {
    public static class Circle {
        private double radius = 1.0;
        private String color = "Red";

        public Circle() {

        }

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }

        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        @Override
        public String toString() {
            return "{" +
                    "radius= " + radius +
                    ", color= '" + color + '\'' +
                    '}' + "\nArea = " + getArea() +
                    "\nPerimeter = " + getPerimeter();
        }
    }

    public static class Cylinder extends Circle {
        private double height;

        public Cylinder() {

        }

        public Cylinder(double height) {
            this.height = height;
        }

        public Cylinder(double height, double radius, String color) {
            super(radius, color);
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getVolume() {
            return getArea() * height;
        }
        public String toString() {
            return super.toString() + "\nVolume = " + getVolume();
        }
    }
    public static class Test {
        public static void main(String[] args) {
            Circle circle = new Circle();
            circle.setRadius(3.5);
            circle.setColor("Yellow");
            System.out.println("Circle " + circle);
            Cylinder cylinder = new Cylinder(5.0,3.0,"White");
            System.out.println("Cylinder " + cylinder);
        }
    }

}
