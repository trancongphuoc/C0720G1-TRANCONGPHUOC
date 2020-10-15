package java00_case_study_james.menu;

import java00_case_study_james.models.Dictionary;

import java.util.Scanner;


public class Prints {
//    public static void printWord() {
//        MainMenu.readFile();
//        if (MainMenu.dictionaryList.isEmpty()) {
//            System.out.println("Empty!!!");
//            return;
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter the search word: ");
//        String word = scanner.nextLine();
//
//        if (MainMenu.dictionaryMap.get(word) == null) {
//            System.out.println("Not find!!!");
//        } else {
//            System.out.println(MainMenu.dictionaryMap.get(word));
//        }
//    }

    public static void printListWord() {
        Scanner scanner = new Scanner(System.in);
        MainMenu.readFile();
        if (MainMenu.dictionaryList.isEmpty()) {
            System.out.println("Empty!!!");
            return;
        }
        int index = 1;

        for (Dictionary dictionary : MainMenu.dictionaryList) {
            System.out.println(index++ + " " + dictionary.showInfor());
        }


//        for (int i = 0; i < MainMenu.dictionaryList.size(); i++) {
//            System.out.println(MainMenu.dictionaryList.get(i));
//            if (i == 4) {
//                System.out.println("Enter Y");
//                if (scanner.nextLine().equals("Y")) {
//                    continue;
//                } else {
//                    break;
//                }
//            }
//        }
    }
}
