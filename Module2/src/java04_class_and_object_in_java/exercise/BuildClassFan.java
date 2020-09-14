package java04_class_and_object_in_java.exercise;

import javax.swing.plaf.SliderUI;

public class BuildClassFan {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10.0);
        fan1.setOn(true);
        fan1.setColor("Yellow");
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println(fan2);
    }

    public static class Fan {
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;
        int speed;
        boolean on;
        double radius = 5.0;
        String color = "Blue";

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public String getOn() {
            if (this.on == false) {
                return "Fan is off";
            } else {
                return "Fan is on";
            }
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return this.radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            return "Speed: " + getSpeed() + "; Color: " + getColor() + "; Radius: " + getRadius() + "; " + getOn();
        }

    }
}
