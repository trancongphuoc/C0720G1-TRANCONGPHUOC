package controllers;

import commons.FileUntils;
import models.DichVu;
import models.House;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainController {
    public static final String FILE_VILLA = "src/data/villa.csv";
    public static final String FILE_HOUSE = "src/data/house.csv";
    public static final String FILE_ROOM = "src/data/room.csv";
    public static final String COMMA = "\t,\t";
    public static List<DichVu> lists = new ArrayList<>();
    public static String tenDichVu;
    public static String dienTichSuDung;
    public static String chiPhiThue;
    public static String soLuongNguoi;
    public static String kieuThue;

    // Kiểm tra mã dịch vụ Villa.
    static boolean kiemTraIDVL(String id) {
        String regex = "SVVL-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.find();
    }

    // Kiểm tra mã dịch vụ HOUSE.
    static boolean kiemTraIDRO(String id) {
        String regex = "SVRO-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.find();
    }

    // Kiểm tra mã dịch vụ ROOM.
    static boolean kiemTraIDHO(String id) {
        String regex = "SVHO-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.find();
    }

    // Kiểm tra tên.
    static boolean kiemTraTen(String ten) {
        String regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ten);
        return matcher.find();
    }

    // Kiểm tra diện tích hồ bơi.
    static boolean kiemTraDienTich(String dienTich) {
        String regex = "^([3][0]+.\\d+)|([3][1-9]+.?\\d*)|([4-9]\\d+.?\\d*)|(\\d{3,}.?\\d*)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dienTich);
        return matcher.find();
    }

    // Kiểm tra chi phí thuê.
    static boolean kiemTraChiPhi(String chiPhi) {
        String regex = "^[1-9]\\d*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(chiPhi);
        return matcher.find();
    }

    // Kiểm tra số lượng người thuê.
    static boolean kiemTraSoLuongNguoi(String soLuongNguoi) {
        String regex = "^\\d|[1]\\d$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soLuongNguoi);
        return matcher.find();
    }

    // Kiểm tra dịch vụ.
    static boolean kiemTraDichVu(String dichVu) {
        String regex = "^(massage|karaoke|food|drink|car|Massage|Karaoke|Food|Drink|Car)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dichVu);
        return matcher.find();
    }

    // Kiểm tra ngày sinh.
    static boolean kiemTraNgaySinh(String ngaySinh) {
        String regex = "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][0]([1]|[2]|[0])|[1]\\d{3})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ngaySinh);
        return matcher.find();
    }

    // Kiểm tra số tầng.
    static boolean kiemTraSoTang(String soTang) {
        String regex = "[1-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soTang);
        return matcher.find();
    }

    // Kiểm tra kiểu thuê.
    static boolean kiemTraKieuThue(String kieuThue) {
        String regex = "^(gio|ngay|tuan|thang|nam|Gio|Ngay|Tuan|Thang|Nam)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(kieuThue);
        return matcher.find();
    }


    //---------------------------------------------


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

    //Thêm dịch vụ
    public static void addService() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tên dịch vụ: ");
        tenDichVu = scanner.nextLine();
        while (!kiemTraTen(tenDichVu)) {
            System.out.print("Nhập đúng định dạng(Xyyy Xyyy): ");
            tenDichVu = scanner.nextLine();
        }

        System.out.print("Diện tích sử dụng: ");
        dienTichSuDung = scanner.nextLine();
        while (!kiemTraDienTich(dienTichSuDung)) {
            System.out.print("Nhập đúng định dạng(> 30): ");
            dienTichSuDung = scanner.nextLine();
        }

        System.out.print("Chi phí thuê: ");
        chiPhiThue = scanner.nextLine();
        while (!kiemTraChiPhi(chiPhiThue)) {
            System.out.print("Nhập đúng định dạng: ");
            chiPhiThue = scanner.nextLine();
        }

        System.out.print("Số lượng người tối đa: ");
        soLuongNguoi = scanner.nextLine();
        while (!kiemTraSoLuongNguoi(soLuongNguoi)) {
            System.out.print("Nhập lại: ");
            soLuongNguoi = scanner.nextLine();
        }

        System.out.print("Kiểu thuê: ");
        kieuThue = scanner.nextLine();
        while (!kiemTraKieuThue(kieuThue)) {
            System.out.print("Nhập lại: ");
            kieuThue = scanner.nextLine();
        }
    }

    // Thêm dịch vụ Villa.
    public static void addNewVilla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        while (!kiemTraIDVL(maDichVu)) {
            System.out.print("Nhập lại: ");
            maDichVu = scanner.nextLine();
        }

        addService();
        System.out.print("Tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.print("Mô tả: ");
        String moTa = scanner.nextLine();

        System.out.print("Diện tích hồ bơi: ");
        String dienTichHoBoi = scanner.nextLine();
        while (!kiemTraDienTich(dienTichHoBoi)) {
            System.out.print("Nhập lại: ");
            dienTichHoBoi = scanner.nextLine();
        }

        System.out.print("Số tầng");
        String soTang = scanner.nextLine();
        while (!kiemTraSoTang(soTang)) {
            System.out.print("Nhập lại: ");
            soTang = scanner.nextLine();
        }

        Villa villa = new Villa(maDichVu, tenDichVu, Float.parseFloat(dienTichSuDung), Integer.parseInt(chiPhiThue), Integer.parseInt(soLuongNguoi), kieuThue, tieuChuanPhong, moTa, Float.parseFloat(dienTichHoBoi), Integer.parseInt(soTang));
        lists.add(villa);
        String line = null;

        line = villa.getMaDichVu() + COMMA + villa.getTenDichVu() + COMMA + villa.getDienTichSuDung() + " m^2" + COMMA + villa.getChiPhiThue() + " $" + COMMA + villa.getSoLuongNguoi() + " người" + COMMA + villa.getKieuThue() + COMMA + villa.getTieuChuanPhong() + COMMA + villa.getMoTa() + COMMA + villa.getDienTichHoBoi() + " m^2" + COMMA + villa.getSoTang() + " tầng";
        FileUntils.writeFile(FILE_VILLA, line);
    }

    // Thêm dịch vụ House.
    public static void addNewHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        while (!kiemTraIDHO(maDichVu)) {
            System.out.print("Nhập lại: ");
            maDichVu = scanner.nextLine();
        }
        addService();
        System.out.print("Tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.print("Mô tả: ");
        String moTa = scanner.nextLine();

        System.out.print("Số tầng");
        String soTang = scanner.nextLine();
        while (!kiemTraSoTang(soTang)) {
            System.out.print("Nhập lại: ");
            soTang = scanner.nextLine();
        }

        House house = new House(maDichVu, tenDichVu, Float.parseFloat(dienTichSuDung), Integer.parseInt(chiPhiThue), Integer.parseInt(soLuongNguoi), kieuThue, tieuChuanPhong, moTa, Integer.parseInt(soTang));
        String line = null;

        line = house.getMaDichVu() + COMMA + house.getTenDichVu() + COMMA + house.getDienTichSuDung() + " m^2" + COMMA + house.getChiPhiThue() + " $" + COMMA + house.getSoLuongNguoi() + " người" + COMMA + house.getKieuThue() + COMMA + house.getTieuChuanPhong() + COMMA + house.getMoTa() + COMMA + house.getSoTang() + " tầng";
        FileUntils.writeFile(FILE_HOUSE, line);
    }

    // Thêm dịch vụ Room.
    public static void addNewRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        while (!kiemTraIDRO(maDichVu)) {
            System.out.print("Nhập lại: ");
            maDichVu = scanner.nextLine();
        }
        addService();
        System.out.print("Dịch vụ miễn phí: ");
        String dichVuMienPhi = scanner.nextLine();
        Room room = new Room(maDichVu, tenDichVu, Float.parseFloat(dienTichSuDung), Integer.parseInt(chiPhiThue), Integer.parseInt(soLuongNguoi), kieuThue, dichVuMienPhi);
        String line = null;

        line = room.getMaDichVu() + COMMA + room.getTenDichVu() + COMMA + room.getDienTichSuDung() + " m^2" + COMMA + room.getChiPhiThue() + " $" + COMMA + room.getSoLuongNguoi() + " người" + COMMA + room.getKieuThue() + COMMA + room.getDichVuMienPhi();
        FileUntils.writeFile(FILE_ROOM, line);
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
