package java00_case_study_02.controllers;

import java00_case_study_02.commons.FileUntil;
import java00_case_study_02.exceptions.*;
import java00_case_study_02.models.House;
import java00_case_study_02.models.Room;
import java00_case_study_02.models.Villa;
import java00_case_study_02.valids.RegularException;

import java.util.Scanner;

public class AddNewServiceMenu {
    private static Scanner scanner = new Scanner(System.in);

    private static String nameService;
    private static String area;
    private static String cost;
    private static String amountOfPeople;
    private static String rentType;

    public static void ServiceMainMenu() {
        System.out.println("----------------------------------------");
        System.out.println("1. Add new Villa.");
        System.out.println("2. Add new House.");
        System.out.println("3. Add new Room.");
        System.out.println("4. Back.");
        System.out.println("5. Exit.");
        System.out.println("----------------------------------------");

        System.out.print("Enter choice your: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                addNewVilla();
                ServiceMainMenu();
                break;
            case "2":
                addNewHouse();
                ServiceMainMenu();
                break;
            case "3":
                addNewRoom();
                ServiceMainMenu();
                break;
            case "4":
                MainMenu.displayMainMenu();
                break;
            case "5":
                System.exit(0);
            default:
                ServiceMainMenu();
        }
    }

    public static void addNewService() {
        boolean flag;
        do {
            flag = true;
            try {
                System.out.print("Enter name Service: ");
                nameService = scanner.nextLine();
                RegularException.regexName(nameService);
            } catch (NameException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);


        do {
            flag = true;
            try {
                System.out.print("Enter area Villa: ");
                area = scanner.nextLine();
                RegularException.regexArea(area);
            } catch (AreaException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);


        do {
            flag = true;
            try {
                System.out.print("Enter cost Villa: ");
                cost = scanner.nextLine();
                RegularException.regexCost(cost);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);


        do {
            flag = true;
            try {
                System.out.print("Enter a mount of people: ");
                amountOfPeople = scanner.nextLine();
                RegularException.regexAmountOfPeople(amountOfPeople);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);


        do {
            flag = true;
            try {
                System.out.print("Enter rent type: ");
                rentType = scanner.nextLine();
                RegularException.regexRentType(rentType);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

    }

    public static void addNewVilla() {
        boolean flag;

        String iDVilla = null;
        do {
            flag = true;
            try {
                System.out.print("Enter ID Villa: ");
                iDVilla = scanner.nextLine();
                RegularException.regexIDVilla(iDVilla);
            } catch (IDServiceException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
            for (Villa villa : MainMenu.villaList) {
                if (villa.getIdService().equals(iDVilla)){
                    System.err.print("Mã dịch vụ đã tồn tại --- Vui lòng nhập lại: ");
                    flag = false;
                }
            }
        } while (!flag);

        addNewService();

        System.out.print("Enter standard room: ");
        String standardRoom = scanner.nextLine();

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        String poolArea = null;
        do {
            flag = true;
            try {
                System.out.print("Enter pool area: ");
                poolArea = scanner.nextLine();
                RegularException.regexArea(poolArea);
            } catch (AreaException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);


        String numberOfFloor = null;
        do {
            flag = true;
            try {
                System.out.print("Enter number of floor: ");
                numberOfFloor = scanner.nextLine();
                RegularException.regexNumberOfFloor(numberOfFloor);
            } catch (NumberException e) {
                System.out.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        Villa villa = new Villa(iDVilla, nameService, Double.parseDouble(area), Double.parseDouble(cost),
                Integer.parseInt(amountOfPeople), rentType, standardRoom,
                description, Double.parseDouble(poolArea), Integer.parseInt(numberOfFloor));

        MainMenu.readFileVilla();
        FileUntil.writeInFile(MainMenu.PATH_FILE_VILLA, MainMenu.villaList, villa);
    }

    public static void addNewHouse() {
        boolean flag;

        String iDHouse = null;
        do {
            flag = true;
            try {
                System.out.print("Enter ID House: ");
                iDHouse = scanner.nextLine();
                RegularException.regexIDHouse(iDHouse);
            } catch (IDServiceException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
            for (House house : MainMenu.houseList) {
                if (house.getIdService().equals(iDHouse)){
                    System.err.print("Mã dịch vụ đã tồn tại --- Vui lòng nhập lại: ");
                    flag = false;
                }
            }
        } while (!flag);

        addNewService();

        System.out.print("Enter standard room: ");
        String standardRoom = scanner.nextLine();

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        String numberOfFloor = null;
        do {
            flag = true;
            try {
                System.out.print("Enter number of floor: ");
                numberOfFloor = scanner.nextLine();
                RegularException.regexNumberOfFloor(numberOfFloor);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        House house = new House(iDHouse, nameService, Double.parseDouble(area), Double.parseDouble(cost),
                Integer.parseInt(amountOfPeople), rentType, standardRoom, description,
                Integer.parseInt(numberOfFloor));
        MainMenu.readFileHouse();
        FileUntil.writeInFile(MainMenu.PATH_FILE_HOUSE, MainMenu.houseList, house);
    }

    public static void addNewRoom() {
        boolean flag;

        String iDRoom = null;
        do {
            flag = true;
            try {
                System.out.print("Enter ID House: ");
                iDRoom = scanner.nextLine();
                RegularException.regexIDRoom(iDRoom);
            } catch (IDServiceException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
            for (Room room : MainMenu.roomList) {
                if (room.getIdService().equals(iDRoom)){
                    System.err.print("Mã dịch vụ đã tồn tại --- Vui lòng nhập lại: ");
                    flag = false;
                }
            }
        } while (!flag);

        addNewService();

        Room room = new Room(iDRoom, nameService, Double.parseDouble(area),
                Double.parseDouble(cost), Integer.parseInt(amountOfPeople), rentType);
        MainMenu.readFileRoom();
        FileUntil.writeInFile(MainMenu.PATH_FILE_ROOM, MainMenu.roomList, room);
    }

}
