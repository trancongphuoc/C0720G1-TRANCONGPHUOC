package java00_case_study_james.menu;

import java00_case_study_james.commons.FileUntils;
import java00_case_study_james.models.Dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Word {
    private static Scanner scanner = new Scanner(System.in);

    public static void addNewWord() {
        boolean flag;
        System.out.print("Enter word: ");
        String newWord = scanner.nextLine();

        System.out.print("Enter adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter pronunciation: ");
        String pronunciation = scanner.nextLine();

        List<String> listSynonym = new ArrayList<>();
        do {
            flag = true;
            try {
                System.out.print("Enter amount word synonym: ");
                String number = scanner.nextLine();
                for (int i = 0; i < Integer.parseInt(number); i++) {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    String synonym = scanner.nextLine();
                    listSynonym.add(synonym);
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        } while (!flag);
        Dictionary dictionary = new Dictionary(newWord, adjective, noun, verb, pronunciation, listSynonym);

        MainMenu.listLine = FileUntils.readFile(MainMenu.FILE_PATH);
        MainMenu.listLine.add(dictionary.addInFileCSV());

        FileUntils.writeInFile(MainMenu.FILE_PATH, MainMenu.listLine);
    }

    public static void delWord() {
        Prints.printListWord();

        System.out.print("Enter word need del: ");
        String position = scanner.nextLine();

//        MainMenu.dictionaryList.remove(Integer.parseInt(position) -1);
        MainMenu.listLine.remove(Integer.parseInt(position) - 1);

        FileUntils.writeInFile(MainMenu.FILE_PATH, MainMenu.listLine);
    }
}
