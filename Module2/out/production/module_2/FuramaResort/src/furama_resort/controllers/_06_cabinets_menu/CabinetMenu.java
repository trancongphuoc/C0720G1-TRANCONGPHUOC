package furama_resort.controllers._06_cabinets_menu;

import furama_resort.controllers._00_main_menu.MainMenu;
import furama_resort.models.FilingCabinets;

import java.util.Scanner;

public class CabinetMenu {
    public static void menu() {
        String choice;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Put profile in the cabinet.");
            System.out.println("2. Employee profile search by name.");
            System.out.println("3. Employee profile search by id.");
            System.out.println("4. Back.");
            System.out.println("5. Exit.");

            System.out.print("Enter choice your: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    FilingCabinets.putProfileInTheCabinet();
                    break;
                case "2":
                    FilingCabinets.findProfileByName();
                    break;
                case "3":
                    FilingCabinets.findProfileByID();
                    break;
                case "4":
                    MainMenu.displayMainMenu();
                    break;
                case "5":
                    System.exit(0);
                default:
                    menu();

            }
        } while (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) < 6);
    }
}
