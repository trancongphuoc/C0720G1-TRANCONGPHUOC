package furama_resort.controllers;

import furama_resort.controllers._00_main_menu.MainMenu;

public class Test {
    public static void main(String[] args) {
        MainMenu.readFileEmployee();
        System.out.println(MainMenu.employeeMap.entrySet());

        MainMenu.displayMainMenu();


    }
}
