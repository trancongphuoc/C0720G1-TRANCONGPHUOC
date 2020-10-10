package furama_resort.commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUntil {
//    public static <E> void updateFile(String pathFile, List<E> list) {
//        OutputStream outputStream;
//        ObjectOutputStream oos;
//        try {
//            outputStream = new FileOutputStream(pathFile);
//            oos = new ObjectOutputStream(outputStream);
//            oos.writeObject(list);
//            oos.close();
//            outputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    public static void writeInFile(String pathFile,String line) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(pathFile, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static  List readFromFile(String pathFile) {
       FileReader fileReader;
       BufferedReader bufferedReader;
       List listLine = new ArrayList<>();
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
