package java15_exeption_and_debug.exercise;

public class ExceptionTriangle extends Exception {
    public ExceptionTriangle(String massage) {
        super(massage);
    }

    public ExceptionTriangle() {
        super("Đây không phải là tam giác");
    }
}
