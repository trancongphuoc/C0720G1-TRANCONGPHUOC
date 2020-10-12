package furama_resort.controllers._00_main_menu;

import furama_resort.commons.FileUntil;
import furama_resort.controllers._01_service_menu.AddNewService;
import furama_resort.controllers._01_service_menu.ShowService;
import furama_resort.controllers._02_customer_menu.AddNewCustomer;
import furama_resort.controllers._02_customer_menu.ShowInforCusTomer;

import furama_resort.controllers._03_booking_menu.AddNewBooking;
import furama_resort.controllers._03_booking_menu.ShowCustomerHaveBooking;
import furama_resort.controllers._04_emplyee_menu.AddNewEmployee;
import furama_resort.controllers._04_emplyee_menu.ShowInforEmployee;
import furama_resort.controllers._05_cinema_menu.Cinema;
import furama_resort.controllers._06_cabinets_menu.CabinetMenu;
import furama_resort.models.*;

import java.util.*;

public class MainMenu {
    public static final String COMA = ",";
    public static final String PATH_FILE_VILLA = "src/furama_resort/data/villa.csv";
    public static final String PATH_FILE_HOUSE = "src/furama_resort/data/house.csv";
    public static final String PATH_FILE_ROOM = "src/furama_resort/data/room.csv";
    public static final String PATH_CUSTOMER_FILE = "src/furama_resort/data/customer.csv";
    public static final String PATH_FILE_BOOKING = "src/furama_resort/data/booking.csv";
    public static final String PATH_EMPLOYEE_FILE = "src/furama_resort/data/employee.csv";
    public static final String PATH_CONTRACT_FILE = "src/furama_resort/data/contract.csv";
    public static List<Villa> villaList;
    public static List<House> houseList;
    public static List<Room> roomList;
    public static List<Customer> customerList;
    public static List<Customer> customerBooking;
    public static Map<String, Employee> employeeMap;
    public static List<Contract> contractList;


    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
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
        } while (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) < 12);

    }


    public static void readFileVilla() {
        villaList = new ArrayList<>();
        List<String> stringList = FileUntil.readFromFile(MainMenu.PATH_FILE_VILLA);
        for (String s : stringList) {
            String[] split = s.split(",");
            Villa villa = new Villa(split[0], split[1], Double.parseDouble(split[2]),
                    Double.parseDouble(split[3]), Integer.parseInt(split[4]), split[5],
                    split[6], split[7], Double.parseDouble(split[8]), Integer.parseInt(split[9]));
            villaList.add(villa);
        }
    }

    public static void readFileHouse() {
        houseList = new ArrayList<>();
        List<String> stringList = FileUntil.readFromFile(MainMenu.PATH_FILE_HOUSE);
        for (String s : stringList) {
            String[] split = s.split(",");
            House house = new House(split[0], split[1], Double.parseDouble(split[2]),
                    Double.parseDouble(split[3]), Integer.parseInt(split[4]), split[5],
                    split[6], split[7], Integer.parseInt(split[8]));
            houseList.add(house);
        }
    }

    public static void readFileRoom() {
        roomList = new ArrayList<>();
        List<String> stringList = FileUntil.readFromFile(MainMenu.PATH_FILE_ROOM);
        for (String s : stringList) {
            String[] split = s.split(",");
            Room room = new Room(split[0], split[1], Double.parseDouble(split[2]),
                    Double.parseDouble(split[3]), Integer.parseInt(split[4]), split[5],
                    new ServiceGoWithFree(split[6]));
            roomList.add(room);
        }
    }

    public static void readFileCustomer() {
        customerList = new ArrayList<>();
        List<String> stringList = FileUntil.readFromFile(MainMenu.PATH_CUSTOMER_FILE);
        for (String s : stringList) {
            String[] split = s.split(",");
            Customer customer = new Customer(split[0], split[1], split[2], split[3], split[4], split[5], split[6], split[7]);
            customerList.add(customer);
        }
    }

    public static void readFileContract() {
        contractList = new ArrayList<>();
        List<String> stringList = FileUntil.readFromFile(MainMenu.PATH_CONTRACT_FILE);
        for (String s : stringList) {
            String[] split = s.split(",");
            Contract contract = new Contract(split[0], split[1], split[2], Double.parseDouble(split[3]), Double.parseDouble(split[4]));
            contractList.add(contract);
        }
    }

    public static void readFileBooking() {
        MainMenu.readFileContract();
        MainMenu.readFileVilla();
        MainMenu.readFileHouse();
        MainMenu.readFileRoom();
        customerBooking = new ArrayList<>();
        List<String> stringList = FileUntil.readFromFile(MainMenu.PATH_FILE_BOOKING);
        Service book = null;
        Contract contractbook = null;
        for (String s : stringList) {
            String[] split = s.split(",");
            for (Villa villa : villaList) {
                if (villa.getIdService().equals(split[8])) {
                    book = villa;
                }
            }
            for (House house : houseList) {
                if (house.getIdService().equals(split[8])) {
                    book = house;
                }
            }
            for (Room room : roomList) {
                if (room.getIdService().equals(split[8])) {
                    book = room;
                }
            }

            for (Contract contract : contractList) {
                if (contract.getNumberContract().equals(split[10])) {
                    contractbook = contract;
                }
            }
            Customer customerBooking = new Customer(split[0], split[1], split[2], split[3], split[4],
                    split[5], split[6], split[7], book, new ServiceGoWith(split[9]), contractbook);
            MainMenu.customerBooking.add(customerBooking);
        }
    }

    public static void readFileEmployee() {
        employeeMap = new TreeMap<>();
        List<String> stringList = FileUntil.readFromFile(PATH_EMPLOYEE_FILE);
        for (String s : stringList) {
            String[] split = s.split(",");
            Employee employee = new Employee(split[0], split[1], split[2], split[3], split[4], split[5],
                    split[6], split[7], split[8], split[9], split[10], Double.parseDouble(split[11]));
            employeeMap.put(split[0],employee);
        }
    }
}
