package furama_resort.controllers._05_cinema_menu;

import furama_resort.controllers._00_main_menu.MainMenu;
import furama_resort.controllers._02_customer_menu.ShowInforCusTomer;
import furama_resort.models.Customer;
import furama_resort.valids.RegularException;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cinema {
    private static Queue<Customer> customerQueue = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void cinemaMenu() {
        System.out.println("-----------------------------------");
        System.out.println("1. Buy movie tickets.");
        System.out.println("2. Print list of buy tickets.");
        System.out.println("3. Back.");
        System.out.println("4. Exit.");
        System.out.println("-----------------------------------");
        System.out.print("Enter choice your: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                buyTickets();
                cinemaMenu();
                break;
            case "2":
                printList();
                cinemaMenu();
                break;
            case "3":
                MainMenu.displayMainMenu();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                cinemaMenu();
        }
    }

    public static void buyTickets() {
        boolean flag;
        String choiceCustomer = null;
        ShowInforCusTomer.showInforCustomer();
        do {
            flag = true;
            try {
                System.out.print("Enter customer: ");
                choiceCustomer = scanner.nextLine();
                RegularException.exceptionIndexCusTomer(choiceCustomer);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        customerQueue.add(MainMenu.customerList.get(Integer.parseInt(choiceCustomer) - 1));
    }

    public static void printList() {
        if (customerQueue.isEmpty()) {
            System.err.println("Empty!!!");
        }

        while (!customerQueue.isEmpty()) {
            System.out.println(customerQueue.poll());
        }
    }


}
