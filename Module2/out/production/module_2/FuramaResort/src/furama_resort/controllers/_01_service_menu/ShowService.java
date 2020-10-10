package furama_resort.controllers._01_service_menu;

import furama_resort.controllers._00_main_menu.MainMenu;
import furama_resort.models.House;
import furama_resort.models.Room;
import furama_resort.models.Villa;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ShowService {
    private static Scanner scanner = new Scanner(System.in);
    public static void ShowServicemainMenu() {
        System.out.println("----------------------------------------");
        System.out.println("1. Show all Villa.");
        System.out.println("2. Show all House.");
        System.out.println("3. Show all Room.");
        System.out.println("4. Show all name Villa not duplicate.");
        System.out.println("5. Show all name House not duplicate.");
        System.out.println("6. Show all name Room not duplicate.");
        System.out.println("7. Back.");
        System.out.println("8. Exit.");
        System.out.println("----------------------------------------");

        System.out.print("Enter choice your: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                showAllVilla();
                ShowServicemainMenu();
                break;
            case "2":
                showAllHouse();
                ShowServicemainMenu();
                break;
            case "3":
                showAllRoom();
                ShowServicemainMenu();
                break;
            case "4":
                showVillaNotDuplicate();
                ShowServicemainMenu();
                break;
            case "5":
                showHouseNotDuplicate();
                ShowServicemainMenu();
                break;
            case "6":
                showRoomNotDuplicate();
                ShowServicemainMenu();
                break;
            case "7":
                MainMenu.displayMainMenu();
                break;
            case "8":
                System.exit(0);
            default:
                ShowServicemainMenu();
        }
    }

    public static void showAllVilla() {
        MainMenu.readFileVilla();
        int index = 1;
        if (MainMenu.villaList.isEmpty()) {
            System.err.println("Villa File Empty!!!");
        }
        for (Villa villa : MainMenu.villaList) {
            System.out.println(index++ + " " + villa.showInFor());
        }
    }

    public static void showAllHouse() {
        MainMenu.readFileHouse();
        if (MainMenu.houseList.isEmpty()) {
            System.err.println("House File Empty!!!");
            System.out.println();
        }
        int index = 1;
        for (House house : MainMenu.houseList) {
            System.out.println(index++ + " " + house.showInFor());
        }
    }

    public static void showAllRoom() {
        MainMenu.readFileRoom();
        if (MainMenu.roomList.isEmpty()) {
            System.err.println("Room File Empty!!!");
            System.out.println();
        }
        int index = 1;
        for (Room room : MainMenu.roomList) {
            System.out.println(index++ + " " + room.showInFor());
        }
    }

    public static void showVillaNotDuplicate() {
//        MainMenu.readFileVilla();
        if (MainMenu.villaList.isEmpty()) {
            System.err.println("Villa File Empty!!!");
            System.out.println();
        }
        int index = 1;
        Set<Villa> villasSet = new TreeSet<>(MainMenu.villaList);

        for (Villa villa : villasSet) {
            System.out.println(index++ + " " + villa.showInFor());
        }
    }

    public static void showHouseNotDuplicate() {
//        MainMenu.readFileHouse();
        if (MainMenu.houseList.isEmpty()) {
            System.err.println("House File Empty!!!");
            System.out.println();
        }
        int index = 1;
        Set<House> housesSet = new TreeSet<>();
        housesSet.addAll(MainMenu.houseList);

        for (House house : housesSet) {
            System.out.println(index++ + " " + house.showInFor());
        }
    }

    public static void showRoomNotDuplicate() {
//        MainMenu.readFileRoom();
        if (MainMenu.roomList.isEmpty()) {
            System.err.println("Room File Empty!!!");
            System.out.println();
        }
        int index = 1;
        Set<Room> roomsSet = new TreeSet<>();
        roomsSet.addAll(MainMenu.roomList);

        for (Room room : roomsSet) {
            System.out.println(index++ + " " + room.showInFor());
        }
    }
}
