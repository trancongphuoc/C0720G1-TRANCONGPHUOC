package draft;

import java.util.Scanner;

public class NumberPrime {
    public static void main(String[] args) {
        int x = 1;
        boolean flag = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = false;
                break;
            }

        }
        if (flag == true) {
            System.out.println(x + " is Number Prime");
        } else {
            System.out.println(x + " not Number Prime");
        }

    }
}
