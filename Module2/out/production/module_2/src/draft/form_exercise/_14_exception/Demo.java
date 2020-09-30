package draft.form_exercise._14_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

    public void readMyFile() {
        File file = new File("abc");
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException x) {
            //aaaa
        } catch (Exception e) {
        }
    }

    public void readMyFile_2() throws FileNotFoundException {
        File file = new File("abc");
        FileReader fileReader = new FileReader(file);
    }

    public void div(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.err.println("Ban nhap b = 0 roi.");
        }
    }

    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("doc lai de di ban.");
        } catch (Exception ex) {
            System.err.println("loi sieu to");
        } finally {
            System.err.println("ket thuc chuong trinh");
        }
        return number;
    }

    public int inputNumber2() throws InputException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = 0;
        number = scanner.nextInt();
        if(number == 0){
            throw new InputException("Khong cho nhap O");
        }
        return number;
    }

    public void inputNumber3(){
        try {

            try {

            }catch (NullPointerException n){

            }

        }catch (Exception e){

        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        try {
            int a = demo.inputNumber2();
            int b = demo.inputNumber2();
            demo.div(a, b);
        } catch (InputException e) {
            System.out.println("loi nhap xuat: "+e.getMessage());
        }


    }
}
