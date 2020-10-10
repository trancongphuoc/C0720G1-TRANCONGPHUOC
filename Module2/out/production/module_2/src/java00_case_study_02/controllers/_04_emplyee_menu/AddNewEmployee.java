package java00_case_study_02.controllers._04_emplyee_menu;

import java00_case_study_02.commons.FileUntil;
import java00_case_study_02.controllers._00_main_menu.MainMenu;
import java00_case_study_02.exceptions.*;
import java00_case_study_02.models.Employee;
import java00_case_study_02.valids.RegularException;

import java.util.Scanner;

public class AddNewEmployee {
    public static void addNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        boolean flag;

        String iDEmployee = null;
        do {
            flag = true;
            try {
                System.err.print("Enter ID Employee: ");
                iDEmployee = scanner.nextLine();
                RegularException.regexIdEmployee(iDEmployee);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String fullName = null;
        do {
            flag = true;
            try {
                System.out.print("Enter full name: ");
                fullName = scanner.nextLine();
                RegularException.regexName(fullName);
            } catch (NameException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String dateOfBirth = null;
        do {
            flag = true;
            try {
                System.out.print("Enter date of birth: ");
                dateOfBirth = scanner.nextLine();
                RegularException.regexDateOfBirth(dateOfBirth);
            } catch (DateOfBirthException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String sex = null;
        do {
            flag = true;
            try {
                System.out.print("Enter sex: ");
                sex = scanner.nextLine();
                RegularException.regexSex(sex);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String iDCard = null;
        do {
            flag = true;
            try {
                System.out.print("Enter ID card: ");
                iDCard = scanner.nextLine();
                RegularException.regexIDCard(iDCard);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String numberPhone = null;
        do {
            flag = true;
            try {
                System.out.print("Enter number phone: ");
                numberPhone = scanner.nextLine();
                RegularException.regexNumberPhone(numberPhone);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String email = null;
        do {
            flag = true;
            try {
                System.out.print("Enter email: ");
                email = scanner.nextLine();
                RegularException.regexEmail(email);
            } catch (EmailException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        String level = null;
        do {
            flag = true;
            try {
                System.out.println("Enter level: ");
                level = scanner.nextLine();
                RegularException.regexLevel(level);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String position = null;
        do {
            flag = true;
            try {
                System.out.print("Enter position: ");
                position = scanner.nextLine();
                RegularException.regexPosition(position);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String department = null;
        do {
            flag = true;
            try {
                System.out.print("Enter department: ");
                department = scanner.nextLine();
                RegularException.regexDepartment(department);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        String salary = null;
        do {
            flag = true;
            try {
                System.err.print("Enter salary: ");
                salary = scanner.nextLine();
                RegularException.regexCost(salary);
            } catch (NumberException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        Employee employee = new Employee(iDEmployee, fullName, dateOfBirth, sex, iDCard,
                numberPhone, email, address, level, position, department, Double.parseDouble(salary));
        MainMenu.readFileEmployee();
        FileUntil.writeInFile(MainMenu.PATH_EMPLOYEE_FILE, MainMenu.employeeList, employee);
    }
}
