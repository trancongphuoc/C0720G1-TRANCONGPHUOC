package java00_extra_exercise.main;

import java00_extra_exercise.commons.FileUntil;
import java00_extra_exercise.models.Library;

import java.util.ArrayList;

public class ShowListBook {
    public static void readFileBook() {
        MainMenu.libraryList = new ArrayList<>();
        MainMenu.listLine = FileUntil.readFile(MainMenu.PATH_FILE);

        for (String s: MainMenu.listLine) {
            String[] split = s.split(",");
            Library library = new Library(split[0],split[1],split[2],split[3],split[4],Double.parseDouble(split[5]),split[6]);
            MainMenu.libraryList.add(library);
        }
    }

    public static void showListBook() {
        readFileBook();
        if (MainMenu.listLine.isEmpty()) {
            System.out.println("Empty!!!");
        }

        int index = 1;
        for(Library library : MainMenu.libraryList) {
            System.out.println(index++ + " " + library);
        }
    }
}
