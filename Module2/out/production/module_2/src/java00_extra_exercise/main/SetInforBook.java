package java00_extra_exercise.main;

import java00_extra_exercise.commons.FileUntil;
import java00_extra_exercise.exception.*;
import java00_extra_exercise.models.Library;
import java00_extra_exercise.validate.Validate;

import java.util.ArrayList;
import java.util.Scanner;

public class SetInforBook {
    public static void setInforBook() {
        ShowListBook.showListBook();

        boolean flag;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index book need set: ");
        String choice = scanner.nextLine();
        if (choice.equals("")) {
            return;
        }

        System.out.println("1. " + MainMenu.libraryList.get(Integer.parseInt(choice)-1).getIdBook());
        System.out.println("2. " + MainMenu.libraryList.get(Integer.parseInt(choice)-1).getNameBook());
        System.out.println("3. " + MainMenu.libraryList.get(Integer.parseInt(choice)-1).getBookType());
        System.out.println("4. " + MainMenu.libraryList.get(Integer.parseInt(choice)-1).getAuthor());
        System.out.println("5. " + MainMenu.libraryList.get(Integer.parseInt(choice)-1).getPublishingYear());
        System.out.println("6. " + MainMenu.libraryList.get(Integer.parseInt(choice)-1).getPrice());
        System.out.println("7. " + MainMenu.libraryList.get(Integer.parseInt(choice)-1).getDescription());
        System.out.println("8. Back to menu.");
        System.out.println("9. Exit.");

        System.out.print("Enter choice your: ");
        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
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
                MainMenu.libraryList.get(Integer.parseInt(choice) - 1).setIdBook(idBook);
                break;
            case "2":
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
                MainMenu.libraryList.get(Integer.parseInt(choice) - 1).setNameBook(nameBook);
                break;
            case "3":
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
                MainMenu.libraryList.get(Integer.parseInt(choice) - 1).setBookType(bookType);
                break;
            case "4":
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
                MainMenu.libraryList.get(Integer.parseInt(choice) - 1).setAuthor(author);
                break;
            case "5":
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
                MainMenu.libraryList.get(Integer.parseInt(choice) - 1).setPublishingYear(publishingYear);
                break;
            case "6":
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
                MainMenu.libraryList.get(Integer.parseInt(choice) - 1).setPrice(Double.parseDouble(price));
                break;
            case "7":
                System.out.print("Enter description: ");
                String description = scanner.nextLine();
                MainMenu.libraryList.get(Integer.parseInt(choice) - 1).setDescription(description);
                break;
            case "8":
                break;
        }
        updateFile();
    }

    public static void updateFile() {
        MainMenu.listLine = new ArrayList<>();
        for (Library library: MainMenu.libraryList) {
            MainMenu.listLine.add(library.addInFile());
        }
        FileUntil.writeFile(MainMenu.PATH_FILE, MainMenu.listLine);
    }
}
