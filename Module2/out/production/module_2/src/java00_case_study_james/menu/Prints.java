package java00_case_study_james.menu;

import java00_case_study_james.models.Dictionary;

import java.util.Scanner;

public class Prints {
    public static void printWord() {
        MainMenu.readFile();

        if (MainMenu.dictionaryList.isEmpty()) {
            System.out.println("Empty!!!");
            return;
        }


        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the search word: ");
        String word = scanner.nextLine();

        for (int i = 0; i < MainMenu.dictionaryList.size(); i++) {
            if (MainMenu.dictionaryList.get(i).getWord().equals(word)) {
                System.out.println(MainMenu.dictionaryList.get(i));
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Not find!!!");
        }
    }

    public static void printListWord() {
        MainMenu.readFile();
        int index = 1;


        if (MainMenu.dictionaryList.isEmpty()) {
            System.out.println("Empty!!!");
            return;
        }

        for (Dictionary dictionary : MainMenu.dictionaryList) {
            System.out.println(index++ + ". " + dictionary);
        }
    }
}
