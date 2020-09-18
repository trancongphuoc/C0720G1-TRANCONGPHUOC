package java06_inheritance.exercise.class_point_and_class_moveable_point;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(5.0f,9.0f);
        System.out.println(point);


        MoveablePoint moveablePoint = new MoveablePoint(3.0f,6.5f);
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
