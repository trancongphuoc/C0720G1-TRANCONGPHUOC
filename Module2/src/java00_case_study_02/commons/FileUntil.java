package java00_case_study_02.commons;

import java.io.*;
import java.util.List;

public class FileUntil {
    public static <E> void updateFile(String pathFile, List<E> list) {
        OutputStream outputStream;
        ObjectOutputStream oos;
        try {
            outputStream = new FileOutputStream(pathFile);
            oos = new ObjectOutputStream(outputStream);
            oos.writeObject(list);
            oos.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static <E> void writeInFile(String pathFile, List<E> list, E obj) {
        OutputStream outputStream;
        ObjectOutputStream oos;
        try {
            outputStream = new FileOutputStream(pathFile);
            oos = new ObjectOutputStream(outputStream);
            list.add(obj);
            oos.writeObject(list);
            oos.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <E> List<E> readFromFile(String pathFile, List<E> list) {
        InputStream inputStream;
        ObjectInputStream ois;
        try {
            inputStream = new FileInputStream(pathFile);
            ois = new ObjectInputStream(inputStream);

            List<E> listobj = (List<E>) ois.readObject();
            for (E obj : listobj) {
                list.add((E) obj);
//                System.out.println(obj);
            }
            ois.close();
            inputStream.close();
        } catch (EOFException e) {
            System.out.println("Empty File!!!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }


}
