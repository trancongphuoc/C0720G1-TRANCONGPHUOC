package furama_resort.controllers._06_cabinets_menu;

import furama_resort.controllers._00_main_menu.MainMenu;
import furama_resort.models.FilingCabinets;

import java.util.Scanner;

public class CabinetMenu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Employee profile search by name.");
        System.out.println("2. Employee profile search by id.");
        System.out.println("3. Back.");
        System.out.println("4. Exit.");

        System.out.print("Enter choice your: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                FilingCabinets.findProfileByName();
                menu();
                break;
            case "2":
                FilingCabinets.findProfileByID();
                menu();
                break;
            case "3":
                MainMenu.displayMainMenu();
                menu();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                menu();

        }
    }
}
