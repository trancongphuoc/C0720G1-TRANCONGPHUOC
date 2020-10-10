package java00_case_study_02.controllers._00_main_menu;

import java00_case_study_02.commons.FileUntil;
import java00_case_study_02.controllers._01_service_menu.AddNewService;
import java00_case_study_02.controllers._01_service_menu.ShowService;
import java00_case_study_02.controllers._02_customer_menu.AddNewCustomer;
import java00_case_study_02.controllers._02_customer_menu.ShowInforCusTomer;
import java00_case_study_02.controllers._03_booking_menu.AddNewBooking;
import java00_case_study_02.controllers._03_booking_menu.ShowCustomerHaveBooking;
import java00_case_study_02.controllers._04_emplyee_menu.AddNewEmployee;
import java00_case_study_02.controllers._04_emplyee_menu.ShowInforEmployee;
import java00_case_study_02.controllers._05_cinema_menu.Cinema;
import java00_case_study_02.controllers._06_cabinets_menu.CabinetMenu;
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
    public static String PATH_EMPLOYEE_FILE = "src/java00_case_study_02/data/EMPLOYEE.DAT";
    public static List<Villa> villaList = new ArrayList<>();
    public static List<House> houseList = new ArrayList<>();
    public static List<Room> roomList = new ArrayList<>();
    public static List<Customer> customerList = new ArrayList<>();
    public static List<Customer> customerBooking = new ArrayList<>();
    public static List<Employee> employeeList = new ArrayList<>();

    public static void displayMainMenu() {
        String choice;
        do {
            System.out.println("----------------------------------------");
            System.out.println("1. Add new service.");
            System.out.println("2. Show service.");
            System.out.println("3. Add new Customer.");
            System.out.println("4. Show information of Customer.");
            System.out.println("5. Add new booking.");
            System.out.println("6. Show Customer have booking.");
            System.out.println("7. Add new Employee");
            System.out.println("8. Show information of Employee.");
            System.out.println("9. Cinema.");
            System.out.println("10. Find profile employee");
            System.out.println("11. Exit.");
            System.out.println("----------------------------------------");

            System.out.print("Enter choice your: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    AddNewService.ServiceMainMenu();
                    break;
                case "2":
                    ShowService.ShowServicemainMenu();
                    break;
                case "3":
                    AddNewCustomer.addNewCustomer();
                    break;
                case "4":
                    ShowInforCusTomer.showInforCustomer();
                    break;
                case "5":
                    AddNewBooking.bookingService();
                    break;
                case "6":
                    ShowCustomerHaveBooking.showCustomerHaveBooking();
                    break;
                case "7":
                    AddNewEmployee.addNewEmployee();
                    break;
                case "8":
                    ShowInforEmployee.showInforEmployee();
                    break;
                case "9":
                    Cinema.cinemaMenu();
                    break;
                case "10":
                    CabinetMenu.menu();
                    break;
                case "11":
                    System.exit(0);
                default:
                    displayMainMenu();

            }
        } while (Integer.parseInt(choice)>0 && Integer.parseInt(choice) < 12 );

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

    public static void readFileEmployee() {
        employeeList = new ArrayList<>();
        FileUntil.readFromFile(PATH_EMPLOYEE_FILE, employeeList);
    }
}
