package java06_inheritance.exercise;

public class ClassPoint2DAndClassPoint3D {
    public static class Point2D {
        private float x = 0.0f;
        private float y = 0.0f;
        public Point2D() {

        }

        public Point2D(float x, float y) {
            this.x = x;
            this.y = y;
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
            float[] xy = {x,y};
            return xy;
        }

        public void setXY(float x,float y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point2D {" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public static class Point3D extends Point2D {
        private float z = 0.0f;
        public Point3D() {
        }
        public Point3D(float z) {
            this.z = z;
        }
        public Point3D(float x, float y,float z) {
            super(x, y);
            this.z = z;
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }
        public float[] getXYZ() {
            float xyz[] = {getX(),getY(),z};
            return xyz;
        }

        public void setXYZ(float x, float y,float z) {
            setX(x);
            setY(y);
            this.z = z;
        }

        @Override
        public String toString() {
            return "Point3D {" +
                    "x=" + getX() +
                    ", y=" + getY() +
                    ", z=" + z +
                    '}';
        }
    }
    public static class test{
        public static void main(String[] args) {
            Point2D point2D = new Point2D(5.0f,7.9f);
            System.out.println(point2D);
            Point3D point3D = new Point3D(9.1f,6.0f,8.2f);
            System.out.println(point3D);
        }
    }
}
