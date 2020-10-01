package controllers;

import commons.FileUntils;
import libs.*;
import models.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainController {
    public static final String FILE_VILLA = "src/data/villa.csv";
    public static final String FILE_HOUSE = "src/data/house.csv";
    public static final String FILE_ROOM = "src/data/room.csv";
    public static final String FILE_CUSTOMER = "src/data/customer.csv";
    public static final String COMMA = ",";
    public static String tenDichVu;
    public static String dienTichSuDung;
    public static String chiPhiThue;
    public static String soLuongNguoi;
    public static String kieuThue;
    public static int indexCustomer = 1;
    public static int indexVilla = 1;
    public static int indexHouse = 1;
    public static int indexRoom = 1;



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
    static void kiemTraTen(String ten) throws NameException {
        String regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ten);
        if (!matcher.find()) throw new NameException("Nhập lại tên đúng định dạng.");
    }

    static boolean kiemTraTenDichVu(String ten) {
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
    static void kiemTraNgaySinh(String ngaySinh) throws NgaySinhException {
        String regex = "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][0]([1]|[2]|[0])|[1][9]\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ngaySinh);
        if (!matcher.find()) throw new NgaySinhException("Nhập lại ngày sinh đúng định dạng.");
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

    // Kiểm tra giới tính.
    static void kiemTraGioiTinh(String gioiTinh) throws GenderException {
        String regex = "^(nam|nu|Nam|Nu|bede|Bede)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(gioiTinh);
        if (!matcher.find()) throw new GenderException("Nhập lại giới tính đúng định dạng");
    }

    // Kiểm tra số chứng minh.
    static void kiemTraCMND(String cMND) throws IDCardException {
        String regex = "^\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cMND);
        if (!matcher.find()) throw new IDCardException("Nhập lại ID đúng định dạng (XXXXXXXXX)");
    }

    // Kiểm tra số điện thoại.
    static void kiemTraSoDienThoai(String soDienThoai) throws NumberPhoneException {
        String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soDienThoai);
        if (!matcher.find()) throw new NumberPhoneException("Nhập lại số điện thoại đúng định dạng!!!");
    }

    // Kiểm tra email.
    static void kiemTraEmail(String email) throws EmailException {
        String regex = "^\\w{3,}(.?\\w+)*@[a-z]{2,7}(.[a-z]{2,5}){1,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.find()) throw new EmailException("Nhập lại email đúng định dạng");

    }

    // Kiểm tra loại khách hàng.
    static void kiemTraLoaiKhachHang(String loaiKhachHang) throws CustomerException {
        String regex = "^(member|sliver|gold|platinium|diamond|Member|Sliver|Gold|Platinium|Diamond)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(loaiKhachHang);
        if (!matcher.find()) throw new CustomerException("Nhập đúng định dạng");
    }


    //---------------------------------------------


    // Menu Chính.
    public static void displayMainMenu() {
        System.out.println("----------------------------------");
        System.out.println("1. Add New Services.");
        System.out.println("2. Show Services.");
        System.out.println("3. Add New Customer.");
        System.out.println("4. Show Information of Customer.");
        System.out.println("5. Add New Booking.");
        System.out.println("6. Show Information of Employee.");
        System.out.println("7. Exit.");
        System.out.println("----------------------------------");
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
            case 3:
                addNewCustomer();
                displayMainMenu();
                break;
            case 4:
                showInformationCustomers();
                displayMainMenu();
                break;
            case 5:
                addNewBooking();
                displayMainMenu();
                break;
//            case 6:
//                break;
            case 7:
                System.exit(0);
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
                System.exit(0);
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
        while (!kiemTraTenDichVu(tenDichVu)) {
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
        boolean flag = false;
        while (true) {
            while (!kiemTraIDVL(maDichVu)) {
                System.out.print("Nhập lại: ");
                maDichVu = scanner.nextLine();
                flag = false;
            }
            if (flag)
                break;
            while (true) {
                List<String> listLine = FileUntils.readFile(FILE_VILLA);
                for (String list : listLine) {
                    if (maDichVu.equals(list.substring(0, 9))) {
                        System.out.print("Mã đã được sử dụng --- Nhập lại: ");
                        maDichVu = scanner.nextLine();
                        flag = false;
                    }
                    if (!maDichVu.equals(list.substring(0, 9))) {
                        flag = true;
                    }
                }
                if (flag) {
                    break;
                }
            }
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

        System.out.print("Số tầng: ");
        String soTang = scanner.nextLine();
        while (!kiemTraSoTang(soTang)) {
            System.out.print("Nhập lại: ");
            soTang = scanner.nextLine();
        }

        Villa villa = new Villa(maDichVu, tenDichVu, Float.parseFloat(dienTichSuDung), Integer.parseInt(chiPhiThue),
                Integer.parseInt(soLuongNguoi), kieuThue, tieuChuanPhong, moTa, Float.parseFloat(dienTichHoBoi),
                Integer.parseInt(soTang));
        String line = null;

        line = villa.getMaDichVu() + COMMA + villa.getTenDichVu() + COMMA + villa.getDienTichSuDung() + " m^2"
                + COMMA + villa.getChiPhiThue() + " $" + COMMA + villa.getSoLuongNguoi() + " người"
                + COMMA + villa.getKieuThue() + COMMA + villa.getTieuChuanPhong() + COMMA + villa.getMoTa()
                + COMMA + villa.getDienTichHoBoi() + " m^2" + COMMA + villa.getSoTang() + " tầng";
        FileUntils.writeFile(FILE_VILLA, line);
    }

    // Thêm dịch vụ House.
    public static void addNewHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        boolean flag = false;
        while (true) {
            while (!kiemTraIDHO(maDichVu)) {
                System.out.print("Nhập lại: ");
                maDichVu = scanner.nextLine();
                flag = false;
            }
            if (flag)
                break;
            while (true) {
                List<String> listLine = FileUntils.readFile(FILE_HOUSE);
                for (String list : listLine) {
                    if (maDichVu.equals(list.substring(0, 9))) {
                        System.out.print("Mã đã được sử dụng --- Nhập lại: ");
                        maDichVu = scanner.nextLine();
                        flag = false;
                    }
                    if (!maDichVu.equals(list.substring(0, 9))) {
                        flag = true;
                    }
                }
                if (flag) {
                    break;
                }
            }
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

        House house = new House(maDichVu, tenDichVu, Float.parseFloat(dienTichSuDung), Integer.parseInt(chiPhiThue),
                Integer.parseInt(soLuongNguoi), kieuThue, tieuChuanPhong, moTa, Integer.parseInt(soTang));
        String line = null;

        line = house.getMaDichVu() + COMMA + house.getTenDichVu() + COMMA + house.getDienTichSuDung() + " m^2"
                + COMMA + house.getChiPhiThue() + " $" + COMMA + house.getSoLuongNguoi() + " người"
                + COMMA + house.getKieuThue() + COMMA + house.getTieuChuanPhong() + COMMA + house.getMoTa()
                + COMMA + house.getSoTang() + " tầng";
        FileUntils.writeFile(FILE_HOUSE, line);
    }

    // Thêm dịch vụ Room.
    public static void addNewRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        boolean flag = false;
        while (true) {
            while (!kiemTraIDRO(maDichVu)) {
                System.out.print("Nhập lại: ");
                maDichVu = scanner.nextLine();
                flag = false;
            }
            if (flag)
                break;
            while (true) {
                List<String> listLine = FileUntils.readFile(FILE_ROOM);
                for (String list : listLine) {
                    if (maDichVu.equals(list.substring(0, 9))) {
                        System.out.print("Mã đã được sử dụng --- Nhập lại: ");
                        maDichVu = scanner.nextLine();
                        flag = false;
                    }
                    if (!maDichVu.equals(list.substring(0, 9))) {
                        flag = true;
                    }
                }
                if (flag) {
                    break;
                }
            }
        }

        addService();
        System.out.print("Dịch vụ miễn phí: ");
        String dichVuMienPhi = scanner.nextLine();
        Room room = new Room(maDichVu, tenDichVu, Float.parseFloat(dienTichSuDung), Integer.parseInt(chiPhiThue),
                Integer.parseInt(soLuongNguoi), kieuThue, dichVuMienPhi);
        String line = null;

        line = room.getMaDichVu() + COMMA + room.getTenDichVu() + COMMA + room.getDienTichSuDung() + " m^2"
                + COMMA + room.getChiPhiThue() + " $" + COMMA + room.getSoLuongNguoi() + " người"
                + COMMA + room.getKieuThue() + COMMA + room.getDichVuMienPhi();
        FileUntils.writeFile(FILE_ROOM, line);
    }


    //----------------------------------------------


    // Menu hiển thị danh sách dịch vụ
    public static void showService() {
        System.out.println("---------------------------------------");
        System.out.println("1. Show all Villa.");
        System.out.println("2. Show all House.");
        System.out.println("3. Show all Room.");
        System.out.println("4. Show All Name Villa Not Duplicate.");
        System.out.println("5. Show All Name House Not Duplicate.");
        System.out.println("6. Show All Name Name Not Duplicate.");
        System.out.println("7. Back to menu.");
        System.out.println("8. Exit.");
        System.out.println("---------------------------------------");

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
                System.exit(0);
            default:
                showService();
                break;
        }
    }

    // Hiện thị danh sách dịch vụ Villa.
    public static List<Villa> showAllVilla() {
        List<String> listLine = FileUntils.readFile(FILE_VILLA);
        List<Villa> listVilla = new ArrayList<>();
        for (String line : listLine) {
            String[] split = line.split(",");
            if (split.length != 1) {
                Villa villa = new Villa(split[0],split[1],Float.parseFloat(split[2]),Integer.parseInt(split[3]),Integer.parseInt(split[4]),
                        split[5],split[6], split[7],Float.parseFloat(split[8]),Integer.parseInt(split[9]));
                listVilla.add(villa);
            }
        }
        System.out.println("0. Exit");
        for (Villa villa : listVilla) {
            System.out.println(indexVilla++ + ". " + villa.showInfo() );
        }
        return listVilla;
    }

    // Hiển thị danh sách dịch vụ House.
    public static List<House> showAllHouse() {
        List<String> listLine = FileUntils.readFile(FILE_HOUSE);
        List<House> listHouse = new ArrayList<>();

        for (String line : listLine) {
            String[] split = line.split(",");
            if (split.length != 1) {
                House house = new House(split[0],split[1],Float.parseFloat(split[2]),Integer.parseInt(split[3]),
                        Integer.parseInt(split[4]),split[5],split[6],split[7],Integer.parseInt(split[8]));
                listHouse.add(house);
            }
        }
        System.out.println("0. Exit");
        for (House house : listHouse) {
            System.out.println(indexHouse++ + ". " + house.showInfo());
        }
        return listHouse;
    }

    // Hiển thị danh sách dịch vu Room.
    public static List<Room> showAllRoom() {
        List<String> listLine = FileUntils.readFile(FILE_ROOM);
        List<Room> listRoom = new ArrayList<>();

        for (String line : listLine) {
            String[] split = line.split(",");
            if (split.length != 1) {
                Room room = new Room(split[0],split[1],Float.parseFloat(split[2]),
                        Integer.parseInt(split[3]),Integer.parseInt(split[4]),split[5],split[6]);
                listRoom.add(room);
            }
        }
        System.out.println("0. Exit");
        for (Room room : listRoom) {
            System.out.println(indexRoom++ + ". " + room.showInfo());
        }
        return listRoom;
    }


    //---------------------------------------------------


    public static void addNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        String hoVaTen = "";
        boolean flag;

        do {
            flag = true;
            try {
                System.out.print("Nhập họ và tên: ");
                hoVaTen = scanner.nextLine();
                kiemTraTen(hoVaTen);
            } catch (NameException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);


        String ngaySinh = "";
        do {
            try {
                flag = true;
                System.out.print("Ngày sinh: ");
                ngaySinh = scanner.nextLine();
                kiemTraNgaySinh(ngaySinh);
            } catch (NgaySinhException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }

        } while (!flag);


        String gioiTinh = "";
        do {
            flag = true;
            try {
                System.out.print("Giới tính: ");
                gioiTinh = scanner.nextLine();
                kiemTraGioiTinh(gioiTinh);
            } catch (GenderException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);


        String cMND = "";
        do {
            flag = true;
            try {
                System.out.print("Số chứng minh: ");
                cMND = scanner.nextLine();
                kiemTraCMND(cMND);
            } catch (IDCardException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);


        String soDienThoai = "";
        do {
            flag = true;
            try {
                System.out.print("Số điện thoại: ");
                soDienThoai = scanner.nextLine();
                kiemTraSoDienThoai(soDienThoai);
            } catch (NumberPhoneException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);


        String email = "";
        do {
            try {
                flag = true;
                System.out.print("Email: ");
                email = scanner.nextLine();
                kiemTraEmail(email);
            } catch (EmailException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);


        String loaiKhachHang = "";
        do {
            flag = true;
            try {
                System.out.print("Loại khách hàng: ");
                loaiKhachHang = scanner.nextLine();
                kiemTraLoaiKhachHang(loaiKhachHang);
            } catch (CustomerException e) {
                System.err.println(e.getMessage());
                System.out.println();
                flag = false;
            }
        } while (!flag);


        System.out.print("Địa chỉ: ");
        String diaChi = scanner.nextLine();

        //??????????????????????????????
//        DichVu dichVu = null;

        KhachHang khachHang = new KhachHang(hoVaTen, ngaySinh, gioiTinh, cMND, soDienThoai,
                email, loaiKhachHang, diaChi, null);
        String line;

        line = khachHang.getHoVaTen() + COMMA + khachHang.getNgaySinh() + COMMA + khachHang.getGioiTinh() +
                COMMA + khachHang.getcMND() + COMMA + khachHang.getSoDT() + COMMA + khachHang.getEmail() + COMMA +
                khachHang.getLoaiKhachHang() + COMMA + khachHang.getDiaChi() + COMMA + khachHang.getDichVu();
        FileUntils.writeFile(FILE_CUSTOMER, line);


    }

    //---------------------------------------------------

    public static List<KhachHang> showInformationCustomers() {
        List<String> listline = FileUntils.readFile(FILE_CUSTOMER);
        List<KhachHang> khachHangs = new ArrayList<>();
        for (String list : listline) {
            String[] split = list.split(",");
            if (split.length != 1) {
                KhachHang khachHang = new KhachHang(split[0], split[1], split[2], split[3], split[4], split[5], split[6], split[7], null);
                khachHangs.add(khachHang);
            }
        }
        Collections.sort(khachHangs);
        for (KhachHang khachHang : khachHangs) {
            System.out.println(indexCustomer++ + " " + khachHang.showInfo());
        }
        return khachHangs;
    }

    //---------------------------------------------------

    public static void addNewBooking() {
        Scanner scanner = new Scanner(System.in);
        List<KhachHang> khachHangs = showInformationCustomers();
        System.out.println("-----------------------------");
        System.out.println(indexCustomer++ +". Booking Villa");
        System.out.println(indexCustomer++ +". Booking House");
        System.out.println(indexCustomer++ +". Booking Room");

        System.out.println("Enter choose");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                showAllVilla();

        }
    }

    //----------------------------------------------------

    public static void main(String[] args) {
        displayMainMenu();
    }

}
