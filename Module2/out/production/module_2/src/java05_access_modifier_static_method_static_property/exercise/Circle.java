package java05_access_modifier_static_method_static_property.exercise;


    public class Circle {
        private double radius = 1.0;
        private String color = "red";

        Circle() {

        }

        Circle(double radius) {
            this.radius = radius;
        }

        private double getRadius() {
            return radius;
        }

        private String getColor() {
            return color;
        }


    static class TestCircle {
        public static void main(String[] args) {
            Circle circle = new Circle(5.0);
            System.out.println(circle.getRadius());
            System.out.println(circle.getColor());
        }
    }
}
