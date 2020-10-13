package java00_case_study_james.commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUntils {
    public static void writeInFile(String pathFile, List<String> listLine) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(pathFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s: listLine) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<String> readFile(String pathFile) {
        List<String> listLine = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }

}
