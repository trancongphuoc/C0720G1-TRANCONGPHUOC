package draft.form_exercise.test_try_catch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TestTryCatch {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        int c = fileInputStream.read();
        while (c != -1) {
            System.out.print((char) c);
            c = fileInputStream.read();
        }
        fileInputStream.close();
    }

}
