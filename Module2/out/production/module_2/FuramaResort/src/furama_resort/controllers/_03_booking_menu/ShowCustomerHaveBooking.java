package furama_resort.controllers._03_booking_menu;

import furama_resort.controllers._00_main_menu.MainMenu;
import furama_resort.models.Customer;

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
