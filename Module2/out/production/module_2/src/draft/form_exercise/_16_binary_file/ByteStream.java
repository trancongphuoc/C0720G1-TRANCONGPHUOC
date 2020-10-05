package draft.form_exercise._16_binary_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ByteStream {

    public static final String FILE_PATH = "D:\\Work\\CodeGym\\Class\\C0720G1\\Module_2\\Module2\\src\\_16_binary_file\\student.dat";

    public static void writeObject(Student student) {
        FileOutputStream fos;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(FILE_PATH);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(student);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void writeObjectList(List<Student> studentList) {
        FileOutputStream fos;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(FILE_PATH);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(studentList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static Student readObject() {
        FileInputStream fis;
        ObjectInputStream ois = null;
        Student student = null;

        try {
            fis = new FileInputStream(FILE_PATH);
            ois = new ObjectInputStream(fis);

            student = (Student) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return student;
    }

    public static List<Student> readObjectList() {
        FileInputStream fis;
        ObjectInputStream ois = null;
        List<Student> studentList = null;

        try {
            fis = new FileInputStream(FILE_PATH);
            ois = new ObjectInputStream(fis);

            studentList = (List<Student>) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return studentList;
    }


    public static void main(String[] args) {
//        writeObject(new Student(2,"Luyen", new Role(1)));
//        System.out.println(readObject());
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Tu", new Role(1)));
        studentList.add(new Student(2, "Luyen", new Role(1)));

        writeObjectList(studentList);

        List<Student> output = readObjectList();

        for (Student student : output) {
            System.out.println(student);
        }
    }
}
