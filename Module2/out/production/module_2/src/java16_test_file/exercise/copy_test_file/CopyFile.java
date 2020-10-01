package java16_test_file.exercise.copy_test_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        try {
//            List<String> arrline = new ArrayList<>();
//            FileReader fileReader = new FileReader("src/test_file/exercise/copy_test_file/filecopy.txt");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                arrline.add(line);
//            }
//            bufferedReader.close();
//
//            FileWriter fileWriter = new FileWriter("src/test_file/exercise/copy_test_file/hello.txt", true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//            for (String line2 : arrline) {
//                bufferedWriter.write(line2);
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();


            FileWriter fileWriter = new FileWriter("src/java16_test_file/exercise/copy_test_file/hello.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            FileReader fileReader = new FileReader("src/java16_test_file/exercise/copy_test_file/filecopy.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
