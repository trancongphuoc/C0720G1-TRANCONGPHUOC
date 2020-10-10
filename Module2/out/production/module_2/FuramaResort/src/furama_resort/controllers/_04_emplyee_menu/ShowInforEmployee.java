package furama_resort.controllers._04_emplyee_menu;

import furama_resort.controllers._00_main_menu.MainMenu;


public class ShowInforEmployee {
    public static void showInforEmployee() {
        int index = 1;
        MainMenu.readFileEmployee();

        for (String key : MainMenu.employeeMap.keySet()) {
            System.out.println(index++ + ": " + key + " " + MainMenu.employeeMap.get(key).showInFor());
        }

    }
}
