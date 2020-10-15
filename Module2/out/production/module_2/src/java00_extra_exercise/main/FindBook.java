package java00_extra_exercise.main;

import java.util.Scanner;

public class FindBook {
    private static Scanner scanner = new Scanner(System.in);
    public static void searchByID() {
        System.out.println("Enter ID:");
        String idBook = scanner.nextLine();
        boolean flag = false;

        for (int i = 0; i < MainMenu.libraryList.size(); i++) {
            if (MainMenu.libraryList.get(i).getIdBook().equals(idBook)) {
                System.out.println(MainMenu.libraryList.get(i));
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Not find!!!");
        }
    }

    public static void searchByName() {
        System.out.println("Enter name:");
        String nameBook = scanner.nextLine();
        boolean flag = false;

        for (int i = 0; i < MainMenu.libraryList.size(); i++) {
            if (MainMenu.libraryList.get(i).getNameBook().equals(nameBook)) {
                System.out.println(MainMenu.libraryList.get(i));
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Not find!!!");
        }
    }

    public static void searchByAuthor() {
        System.out.println("Enter ID:");
        String author = scanner.nextLine();
        boolean flag = false;

        for (int i = 0; i < MainMenu.libraryList.size(); i++) {
            if (MainMenu.libraryList.get(i).getAuthor().equals(author)) {
                System.out.println(MainMenu.libraryList.get(i));
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Not find!!!");
        }
    }
}
