package java16_test_file.pricise;

import java.io.*;

public class Sum {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/java16_test_file/pricise/filesum.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println("File khong ton tai hoac noi dung co loi");
        }

    }
}
