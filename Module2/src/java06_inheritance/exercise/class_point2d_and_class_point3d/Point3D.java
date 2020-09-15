package java06_inheritance.exercise.class_point2d_and_class_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
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
        float xyz[] = {getX(), getY(), z};
        return xyz;
    }

    public void setXYZ(float x, float y, float z) {
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
