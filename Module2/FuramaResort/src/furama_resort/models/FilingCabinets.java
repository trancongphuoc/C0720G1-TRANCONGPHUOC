package furama_resort.models;

import furama_resort.controllers._00_main_menu.MainMenu;
import furama_resort.controllers._04_emplyee_menu.ShowInforEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FilingCabinets {
    public static Stack<Employee> employeeStack = new Stack<>();
    public static List<Employee> employeeList = new ArrayList<>();

    static {
        MainMenu.readFileEmployee();
        for (String key : MainMenu.employeeMap.keySet()) {
            employeeStack.push(MainMenu.employeeMap.get(key));
            employeeList.add(MainMenu.employeeMap.get(key));
        }
    }

    public static void putProfileInTheCabinet() {
        Scanner scanner = new Scanner(System.in);
        ShowInforEmployee.showInforEmployee();
        System.out.print("Enter choice: ");
        String choice = scanner.nextLine();
        employeeStack.push(employeeList.get(Integer.parseInt(choice ) -1));
    }

    public static void findProfileByName() {
        boolean flag = false;
        if (employeeStack.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name need find: ");
        String nameEmployee = scanner.nextLine();

        while (!employeeStack.isEmpty()) {
            if (employeeStack.peek().getFullName().equals(nameEmployee)) {
                System.out.println(employeeStack.pop().showInFor());
                flag = true;
                continue;
            }
            employeeStack.pop();
        }
        if (!flag) {
            System.out.println("Not find!!!");
        }
    }

    public static void findProfileByID() {
        boolean flag = false;
        if (employeeStack.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name need find: ");
        String nameEmployee = scanner.nextLine();

        while (!employeeStack.isEmpty()) {
            if (employeeStack.peek().getIdEmployee().equals(nameEmployee)) {
                System.out.println(employeeStack.pop().showInFor());
                flag = true;
                continue;
            }
            employeeStack.pop();
        }
        if (!flag) {
            System.err.println("Not find!!!");
        }
    }

}
