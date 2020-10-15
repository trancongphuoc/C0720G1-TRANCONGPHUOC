package java00_extra_exercise.main;

import java.util.Scanner;

public class DeleteBook {
    public static void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        String idBook = scanner.nextLine();

        for (int i = 0; i < MainMenu.libraryList.size(); i++) {
            if (MainMenu.libraryList.get(i).getIdBook().equals(idBook)) {
                System.out.println(MainMenu.libraryList.get(i));
            }
        }

        System.out.println("Enter Y");
        String confirm = scanner.nextLine();
        if (confirm.equals("Y")) {
            for (int i = 0; i < MainMenu.libraryList.size(); i++) {
                if (MainMenu.libraryList.get(i).getIdBook().equals(idBook)) {
                    MainMenu.libraryList.remove(i);
                    i--;
                }
            }
        }
        SetInforBook.updateFile();
    }
}
