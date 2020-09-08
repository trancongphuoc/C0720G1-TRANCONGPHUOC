package loop_in_java.pratice;

public class DisplayPrimeNumberLess100 {
    public static void main(String[] args) {
        int x = 2;
        boolean flag = true;

        while (x < 100) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag == true) {
                System.out.println("Prime Number: " + x);
            }
            x++;
        }

    }
}
