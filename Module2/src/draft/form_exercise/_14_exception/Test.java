package draft.form_exercise._14_exception;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        Demo  demo = new Demo();
        try {
            demo.readMyFile_2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
