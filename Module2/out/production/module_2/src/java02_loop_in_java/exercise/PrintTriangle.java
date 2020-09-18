package java02_loop_in_java.exercise;



public class PrintTriangle {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.print(" * ");
            for (int j = 0; j < i; j++) {
                    System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(" * ");
            for (int j = 1; j < i; j++) {
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
