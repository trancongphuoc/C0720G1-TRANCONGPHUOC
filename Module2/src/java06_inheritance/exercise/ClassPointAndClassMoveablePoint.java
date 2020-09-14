package java06_inheritance.exercise;

public class ClassPointAndClassMoveablePoint {
    public static class Point {
        private float x = 0.0f;
        private float y = 0.0f;

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public Point() {

        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public float[] getXY() {
            float[] xy = {x, y};
            return xy;
        }

        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static class MoveablePoint extends Point {
        private float xSpeed = 0.0f;
        private float ySpeed = 0.0f;

        public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public MoveablePoint(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public MoveablePoint() {

        }

        public float getxSpeed() {
            return xSpeed;
        }

        public void setxSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }

        public float getySpeed() {
            return ySpeed;
        }

        public void setySpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }

        public float[] getXY() {
            float[] xySpeed = {xSpeed, ySpeed};
            return xySpeed;
        }

        public void setXY(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        @Override
        public String toString() {
            return "MoveablePoint{" +
                    "x=" + getX() +
                    ", y=" + getY() +
                    ", xSpeed=" + xSpeed +
                    ", ySpeed=" + ySpeed +
                    '}';
        }

        public MoveablePoint move() {
            setX(getX() + xSpeed);
            setY(getY() + ySpeed);
            return this;
        }
    }
    public static class Test {
        public static void main(String[] args) {
            Point point = new Point(5.0f,9.0f);
            System.out.println(point);
            MoveablePoint moveablePoint = new MoveablePoint(3.0f,6.5f);
            System.out.println(moveablePoint);
            moveablePoint.move();
            System.out.println(moveablePoint);
        }
    }
}
