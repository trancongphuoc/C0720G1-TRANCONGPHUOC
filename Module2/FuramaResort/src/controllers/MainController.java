package controllers;

import commons.FileUntils;
import models.DichVu;
import models.House;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static final String FILE_VILLA = "src/data/villa.csv";
    public static final String FILE_HOUSE = "src/data/house.csv";
    public static final String FILE_ROOM = "src/data/room.csv";
    public static final String COMMA = "\t,\t";

    // Menu Chính.
    public static void displayMainMenu() {
        System.out.println("1. Add New Services.");
        System.out.println("2. Show Services.");
        System.out.println("3. Add New Customer.");
        System.out.println("4. Show Information of Customer.");
        System.out.println("5. Add New Booking.");
        System.out.println("6. Show Information of Employee.");
        System.out.println("7. Exit.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addNewService();
                displayMainMenu();
                break;
            case 2:
                showService();
                displayMainMenu();
                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            case 5:
//                break;
//            case 6:
//                break;
            case 7:

                break;
            default:
                displayMainMenu();
                break;

        }
    }


    //--------------------------------------------


    // Menu Thêm dịch vụ.
    public static void addNewService() {
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
        System.out.println("5. Exit");
        Scanner scanner = new Scanner(System.in);

        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addNewVilla();
                addNewService();
                break;
            case 2:
                addNewHouse();
                addNewService();
                break;
            case 3:
                addNewRoom();
                addNewService();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                break;
            default:
                addNewService();
                break;
        }
    }

    // Thêm dịch vụ Villa.
    public static void addNewVilla() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.print("Diện tích sử dụng: ");
        float dienTichSuDung = scanner.nextFloat();
        System.out.print("Chi phí thuê: ");
        int chiPhiThue = scanner.nextInt();
        System.out.print("Số lượng người tối đa: ");
        int soLuongNguoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.print("Tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.print("Mô tả: ");
        String moTa = scanner.nextLine();
        System.out.print("Diện tích hồ bơi: ");
        float dienTichHoBoi = scanner.nextFloat();
        System.out.print("Số tầng");
        int soTang = scanner.nextInt();

        Villa villa = new Villa(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, tieuChuanPhong, moTa, dienTichHoBoi, soTang);
        String line = null;

        line = villa.getTenDichVu() + COMMA + villa.getDienTichSuDung() + " m^2" + COMMA + villa.getChiPhiThue() + " $" + COMMA+ villa.getSoLuongNguoi() + " người" + COMMA + villa.getKieuThue() + COMMA + villa.getTieuChuanPhong() + COMMA + villa.getMoTa() + COMMA + villa.getDienTichHoBoi() + " m^2" + COMMA + villa.getSoTang() + " tầng";
        FileUntils.writeFile(FILE_VILLA,line);
    }

    // Thêm dịch vụ House.
    public static void addNewHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.print("Diện tích sử dụng: ");
        float dienTichSuDung = scanner.nextFloat();
        System.out.print("Chi phí thuê: ");
        int chiPhiThue = scanner.nextInt();
        System.out.print("Số lượng người tối đa: ");
        int soLuongNguoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.print("Tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.print("Mô tả: ");
        String moTa = scanner.nextLine();
        System.out.print("Số tầng");
        int soTang = scanner.nextInt();

        House house = new House(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, tieuChuanPhong, moTa, soTang);
        String line = null;

        line = house.getTenDichVu() + COMMA + house.getDienTichSuDung() + " m^2" + COMMA + house.getChiPhiThue() + " $" + COMMA+ house.getSoLuongNguoi() + " người" + COMMA + house.getKieuThue() + COMMA + house.getTieuChuanPhong() + COMMA + house.getMoTa() + COMMA + house.getSoTang() + " tầng";
        FileUntils.writeFile(FILE_HOUSE,line);
    }

    // Thêm dịch vụ Room.
    public static void addNewRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tên dịch vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.print("Diện tích sử dụng: ");
        float dienTichSuDung = scanner.nextFloat();
        System.out.print("Chi phí thuê: ");
        int chiPhiThue = scanner.nextInt();
        System.out.print("Số lượng người tối đa: ");
        int soLuongNguoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.print("Dịch vụ miễn phí: ");
        String dichVuMienPhi = scanner.nextLine();

        Room room = new Room(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, dichVuMienPhi );
        String line = null;

        line = room.getTenDichVu() + COMMA + room.getDienTichSuDung() + " m^2" + COMMA + room.getChiPhiThue() + " $" + COMMA+ room.getSoLuongNguoi() + " người" + COMMA + room.getKieuThue() + COMMA + room.getDichVuMienPhi();
        FileUntils.writeFile(FILE_ROOM,line);
    }


    //----------------------------------------------


    // Menu hiển thị danh sách dịch vụ
    public static void showService() {
        System.out.println("1. Show all Villa.");
        System.out.println("2. Show all House.");
        System.out.println("3. Show all Room.");
        System.out.println("4. Show All Name Villa Not Duplicate.");
        System.out.println("5. Show All Name House Not Duplicate.");
        System.out.println("6. Show All Name Name Not Duplicate.");
        System.out.println("7. Back to menu.");
        System.out.println("8. Exit.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        int choose = scanner.nextInt();

        switch (choose) {
            case 1:
                showAllVilla();
                showService();
                break;
            case 2:
                showAllHouse();
                showService();
                break;
            case 3:
                showAllRoom();
                showService();
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                displayMainMenu();
                break;
            case 8:
                break;
            default:
                showService();
                break;
        }
    }

    // Hiện thị danh sách dịch vụ Villa.
    public static void showAllVilla() {
        List<String> listLine = FileUntils.readFile(FILE_VILLA);
        for (String list : listLine) {
            System.out.println(list);
        }
    }

    // Hiển thị danh sách dịch vụ House.
    public static void showAllHouse() {
        List<String> listLine = FileUntils.readFile(FILE_HOUSE);
        for (String list : listLine) {
            System.out.println(list);
        }
    }

    // Hiển thị danh sách dịch vu Room.
    public static void showAllRoom() {
        List<String> listLine = FileUntils.readFile(FILE_ROOM);
        for (String list : listLine) {
            System.out.println(list);
        }
    }


    //---------------------------------------------------


    public static void main(String[] args) {
        displayMainMenu();
    }

}
