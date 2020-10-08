package java00_case_study_02.controllers;

import java00_case_study_02.commons.FileUntil;
import java00_case_study_02.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static Scanner scanner = new Scanner(System.in);
    public static String PATH_FILE_VILLA = "src/java00_case_study_02/data/VILLA.DAT";
    public static String PATH_FILE_HOUSE = "src/java00_case_study_02/data/HOUSE.DAT";
    public static String PATH_FILE_ROOM = "src/java00_case_study_02/data/ROOM.DAT";
    public static String PATH_CUSTOMER_FILE = "src/java00_case_study_02/data/CUSTOMER.DAT";
    public static String PATH_FILE_BOOKING = "src/java00_case_study_02/data/BOOKING.DAT";
    public static String PATH_EMPLOYEE = "src/java00_case_study_02/data/EMPLOYEE.DAT";
    public static List<Villa> villaList = new ArrayList<>();
    public static List<House> houseList = new ArrayList<>();
    public static List<Room> roomList = new ArrayList<>();
    public static List<Customer> customerList = new ArrayList<>();
    public static List<Customer> customerBooking = new ArrayList<>();
    public static List<Employee> employeeList = new ArrayList<>();
    public static void displayMainMenu() {
        System.out.println("----------------------------------------");
        System.out.println("1. Add new service.");
        System.out.println("2. Show service.");
        System.out.println("3. Add new Customer.");
        System.out.println("4. Show information of Customer.");
        System.out.println("5. Add new booking.");
        System.out.println("6. Show Customer have booking.");
        System.out.println("6. Show information of Employee.");
        System.out.println("7. Cinema.");
        System.out.println("8. Employee profile search.");
        System.out.println("9. Exit.");
        System.out.println("----------------------------------------");

        System.out.print("Enter choice your: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                AddNewServiceMenu.ServiceMainMenu();
//                MainMenu.readFileVilla();
                displayMainMenu();
                break;
            case "2":
                ShowServiceMenu.ShowServicemainMenu();
//                MainMenu.readFileHouse();
                displayMainMenu();
                break;
            case "3":
                AddNewCustomerMenu.addNewCustomer();
//                MainMenu.readFileRoom();
                displayMainMenu();
                break;
            case "4":
                ShowInforCusTomerMenu.showInforCustomer();
                displayMainMenu();
                break;
            case "5":
                AddNewBookingMenu.bookingService();
                displayMainMenu();
                break;
            case "6":
                ShowCustomerHaveBooking.showCustomerHaveBooking();
                displayMainMenu();
                break;
//            case "7":
//                displayMainMenu();
//                break;
//            case "8":
//                displayMainMenu();
//                break;
            case "9":
                System.exit(0);
            default:
                displayMainMenu();

        }
    }

    public static void readFileVilla() {
        villaList = new ArrayList<>();
        FileUntil.readFromFile(PATH_FILE_VILLA, villaList);
    }

    public static void readFileHouse() {
        houseList = new ArrayList<>();
        FileUntil.readFromFile(PATH_FILE_HOUSE, houseList);
    }

    public static void readFileRoom() {
        roomList = new ArrayList<>();
        FileUntil.readFromFile(PATH_FILE_ROOM, roomList);
    }

    public static void readFileCustomer() {
        customerList = new ArrayList<>();
        FileUntil.readFromFile(PATH_CUSTOMER_FILE, customerList);
    }

    public static void readFileBooking() {
        customerBooking = new ArrayList<>();
        FileUntil.readFromFile(PATH_FILE_BOOKING, customerBooking);
    }
}
