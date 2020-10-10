package java00_case_study_02.controllers;

import java00_case_study_02.commons.FileUntil;
import java00_case_study_02.controllers._00_main_menu.MainMenu;
import java00_case_study_02.models.*;

public class Test {
    public static void main(String[] args) {

        FileUntil.readFromFile(MainMenu.PATH_FILE_VILLA,MainMenu.villaList);
        FileUntil.readFromFile(MainMenu.PATH_FILE_HOUSE,MainMenu.houseList);
        FileUntil.readFromFile(MainMenu.PATH_FILE_ROOM,MainMenu.roomList);
        FileUntil.readFromFile(MainMenu.PATH_CUSTOMER_FILE,MainMenu.customerList );
        FileUntil.readFromFile(MainMenu.PATH_FILE_BOOKING, MainMenu.customerBooking);
        FileUntil.readFromFile(MainMenu.PATH_EMPLOYEE_FILE, MainMenu.employeeList);


//
//
//        Customer customer = new Customer("Huynh Van Zea", "03/09/1996", "Female",
//                "055145329", "0354992266","lvda.369@gmail.com",
//                "Quang Binh", "Member");
//
//        FileUntil.writeInFile(MainMenu.PATH_CUSTOMER_FILE, MainMenu.customerList, customer);


//        Villa villa = new Villa("SVVL-3962", "Orin", 1500, 2000,
//                10, "day", "5*", "View see",
//                50, 3);
//
//        FileUntil.writeInFile(MainMenu.PATH_FILE_VILLA, MainMenu.villaList, villa);


//        House house = new House("SVHO-9685", "Lois", 1000, 1650,
//                7, "day", "4*", "View see",
//                3);
//
//        FileUntil.writeInFile(MainMenu.PATH_FILE_HOUSE, MainMenu.houseList, house);

//        Room room = new Room("SVHO-8888", "Zies", 150, 500,
//                3, "day", new ServiceGoWithFree("drink"));
//
//        FileUntil.writeInFile(MainMenu.PATH_FILE_ROOM, MainMenu.roomList, room);


//        Employee employee = new Employee("EP-5870","Sakura Han", "03/05/1994",
//                "Female","045569854","0523698745",
//                "kimchi@gmail.com","Da Nang","Junior","Manage",
//                "Magager" , 1000);
//        FileUntil.writeInFile(MainMenu.PATH_EMPLOYEE_FILE,MainMenu.employeeList, employee);


        MainMenu.displayMainMenu();

    }


}
