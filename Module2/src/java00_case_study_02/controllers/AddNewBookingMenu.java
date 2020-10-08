package java00_case_study_02.controllers;

import java00_case_study_02.commons.FileUntil;
import java00_case_study_02.exceptions.NumberException;
import java00_case_study_02.exceptions.TypeException;
import java00_case_study_02.models.Contract;
import java00_case_study_02.models.ServiceGoWith;
import java00_case_study_02.valids.RegularException;

import java.util.Scanner;

public class AddNewBookingMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static String choiceCustomer = null;

    public static void bookingService() {
        MainMenu.readFileBooking();
        getchoiceCustomer();

        System.out.println("1. Booking Villa. ");
        System.out.println("2. Booking House. ");
        System.out.println("3. Booking Room.");
        System.out.println("4. Back.");
        System.out.println("5. Exit.");

        System.out.print("Enter choice your: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                choiceVilla();
                writeServiceGoWith();
                writeContractVilla();
                FileUntil.writeInFile(MainMenu.PATH_FILE_BOOKING, MainMenu.customerBooking, MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1));
                break;
            case "2":
                choiceHouse();
                writeServiceGoWith();
                writeContractHouse();
                FileUntil.writeInFile(MainMenu.PATH_FILE_BOOKING, MainMenu.customerBooking, MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1));
                break;
            case "3":
                choiceRoom();
                writeServiceGoWith();
                writeContractRoom();
                FileUntil.writeInFile(MainMenu.PATH_FILE_BOOKING, MainMenu.customerBooking, MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1));
                break;
            case "5":
                System.exit(0);
            default:
                MainMenu.displayMainMenu();

        }
    }

    public static void getchoiceCustomer() {
        ShowInforCusTomerMenu.showInforCustomer();
        boolean flag;
        do {
            flag = true;
            try {
                System.out.print("Enter choice the Customer: ");
                choiceCustomer = scanner.nextLine();
                RegularException.exceptionIndexCusTomer(choiceCustomer);
            } catch (IndexOutOfBoundsException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
    }


    public static void choiceVilla() {
        boolean flag;
        ShowServiceMenu.showAllVilla();
        String choiceVilla = null;
        do {
            flag = true;
            try {
                System.out.print("Enter choice Villa: ");
                choiceVilla = scanner.nextLine();
                RegularException.exceptionIndexVilla(choiceVilla);
            } catch (IndexOutOfBoundsException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).setService(MainMenu.villaList.get(Integer.parseInt(choiceVilla) - 1));
        MainMenu.villaList.remove(Integer.parseInt(choiceVilla) - 1);
    }

    public static void choiceHouse() {
        boolean flag;
        ShowServiceMenu.showAllHouse();
        String choiceHouse = null;
        do {
            flag = true;
            try {
                System.out.print("Enter choice House: ");
                choiceHouse = scanner.nextLine();
                RegularException.exceptionIndexHouse(choiceHouse);
            } catch (IndexOutOfBoundsException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).setService(MainMenu.houseList.get(Integer.parseInt(choiceHouse) - 1));
        MainMenu.houseList.remove(Integer.parseInt(choiceHouse) - 1);
    }

    public static void choiceRoom() {
        boolean flag;
        ShowServiceMenu.showAllHouse();
        String choiceRoom = null;
        do {
            flag = true;
            try {
                System.out.print("Enter choice Room: ");
                choiceRoom = scanner.nextLine();
                RegularException.exceptionIndexRoom(choiceRoom);
            } catch (IndexOutOfBoundsException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).setService(MainMenu.roomList.get(Integer.parseInt(choiceRoom) - 1));
        MainMenu.roomList.remove(Integer.parseInt(choiceRoom) - 1);
    }


    public static void writeServiceGoWith() {
        boolean flag;
        System.out.println("Do you want used Service go with ?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        String number = scanner.nextLine();
        while (Integer.parseInt(number) != 1 && Integer.parseInt(number) != 2) {
            System.out.println("Failed!!!--- Again");
            System.out.println("1. Yes");
            System.out.println("2. No");
            number = scanner.nextLine();
        }
        String serviceGoWith = null;
        if (number.equals("1")) {
            do {
                flag = true;
                try {
                    System.out.print("Enter service go with you want: ");
                    serviceGoWith = scanner.nextLine();
                    RegularException.regexService(serviceGoWith);
                } catch (TypeException e) {
                    System.err.println(e.getMessage());
                    System.out.println();
                    flag = false;
                }
            } while (!flag);
            MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).setServiceGoWith(new ServiceGoWith(serviceGoWith));
        }
    }


    public static void writeContractVilla() {
        boolean flag;
        System.out.println("Enter Contract.");
        String numberContractVilla = null;
        do {
            flag = true;
            try {
                System.out.println("Enter number contract: ");
                numberContractVilla = scanner.nextLine();
                RegularException.regexContractVilla(numberContractVilla);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String startDay = enterStartDay();

        String endDate = enterEndDate();

        String deposit = enterDeposit();

        double totalMoney = getTotalMoney();

        Contract contract = new Contract(numberContractVilla, startDay, endDate, Double.parseDouble(deposit), totalMoney);
        MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).setContract(contract);
    }

    public static void writeContractHouse() {
        boolean flag;
        System.out.println("Enter Contract.");
        String numberContractHouse = null;
        do {
            flag = true;
            try {
                System.out.println("Enter number contract: ");
                numberContractHouse = scanner.nextLine();
                RegularException.regexContractHouse(numberContractHouse);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String startDay = enterStartDay();

        String endDate = enterEndDate();

        String deposit = enterDeposit();

        double totalMoney = getTotalMoney();
        Contract contract = new Contract(numberContractHouse, startDay, endDate, Double.parseDouble(deposit), totalMoney);
        MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).setContract(contract);
    }

    public static void writeContractRoom() {
        boolean flag;
        System.out.println("Enter Contract.");
        String numberContractRoom = null;
        do {
            flag = true;
            try {
                System.out.println("Enter number contract: ");
                numberContractRoom = scanner.nextLine();
                RegularException.regexContractRoom(numberContractRoom);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String startDay = enterStartDay();

        String endDate = enterEndDate();

        String deposit = enterDeposit();

        double totalMoney;
        totalMoney = getTotalMoney();
        Contract contract = new Contract(numberContractRoom, startDay, endDate, Double.parseDouble(deposit), totalMoney);
        MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).setContract(contract);
    }

    public static double getTotalMoney() {
        double totalMoney;
        if (MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).getServiceGoWith() == null) {
            totalMoney = MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).getService().getCost();
        } else {
            totalMoney = MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).getService().getCost() +
                    MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).getServiceGoWith().getCost();
        }
        return totalMoney;
    }


    public static String enterDeposit() {
        boolean flag;
        String deposit = null;
        do {
            flag = true;
            try {
                System.out.print("Enter deposit: ");
                deposit = scanner.nextLine();
                RegularException.regexCost(deposit);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        return deposit;
    }

    public static String enterEndDate() {
        boolean flag;
        String endDate = null;
        do {
            flag = true;
            try {
                System.out.print("Enter end date: ");
                endDate = scanner.nextLine();
                RegularException.regexDayContract(endDate);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        return endDate;
    }

    public static String enterStartDay() {
        boolean flag;
        String startDay = null;
        do {
            flag = true;
            try {
                System.out.print("Enter start day: ");
                startDay = scanner.nextLine();
                RegularException.regexDayContract(startDay);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        return startDay;
    }
}
