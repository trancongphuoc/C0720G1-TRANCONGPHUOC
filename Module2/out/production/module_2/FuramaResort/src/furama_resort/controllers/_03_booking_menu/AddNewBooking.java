package furama_resort.controllers._03_booking_menu;

import furama_resort.commons.FileUntil;
import furama_resort.controllers._00_main_menu.MainMenu;
import furama_resort.controllers._01_service_menu.ShowService;
import furama_resort.controllers._02_customer_menu.ShowInforCusTomer;
import furama_resort.exceptions.NumberException;
import furama_resort.exceptions.TypeException;
import furama_resort.models.Contract;
import furama_resort.models.ServiceGoWith;
import furama_resort.valids.RegularException;

import java.util.Scanner;

public class AddNewBooking {

    private static Scanner scanner = new Scanner(System.in);
    private static String choiceCustomer = null;

    public static void bookingService() {
        MainMenu.readFileContract();
        getChoiceCustomer();
        System.out.println("----------------------------------------");
        System.out.println("1. Booking Villa. ");
        System.out.println("2. Booking House. ");
        System.out.println("3. Booking Room.");
        System.out.println("4. Back.");
        System.out.println("5. Exit.");
        System.out.println("----------------------------------------");
        System.out.print("Enter choice your: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                getChoiceVilla();
                writeServiceGoWith();
                writeContractVilla();
                FileUntil.writeInFile(MainMenu.PATH_FILE_BOOKING, MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).toString());
                break;
            case "2":
                getChoiceHouse();
                writeServiceGoWith();
                writeContractHouse();
                FileUntil.writeInFile(MainMenu.PATH_FILE_BOOKING,  MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).toString());
                break;
            case "3":
                getChoiceRoom();
                writeServiceGoWith();
                writeContractRoom();
                FileUntil.writeInFile(MainMenu.PATH_FILE_BOOKING,  MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).toString());
                break;
            case "5":
                System.exit(0);
            default:
                MainMenu.displayMainMenu();
        }
    }

    public static void getChoiceCustomer() {
        ShowInforCusTomer.showInforCustomer();
        boolean flag;
        do {
            flag = true;
            try {
                System.out.print("Enter choice the Customer: ");
                choiceCustomer = scanner.nextLine();
                RegularException.exceptionIndexCusTomer(choiceCustomer);
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
    }


    public static void getChoiceVilla() {
        boolean flag;
        ShowService.showAllVilla();
        String choiceVilla = null;
        do {
            flag = true;
            try {
                System.out.print("Enter choice Villa: ");
                choiceVilla = scanner.nextLine();
                RegularException.exceptionIndexVilla(choiceVilla);
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).setService(MainMenu.villaList.get(Integer.parseInt(choiceVilla) - 1));
    }

    public static void getChoiceHouse() {
        boolean flag;
        ShowService.showAllHouse();
        String choiceHouse = null;
        do {
            flag = true;
            try {
                System.out.print("Enter choice House: ");
                choiceHouse = scanner.nextLine();
                RegularException.exceptionIndexHouse(choiceHouse);
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).setService(MainMenu.houseList.get(Integer.parseInt(choiceHouse) - 1));
    }

    public static void getChoiceRoom() {
        boolean flag;
        ShowService.showAllRoom();
        String choiceRoom = null;
        do {
            flag = true;
            try {
                System.out.print("Enter choice Room: ");
                choiceRoom = scanner.nextLine();
                RegularException.exceptionIndexRoom(choiceRoom);
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);
        MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).setService(MainMenu.roomList.get(Integer.parseInt(choiceRoom) - 1));
    }


    public static void writeServiceGoWith() {
        boolean flag;
        System.out.println("Do you want used Service go with ?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("Enter choice your: ");
        String number = scanner.nextLine();
        while (Integer.parseInt(number) != 1 && Integer.parseInt(number) != 2) {
            System.out.println("Failed!!!--- Again");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter choice your: ");
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
        } else {
            MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).setServiceGoWith(new ServiceGoWith("No used"));
        }
    }


    public static void writeContractVilla() {
        boolean flag;
        System.out.println("Enter Contract.");
        String numberContractVilla = null;
        do {
            flag = true;
            try {
                System.out.print("Enter number contract: ");
                numberContractVilla = scanner.nextLine();
                RegularException.regexContractVilla(numberContractVilla);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
            for (Contract contract : MainMenu.contractList) {
                if (contract.getNumberContract().equals(numberContractVilla)) {
                    System.err.println("Number contract have exists.");
                    flag = false;
                }
            }
        } while (!flag);

        String startDay = enterStartDay();

        String endDate = enterEndDate();

        String deposit = enterDeposit();

        double totalMoney = getTotalMoney();

        Contract contract = new Contract(numberContractVilla, startDay, endDate, Double.parseDouble(deposit), totalMoney);

        String line = contract.getNumberContract() + MainMenu.COMA + contract.getDayStart() + MainMenu.COMA + contract.getDayEnd() + MainMenu.COMA + contract.getDeposit() + MainMenu.COMA + contract.getTotalMoney();
        FileUntil.writeInFile(MainMenu.PATH_CONTRACT_FILE, line);
        MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).setContract(contract);



    }

    public static void writeContractHouse() {
        boolean flag;
        System.out.println("Enter Contract.");
        String numberContractHouse = null;
        do {
            flag = true;
            try {
                System.out.print("Enter number contract: ");
                numberContractHouse = scanner.nextLine();
                RegularException.regexContractHouse(numberContractHouse);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
            for (Contract contract : MainMenu.contractList) {
                if (contract.getNumberContract().equals(numberContractHouse)) {
                    System.err.println("Number contract have exists.");
                    flag = false;
                }
            }
        } while (!flag);

        String startDay = enterStartDay();

        String endDate = enterEndDate();

        String deposit = enterDeposit();

        double totalMoney = getTotalMoney();
        Contract contract = new Contract(numberContractHouse, startDay, endDate, Double.parseDouble(deposit), totalMoney);

        String line = contract.getNumberContract() + MainMenu.COMA + contract.getDayStart() + MainMenu.COMA + contract.getDayEnd() + MainMenu.COMA + contract.getDeposit() + MainMenu.COMA + contract.getTotalMoney();
        FileUntil.writeInFile(MainMenu.PATH_CONTRACT_FILE, line);
        MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1).setContract(contract);
    }

    public static void writeContractRoom() {
        boolean flag;
        System.out.println("Enter Contract.");
        String numberContractRoom = null;
        do {
            flag = true;
            try {
                System.out.print("Enter number contract: ");
                numberContractRoom = scanner.nextLine();
                RegularException.regexContractRoom(numberContractRoom);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
            for (Contract contract : MainMenu.contractList) {
                if (contract.getNumberContract().equals(numberContractRoom)) {
                    System.err.println("Number contract have exists.");
                    flag = false;
                }
            }
        } while (!flag);

        String startDay = enterStartDay();

        String endDate = enterEndDate();

        String deposit = enterDeposit();

        double totalMoney;
        totalMoney = getTotalMoney();
        Contract contract = new Contract(numberContractRoom, startDay, endDate, Double.parseDouble(deposit), totalMoney);

        String line = contract.getNumberContract() + MainMenu.COMA + contract.getDayStart() + MainMenu.COMA + contract.getDayEnd() + MainMenu.COMA + contract.getDeposit() + MainMenu.COMA + contract.getTotalMoney();
        FileUntil.writeInFile(MainMenu.PATH_CONTRACT_FILE, line);
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




}
