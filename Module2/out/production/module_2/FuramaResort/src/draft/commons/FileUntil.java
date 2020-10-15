package draft.commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUntil {



    public static void writeInFile(String pathFile, List<String> listLine) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(pathFile,false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : listLine) {

                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String pathFile) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        List<String> listLine = new ArrayList<>();
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
