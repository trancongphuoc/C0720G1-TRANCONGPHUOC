package java00_case_study_james.menu;

import java00_case_study_james.models.Dictionary;

import java.util.Map;
import java.util.Scanner;

public class Prints {
    public static void printWord() {
        MainMenu.readFile();
        if (MainMenu.dictionaryMap.isEmpty()) {
            System.out.println("Empty!!!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the search word: ");
        String word = scanner.nextLine();

        if (MainMenu.dictionaryMap.get(word) == null) {
            System.out.println("Not find!!!");
        } else {
            System.out.println(MainMenu.dictionaryMap.get(word));
        }
    }

    public static void printListWord() {
        MainMenu.readFile();
        if (MainMenu.dictionaryMap.isEmpty()) {
            System.out.println("Empty!!!");
            return;
        }

        int index = 1;
        for (String key : MainMenu.dictionaryMap.keySet()) {
            System.out.println(index++ + ". " + key + " : " + MainMenu.dictionaryMap.get(key));
        }
    }
}
