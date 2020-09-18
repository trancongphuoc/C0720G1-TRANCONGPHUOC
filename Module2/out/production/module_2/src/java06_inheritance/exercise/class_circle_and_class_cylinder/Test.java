package java06_inheritance.exercise.class_circle_and_class_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3.5);
        circle.setColor("Yellow");
        System.out.println("Circle " + circle);
        System.out.println();
        Cylinder cylinder = new Cylinder(5.0, 3.0, "White");
        System.out.println("Cylinder " + cylinder);
    }
}
