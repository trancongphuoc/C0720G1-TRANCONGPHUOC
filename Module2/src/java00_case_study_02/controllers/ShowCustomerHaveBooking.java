package java00_case_study_02.controllers;

import java00_case_study_02.models.Customer;

public class ShowCustomerHaveBooking {
    public static void showCustomerHaveBooking() {
        MainMenu.readFileBooking();
        if (MainMenu.customerBooking.isEmpty()) {
            System.err.println("Empty!!!");
        }
        int index = 1;
        for (Customer customer : MainMenu.customerBooking) {
            System.out.println(index++ + " " + customer.showInFor());
        }
    }
}
