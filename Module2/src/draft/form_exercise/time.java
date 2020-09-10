package draft.form_exercise;

import java.util.Date;

public class time {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis( );
            System.out.println(new Date() + "\n");
            Thread.sleep(6);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis( );
            long diff = end - start;
            System.out.println("Khac nhau la : " + diff);
        } catch (Exception e) {
            System.out.println("Nhan mot exception!");
        }
    }
}
