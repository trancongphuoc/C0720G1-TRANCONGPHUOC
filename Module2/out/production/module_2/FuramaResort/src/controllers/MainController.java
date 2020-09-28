package controllers;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu() {
        System.out.println("1. Add New Services.");
        System.out.println("2. Show Services.");
        System.out.println("3. Add New Customer.");
        System.out.println("4. Show Information of Customer.");
        System.out.println("5. Add New Booking.");
        System.out.println("6. Show Information of Employee.");
        System.out.println("7. Exit.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
//                addNewServices();
                displayMainMenu();
                break;
            case 2:
//                showServices();
                displayMainMenu();
                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
//            case 6:
//                break;
            case 7:
                break;

        }
    }


    public static void addNewService() {
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
        System.out.println("5. Exit");
    }
}
