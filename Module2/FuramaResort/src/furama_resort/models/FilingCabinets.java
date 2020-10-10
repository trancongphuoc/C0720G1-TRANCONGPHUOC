package furama_resort.models;

import furama_resort.controllers._00_main_menu.MainMenu;
import furama_resort.models.Employee;

import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets {
    public static Stack<Employee> employeeStack = new Stack<>();

    static {
//        MainMenu.readFileEmployee();
//        for (Employee employee: MainMenu.employeeMap.) {
//            employeeStack.push(employee);
//        }
        MainMenu.readFileEmployee();
        for (String key : MainMenu.employeeMap.keySet()) {
            employeeStack.push(MainMenu.employeeMap.get(key));
        }
    }

    public static void findProfileByName() {
        if (employeeStack.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name need find.");
        String nameEmployee = scanner.nextLine();

        while (!employeeStack.isEmpty()) {
            if (employeeStack.peek().getFullName().equals(nameEmployee)) {
                System.out.println(employeeStack.pop().showInFor());
                continue;
            }
            employeeStack.pop();
        }
    }

    public static void findProfileByID() {
        if (employeeStack.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name need find.");
        String nameEmployee = scanner.nextLine();

        while (!employeeStack.isEmpty()) {
            if (employeeStack.peek().getIdEmployee().equals(nameEmployee)) {
                System.out.println(employeeStack.pop().showInFor());
                continue;
            }
            employeeStack.pop();
        }
    }

}
