package java02_loop_in_java.exercise;

public class Display20PrimeNumber {
    public static void main(String[] args) {
        int x = 2;
        int count = 0;
        boolean flag = true;

        while (count < 20) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                   flag = false;
                   break;
                } else {
                    flag = true;
                }
            }
            if (flag == true) {
                count++;
                System.out.println("Prime Number " + count + ": " + x);
            }
            x++;
        }

    }
}
