package furama_resort.controllers._02_customer_menu;

import furama_resort.commons.FileUntil;
import furama_resort.controllers._00_main_menu.MainMenu;
import furama_resort.exceptions.*;
import furama_resort.models.Customer;
import furama_resort.valids.RegularException;

import java.util.Scanner;

public class AddNewCustomer {
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

//        MainMenu.readFileCustomer();
        String line = customer.getFullName() + MainMenu.COMA + customer.getDateOfBirth() + MainMenu.COMA +
                customer.getSex() + MainMenu.COMA + customer.getIdCard()  + MainMenu.COMA + customer.getNumberPhone()
                + MainMenu.COMA + customer.getEmail() + MainMenu.COMA + customer.getAddress() + MainMenu.COMA + customer.getCustomerType();
        FileUntil.writeInFile(MainMenu.PATH_CUSTOMER_FILE, line);
    }
}
