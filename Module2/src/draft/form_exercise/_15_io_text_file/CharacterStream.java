package draft.form_exercise._15_io_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CharacterStream {

    public static final String FILE_PATH = "D:\\Work\\CodeGym\\Class\\C0720G1\\Module_2\\Module2\\src\\_15_io_text_file\\student.csv";

    public static <E> List<E> readFile(){
        List<Student> studentList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader buffReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Student student;
            while ((line = buffReader.readLine())!=null){
                temp = line.split(",");
                student = new Student(Integer.parseInt(temp[0]),temp[1]);
                studentList.add(student);
            }
            buffReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (List<E>) studentList;
    }


    public static void writeFile(Student student) {
        try {
            String line = student.getId() + "," + student.getName()+"\n";
            FileWriter fileWriter = new FileWriter(FILE_PATH,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(line);
            //bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
//        writeFile(new Student(1, "Tu"));
//        writeFile(new Student(2, "Luyen"));

        List<Student> studentList = readFile();
        for (Student student:studentList){
            System.out.println(student);
        }
    }
}
