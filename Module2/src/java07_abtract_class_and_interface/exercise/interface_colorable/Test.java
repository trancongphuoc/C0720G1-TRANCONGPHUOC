package java07_abtract_class_and_interface.exercise.interface_colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[5];
        shape[0] = new Circle(3.0);
        shape[1] = new Rectangle(4.0,6.0);
        shape[2] = new Square(8.0);
        shape[3] = new Circle(2.0);
        shape[4] = new Rectangle(5.0,7.0);

        System.out.println("Before");
        for (Shape i : shape) {
            System.out.println(i);
        }

    }
}
