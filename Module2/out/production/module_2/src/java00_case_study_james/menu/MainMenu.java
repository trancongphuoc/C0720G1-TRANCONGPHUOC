package java00_case_study_james.menu;

import java00_case_study_james.commons.FileUntils;
import java00_case_study_james.models.Dictionary;

import java.util.*;

public class MainMenu {
    public static final String FILE_PATH = "src/java00_case_study_james/data/dictionary.csv";
    public static final String COMA = ",";
    public static List<Dictionary> dictionaryList = new ArrayList<>();

    public static void displayMainMenu() {
        String choice;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Add new word.");
            System.out.println("2. Look up dictionary.");
            System.out.println("3. Delete word.");
            System.out.println("4. Print list word.");

            System.out.print("Enter choice your: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Word.addNewWord();
                    break;
                case "2":
//                    Prints.printWord();
                    break;
                case "3":
                    Word.delWord();
//                    Word.delWordInName();
                    break;
                case "4":
                    Prints.printListWord();
                    break;
                default:
                    displayMainMenu();
            }
        } while (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) < 5);
    }

    public static void readFile() {
        List<String> listLine = FileUntils.readFile(FILE_PATH);
        dictionaryList = new ArrayList<>();
        for (String s : listLine) {
            String[] splitComa = s.split(",");
            String[] splitSemicolon = splitComa[5].split(";");
            List<String> listSynonym = new ArrayList<>(Arrays.asList(splitSemicolon));
            Dictionary dictionary = new Dictionary(splitComa[0], splitComa[1], splitComa[2], splitComa[3], splitComa[4], listSynonym);
            dictionaryList.add(dictionary);
        }
    }
}
