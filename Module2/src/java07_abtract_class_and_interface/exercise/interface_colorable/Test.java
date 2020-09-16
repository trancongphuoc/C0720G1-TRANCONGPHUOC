package java07_abtract_class_and_interface.exercise.interface_colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(4.0,6.0);
        shapes[2] = new Square(8.0);
        shapes[3] = new Circle(2.0);
        shapes[4] = new Rectangle(5.0,7.0);
        shapes[5] = new Square(3.0);

        System.out.println("Circle: " +((Circle)shapes[0]).getArea());
        System.out.println("Rectangle: " +((Rectangle)shapes[1]).getArea());
        System.out.println("Squre: " +((Square)shapes[2]).getArea());
        System.out.println("Circle: " +((Circle)shapes[3]).getArea());
        System.out.println("Rectangle: " +((Rectangle)shapes[4]).getArea());
        System.out.println("Squre: " +((Square)shapes[5]).getArea());

        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                System.out.println(((Colorable) shape).howToColor());
            }
        }


    }
}
