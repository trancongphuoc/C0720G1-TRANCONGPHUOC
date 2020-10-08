package java00_case_study_02.controllers;

import java00_case_study_02.models.Customer;

import java.util.Collections;

public class ShowInforCusTomerMenu {
    public static void showInforCustomer() {
        MainMenu.readFileCustomer();
        if (MainMenu.customerList.isEmpty()) {
            System.err.println("Customer File Empty!!!");
            System.out.println();
        }
        int index = 1;
        Collections.sort(MainMenu.customerList);
        for (Customer customer : MainMenu.customerList) {
            System.out.println(index++ + " " + customer.showInFor());
        }
    }
}
