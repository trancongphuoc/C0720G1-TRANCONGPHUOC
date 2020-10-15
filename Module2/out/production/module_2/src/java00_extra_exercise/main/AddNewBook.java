package java00_extra_exercise.main;

import java00_extra_exercise.commons.FileUntil;
import java00_extra_exercise.exception.*;
import java00_extra_exercise.models.Library;
import java00_extra_exercise.validate.Validate;

import java.util.Scanner;

public class AddNewBook {
    public static void addNewBook() {
        Scanner scanner = new Scanner(System.in);
        boolean flag;

        String idBook = null;
        do {
            flag = true;
            try {
                System.out.print("Enter ID Book: ");
                idBook = scanner.nextLine();
                Validate.regexIdBook(idBook);
            } catch (IDBookException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);

        String nameBook = null;
        do {
            flag = true;
            try {
                System.out.print("Enter name Book: ");
                nameBook = scanner.nextLine();
                Validate.regexNameBook(nameBook);
            } catch (NameException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);

        String bookType = null;
        do {
            flag = true;
            try {
                System.out.print("Enter book type: ");
                bookType = scanner.nextLine();
                Validate.regexBookType(bookType);
            } catch (BookTypeException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);

        String author = null;
        do {
            flag = true;
            try {
                System.out.print("Enter author: ");
                author = scanner.nextLine();
                Validate.regexNameAuthor(author);
            } catch (NameException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);

        String publishingYear = null;
        do {
            flag = true;
            try {
                System.out.print("Enter publishing year: ");
                publishingYear = scanner.nextLine();
                Validate.regexDay(publishingYear);
            } catch (PublishingYearException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);

        String price = null;
        do {
            flag = true;
            try {
                System.out.print("Enter price: ");
                price = scanner.nextLine();
                Validate.regexPrice(price);
            } catch (PriceException | NumberFormatException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

//        String line = idBook + MainMenu.COMA + nameBook + MainMenu.COMA +
//                bookType + MainMenu.COMA + author + MainMenu.COMA +
//                publishingYear + MainMenu.COMA + price + MainMenu.COMA + description;


        Library library = new Library(idBook,nameBook,bookType,author,publishingYear,Double.parseDouble(price),description);
        MainMenu.listLine = FileUntil.readFile(MainMenu.PATH_FILE);
        MainMenu.listLine.add(library.toString());

        FileUntil.writeFile(MainMenu.PATH_FILE, MainMenu.listLine);
    }
}





















