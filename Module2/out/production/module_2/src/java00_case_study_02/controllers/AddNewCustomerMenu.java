package java00_case_study_02.controllers;

import java00_case_study_02.commons.FileUntil;
import java00_case_study_02.exceptions.*;
import java00_case_study_02.models.Customer;
import java00_case_study_02.valids.RegularException;

import java.util.Scanner;

public class AddNewCustomerMenu {
    public static void addNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
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

        String customerType = null;
        do {
            flag = true;
            try {
                System.out.print("Enter customer type: ");
                customerType = scanner.nextLine();
                RegularException.regexCustomerType(customerType);
            } catch (TypeException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);

        Customer customer = new Customer(fullName, dateOfBirth, sex, iDCard, numberPhone,
                email, address, customerType);
        MainMenu.readFileCustomer();
        FileUntil.writeInFile(MainMenu.PATH_CUSTOMER_FILE, MainMenu.customerList, customer);
    }
}
