package java00_extra_exercise.main;

import java00_extra_exercise.models.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static final String PATH_FILE = "src/java00_extra_exercise/data/library.csv";
    public static final String COMA = ",";
    public static List<String> listLine = new ArrayList<>();
    public static List<Library> libraryList;

    public static void mainMenu() {
        String choice;
        do {
            System.out.println("1. Add new book.");
            System.out.println("2. Set book.");
            System.out.println("3. Delete book.");
            System.out.println("4. Find book.");
            System.out.println("5. Show list book.");
            System.out.println("6. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter choice your: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    AddNewBook.addNewBook();
                    break;
                case "2":
                    SetInforBook.setInforBook();
                    break;
                case "3":
                    DeleteBook.deleteBook();
                    break;
                case "4":
                    menuFindBook();
                    break;
                case "5":
                    ShowListBook.showListBook();
                    break;
                case "6":
                    break;
                default:
                    mainMenu();
            }
        } while (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) < 7);
    }

    public static void menuFindBook() {
        String choice;
        do {
            System.out.println("1. Search by ID.");
            System.out.println("2. Search by name.");
            System.out.println("3. Search by author.");
            System.out.println("4. Back.");
            System.out.println("5. Exit.");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter choice your: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    FindBook.searchByID();
                    break;
                case "2":
                    FindBook.searchByName();
                    break;
                case "3":
                    FindBook.searchByAuthor();
                    break;
                case "4":
                    return;
                default:
                    menuFindBook();
            }
        } while (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) < 5);
    }

}
