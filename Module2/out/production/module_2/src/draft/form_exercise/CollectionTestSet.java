package draft.form_exercise;

import java.util.HashSet;
import java.util.Set;

public class CollectionTestSet {
    public static void main(String[] args) {
        Set a = new HashSet();
        a.add(1);
        a.add(1);
        a.add(1);
        for (Object i : a) {
            System.out.println(i);
        }
    }
}
