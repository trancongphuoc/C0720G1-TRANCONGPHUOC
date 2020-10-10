//package java00_case_study_02.draft.controllers._04_emplyee_menu;
//
//import java00_case_study_02.draft.controllers._00_main_menu.MainMenu;
//import java00_case_study_02.draft.models.Employee;
//
//import java.util.Map;
//import java.util.TreeMap;
//
//public class ShowInforEmployee {
//    public static void showInforEmployee() {
//        int index = 1;
//        MainMenu.readFileEmployee();
//        Map<String, Employee> employeeMap = new TreeMap<>();
//        for (Employee employee : MainMenu.employeeList) {
//            employeeMap.put(employee.getIdEmployee(), employee);
//        }
//
//        for (String key : employeeMap.keySet()) {
//            System.out.println(index++ + ": " + key + " " + employeeMap.get(key).showInFor());
//        }
//
//    }
//}
