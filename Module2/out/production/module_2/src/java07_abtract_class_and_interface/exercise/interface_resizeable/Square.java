package java07_abtract_class_and_interface.exercise.interface_resizeable;

public class Square extends Rectangle {
    public void resize(double percent) {

        setSide(getSide() + getSide()*percent/100);


    }
    public Square() {
    }

    public Square(double side) {
        super(side, side);

    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

//    @Override
//    public void setWidth(double width) {
//        setSide(width);
//    }
//
//    @Override
//    public void setLength(double length) {
//        setSide(length);
//    }

    @Override
    public String toString() {
        return "Square: \nGet Area " + getArea() + "\nGet Perimeter " + getPerimeter();
    }
}
