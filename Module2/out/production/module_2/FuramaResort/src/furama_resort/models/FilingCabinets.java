//package java00_case_study_02.draft.models;
//
//import java00_case_study_02.draft.controllers._00_main_menu.MainMenu;
//
//import java.util.Scanner;
//import java.util.Stack;
//
//public class FilingCabinets {
//    public static Stack<Employee> employeeStack = new Stack<>();
//
//    static {
//        MainMenu.readFileEmployee();
//        for (Employee employee: MainMenu.employeeList) {
//            employeeStack.push(employee);
//        }
//    }
//
//    public static void findProfileByName() {
//        if (employeeStack.isEmpty()) {
//            System.out.println("Empty");
//            return;
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter name need find.");
//        String nameEmployee = scanner.nextLine();
//
//        while (!employeeStack.isEmpty()) {
//            if (employeeStack.peek().getFullName().equals(nameEmployee)) {
//                System.out.println(employeeStack.pop().showInFor());
//                continue;
//            }
//            employeeStack.pop();
//        }
//    }
//
//    public static void findProfileByID() {
//        if (employeeStack.isEmpty()) {
//            System.out.println("Empty");
//            return;
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter name need find.");
//        String nameEmployee = scanner.nextLine();
//
//        while (!employeeStack.isEmpty()) {
//            if (employeeStack.peek().getIdEmployee().equals(nameEmployee)) {
//                System.out.println(employeeStack.pop().showInFor());
//                continue;
//            }
//            employeeStack.pop();
//        }
//    }
//
//}
