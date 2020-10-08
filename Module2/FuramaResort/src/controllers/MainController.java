package controllers;

import commons.FileUntils;
import libs.*;
import models.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainController {
    private static final String FILE_VILLA = "src/data/villa.csv";
    private static final String FILE_HOUSE = "src/data/house.csv";
    private static final String FILE_ROOM = "src/data/room.csv";
    private static final String FILE_CUSTOMER = "src/data/customer.csv";
    private static final String FILE_BOOKING = "src/data/booking.csv";
    private static final String FILE_EMPLOYEE = "src/data/employee.csv";
    private static final String COMMA = ",";
    private static Scanner scanner = new Scanner(System.in);
    private static String tenDichVu;
    private static String dienTichSuDung;
    private static String chiPhiThue;
    private static String soLuongNguoi;
    private static String kieuThue;
    private static List<KhachHang> khachHangs = new ArrayList<>();
    private static List<Villa> villas = new ArrayList<>();
    private static List<House> houses = new ArrayList<>();
    private static List<Room> rooms = new ArrayList<>();
    private static Map<String, NhanVien> nhanVienMap = new TreeMap<>();
    private static Queue<KhachHang> khachHangQueue = new LinkedList<>();
    private static Stack<NhanVien> nhanVienStack = new Stack<>();

    // Kiểm tra mã dịch vụ Villa.
    private static boolean kiemTraIDVL(String id) {
        String regex = "SVVL-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.find();
    }

    // Kiểm tra mã dịch vụ HOUSE.
    private static boolean kiemTraIDRO(String id) {
        String regex = "SVRO-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.find();
    }

    // Kiểm tra mã dịch vụ ROOM.
    private static boolean kiemTraIDHO(String id) {
        String regex = "SVHO-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.find();
    }

    // Kiểm tra tên.
    private static void kiemTraTen(String ten) throws NameException {
        String regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ten);
        if (!matcher.find()) throw new NameException("Nhập lại tên đúng định dạng.");
    }

    // Kiểm tra tên dịch vụ
    private static boolean kiemTraTenDichVu(String ten) {
        String regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ten);
        return matcher.find();
    }

    // Kiểm tra diện tích hồ bơi.
    private static boolean kiemTraDienTich(String dienTich) {
        String regex = "^([3][0]\\.\\d+)|([3][1-9]\\.?\\d*)|([4-9]\\d\\.?\\d*)|(\\d{3,}\\.?\\d*)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dienTich);
        return !matcher.find();
    }

    // Kiểm tra chi phí thuê.
    private static boolean kiemTraChiPhi(String chiPhi) {
        String regex = "^[1-9]\\d*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(chiPhi);
        return matcher.find();
    }

    // Kiểm tra số lượng người thuê.
    private static boolean kiemTraSoLuongNguoi(String soLuongNguoi) {
        String regex = "^[1-9]|[1]\\d$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soLuongNguoi);
        return matcher.find();
    }

//    // Kiểm tra dịch vụ.
//    static boolean kiemTraDichVu(String dichVu) {
//        String regex = "^(massage|karaoke|food|drink|car|Massage|Karaoke|Food|Drink|Car)$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(dichVu);
//        return matcher.find();
//    }

    // Kiểm tra ngày sinh.
    private static void kiemTraNgaySinh(String ngaySinh) throws NgaySinhException {
        String regex = "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][0]([012])|[1][9]\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ngaySinh);
        if (!matcher.find()) throw new NgaySinhException("Nhập lại ngày sinh đúng định dạng.");
    }

    // Kiểm tra số tầng.
    private static boolean kiemTraSoTang(String soTang) {
        String regex = "^[1-9]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soTang);
        return !matcher.find();
    }

    // Kiểm tra kiểu thuê.
    private static boolean kiemTraKieuThue(String kieuThue) {
        String regex = "^(gio|ngay|tuan|thang|nam|Gio|Ngay|Tuan|Thang|Nam|Giờ|Ngày|Tuần|Tháng|Năm|giờ|ngày|tuần|tháng|năm)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(kieuThue);
        return matcher.find();
    }

    // Kiểm tra giới tính.
    private static void kiemTraGioiTinh(String gioiTinh) throws GenderException {
        String regex = "^(nam|nu|Nam|Nu|bede|Bede|nữ|Nữ)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(gioiTinh);
        if (!matcher.find()) throw new GenderException("Nhập lại giới tính đúng định dạng");
    }

    // Kiểm tra số chứng minh.
    private static void kiemTraCMND(String cMND) throws IDCardException {
        String regex = "^\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cMND);
        if (!matcher.find()) throw new IDCardException("Nhập lại ID đúng định dạng (XXXXXXXXX)");
    }

    // Kiểm tra số điện thoại.
    private static void kiemTraSoDienThoai(String soDienThoai) throws NumberPhoneException {
        String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soDienThoai);
        if (!matcher.find()) throw new NumberPhoneException("Nhập lại số điện thoại đúng định dạng!!!");
    }

    // Kiểm tra email.
    private static void kiemTraEmail(String email) throws EmailException {
        String regex = "^\\w{3,}(\\.?\\w+)*@[a-z]{2,7}(.[a-z]{2,5}){1,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.find()) throw new EmailException("Nhập lại email đúng định dạng");

    }

    // Kiểm tra loại khách hàng.
    private static void kiemTraLoaiKhachHang(String loaiKhachHang) throws CustomerException {
        String regex = "^(member|sliver|gold|platinium|diamond|Member|Sliver|Gold|Platinium|Diamond)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(loaiKhachHang);
        if (!matcher.find()) throw new CustomerException("Nhập đúng định dạng");
    }


    //---------------------------------------------


    // Menu Chính.
    public static void menuChinh() {
        System.out.println("----------------------------------");
        System.out.println("1. Thêm mới dịch vụ.");
        System.out.println("2. Hiện thị danh sách dịch vụ.");
        System.out.println("3. Thêm mới khách hàng.");
        System.out.println("4. Hiển thị thông tin khách hàng.");
        System.out.println("5. Đặt dịch vụ.");
        System.out.println("6. Hiện thị thông tin nhân viên.");
        System.out.println("7. Rạp chiếu phim.");
        System.out.println("8. Tìm kiếm hồ sơ nhân viên");
        System.out.println("9. Thoát.");
        System.out.println("----------------------------------");
        System.out.print("Nhập lựa chọn của bạn: ");
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                themMoiDichVu();
                menuChinh();
                break;
            case "2":
                hienThiDanhSachDichVu();
                menuChinh();
                break;
            case "3":
                themMoiKhachHang();
                menuChinh();
                break;
            case "4":
                hienThiThongTinKhachHang();
                menuChinh();
                break;
            case "5":
                datDichVu();
                menuChinh();
                break;
            case "6":
                hienThiThongTinNhanVien();
                menuChinh();
                break;
            case "7":
                muaVeXemPhim4D();
                menuChinh();
            case "8":
                timKiemHoSoNhanVien();
                menuChinh();
            case "9":
                System.exit(0);
            default:
                System.err.println("Vui lòng nhập đúng lựa chọn.");
                menuChinh();
                break;

        }
    }


    //--------------------------------------------


    // Menu Thêm dịch vụ.
    public static void themMoiDichVu() {
        System.out.println("----------------------------------");
        System.out.println("1. Thêm mới villa.");
        System.out.println("2. Thêm mới house.");
        System.out.println("3. Thêm mới room.");
        System.out.println("4. Trở lại menu chính.");
        System.out.println("5. Thoát.");
        System.out.println("----------------------------------");
        System.out.print("Nhập lựa chọn của bạn: ");
        String luaChon = scanner.nextLine();
        switch (luaChon) {
            case "1":
                themDichVuVilla();
                themMoiDichVu();
                break;
            case "2":
                themDichVuHouse();
                themMoiDichVu();
                break;
            case "3":
                themDichVuRoom();
                themMoiDichVu();
                break;
            case "4":
                menuChinh();
                break;
            case "5":
                System.exit(0);
            default:
                System.err.println("Vui lòng nhập đúng lựa chọn.");
                themMoiDichVu();
                break;
        }
    }

    //Thêm dịch vụ
    public static void themDichVu() {
        System.out.print("Tên dịch vụ: ");
        tenDichVu = scanner.nextLine();
        while (!kiemTraTenDichVu(tenDichVu)) {
            System.err.print("Nhập lại tên dịch vụ đúng định dạng: ");
            tenDichVu = scanner.nextLine();
        }

        System.out.print("Diện tích sử dụng: ");
        dienTichSuDung = scanner.nextLine();
        while (kiemTraDienTich(dienTichSuDung)) {
            System.err.print("Nhập lại diện tích đúng định dạng(> 30): ");
            dienTichSuDung = scanner.nextLine();
        }

        System.out.print("Chi phí thuê: ");
        chiPhiThue = scanner.nextLine();
        while (!kiemTraChiPhi(chiPhiThue)) {
            System.err.print("Nhập lại chi phí đúng định dạng: ");
            chiPhiThue = scanner.nextLine();
        }

        System.out.print("Số lượng người tối đa: ");
        soLuongNguoi = scanner.nextLine();
        while (!kiemTraSoLuongNguoi(soLuongNguoi)) {
            System.err.print("Nhập lại số lượng người đúng định dạng: ");
            soLuongNguoi = scanner.nextLine();
        }

        System.out.print("Kiểu thuê: ");
        kieuThue = scanner.nextLine();
        while (!kiemTraKieuThue(kieuThue)) {
            System.err.print("Nhập lại kiểu thuê đúng định dạng: ");
            kieuThue = scanner.nextLine();
        }
    }

    // Thêm dịch vụ Villa.
    public static void themDichVuVilla() {
        System.out.print("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        boolean flag = false;
        while (!flag) {
            flag = true;
            if (!kiemTraIDVL(maDichVu)) {
                System.err.print("Nhập lại mã dịch vụ đúng định dạng (SVVL-XXXX): ");
                maDichVu = scanner.nextLine();
                flag = false;
            }
            for (Villa villa : villas) {
                if (villa.getMaDichVu().equals(maDichVu)) {
                    System.err.print("Mã dịch vụ đã tồn tại --- Vui lòng nhập lại: ");
                    maDichVu = scanner.nextLine();
                    flag = false;
                }
            }
        }

        themDichVu();
        System.out.print("Tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.print("Mô tả: ");
        String moTa = scanner.nextLine();

        System.out.print("Diện tích hồ bơi: ");
        String dienTichHoBoi = scanner.nextLine();
        while (kiemTraDienTich(dienTichHoBoi)) {
            System.err.print("Nhập lại diện tích đúng định dạng (>30 m^2): ");
            dienTichHoBoi = scanner.nextLine();
        }

        System.out.print("Số tầng: ");
        String soTang = scanner.nextLine();
        while (kiemTraSoTang(soTang)) {
            System.err.print("Nhập lại số tầng đúng định dạng: ");
            soTang = scanner.nextLine();
        }

        Villa villa = new Villa(maDichVu, tenDichVu, Float.parseFloat(dienTichSuDung), Integer.parseInt(chiPhiThue),
                Integer.parseInt(soLuongNguoi), kieuThue, tieuChuanPhong, moTa, Float.parseFloat(dienTichHoBoi),
                Integer.parseInt(soTang));

        villas.add(villa);

        String line;
        line = villa.getMaDichVu() + COMMA + villa.getTenDichVu() + COMMA + villa.getDienTichSuDung()
                + COMMA + villa.getChiPhiThue() + COMMA + villa.getSoLuongNguoi()
                + COMMA + villa.getKieuThue() + COMMA + villa.getTieuChuanPhong() + COMMA + villa.getMoTa()
                + COMMA + villa.getDienTichHoBoi() + COMMA + villa.getSoTang();
        FileUntils.writeFile(FILE_VILLA, line);
    }

    // Thêm dịch vụ House.
    public static void themDichVuHouse() {
        System.out.print("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        boolean flag = false;
        while (!flag) {
            flag = true;
            if (!kiemTraIDHO(maDichVu)) {
                System.err.print("Nhập lại mã dịch vụ đúng định dạng (VLHO-XXXX): ");
                maDichVu = scanner.nextLine();
                flag = false;
            }
            for (House house : houses) {
                if (house.getMaDichVu().equals(maDichVu)) {
                    System.err.print("Mã dịch vụ đã tồn tại --- Vui lòng nhập lại: ");
                    maDichVu = scanner.nextLine();
                    flag = false;
                }
            }
        }

        themDichVu();
        System.out.print("Tiêu chuẩn phòng: ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.print("Mô tả: ");
        String moTa = scanner.nextLine();

        System.out.print("Số tầng");
        String soTang = scanner.nextLine();
        while (kiemTraSoTang(soTang)) {
            System.err.print("Nhập lại số tầng đúng định dạng: ");
            soTang = scanner.nextLine();
        }

        House house = new House(maDichVu, tenDichVu, Float.parseFloat(dienTichSuDung), Integer.parseInt(chiPhiThue),
                Integer.parseInt(soLuongNguoi), kieuThue, tieuChuanPhong, moTa, Integer.parseInt(soTang));

        houses.add(house);

        String line;
        line = house.getMaDichVu() + COMMA + house.getTenDichVu() + COMMA + house.getDienTichSuDung()
                + COMMA + house.getChiPhiThue() + COMMA + house.getSoLuongNguoi()
                + COMMA + house.getKieuThue() + COMMA + house.getTieuChuanPhong() + COMMA + house.getMoTa()
                + COMMA + house.getSoTang();
        FileUntils.writeFile(FILE_HOUSE, line);
    }

    // Thêm dịch vụ Room.
    public static void themDichVuRoom() {
        System.out.print("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        boolean flag = false;
        while (!flag) {
            flag = true;
            if (!kiemTraIDRO(maDichVu)) {
                System.err.print("Nhập lại mã dịch vụ đúng định dạng (SVRO-XXXX): ");
                maDichVu = scanner.nextLine();
                flag = false;
            }
            for (Room room : rooms) {
                if (room.getMaDichVu().equals(maDichVu)) {
                    System.err.print("Mã dịch vụ đã tồn tại --- Vui lòng nhập lại: ");
                    maDichVu = scanner.nextLine();
                    flag = false;
                }
            }
        }

        themDichVu();
        System.out.print("Dịch vụ miễn phí: ");
        String dichVuMienPhi = scanner.nextLine();
        Room room = new Room(maDichVu, tenDichVu, Float.parseFloat(dienTichSuDung), Integer.parseInt(chiPhiThue),
                Integer.parseInt(soLuongNguoi), kieuThue, dichVuMienPhi);

        rooms.add(room);

        String line;
        line = room.getMaDichVu() + COMMA + room.getTenDichVu() + COMMA + room.getDienTichSuDung()
                + COMMA + room.getChiPhiThue() + COMMA + room.getSoLuongNguoi()
                + COMMA + room.getKieuThue() + COMMA + room.getDichVuMienPhi();
        FileUntils.writeFile(FILE_ROOM, line);
    }


    //----------------------------------------------


    // Menu hiển thị danh sách dịch vụ
    public static void hienThiDanhSachDichVu() {
        System.out.println("---------------------------------------");
        System.out.println("1. Hiển thị danh sách Villa.");
        System.out.println("2. Hiện thị danh sách House.");
        System.out.println("3. Hiện thị danh sách Room.");
        System.out.println("4. Hiển thị danh sách Villa không trùng tên.");
        System.out.println("5. Hiển thị danh sách House không trùng tên.");
        System.out.println("6. Hiển thị danh sách Room không trùng tên.");
        System.out.println("7. Trở lại.");
        System.out.println("8. Thoát.");
        System.out.println("---------------------------------------");
        System.out.print("Nhập lựa chọn của bạn: ");
        String luaChon = scanner.nextLine();

        switch (luaChon) {
            case "1":
                hienThiDanhSachVilla();
                hienThiDanhSachDichVu();
                break;
            case "2":
                hienThiDanhSachHouse();
                hienThiDanhSachDichVu();
                break;
            case "3":
                hienThiDanhSachRoom();
                hienThiDanhSachDichVu();
                break;
            case "4":
                hienThiDanhSachVillaKhongTrungTen();
                hienThiDanhSachDichVu();
                break;
            case "5":
                hienThiDanhSachHouseKhongTrungTen();
                hienThiDanhSachDichVu();
                break;
            case "6":
                hienThiDanhSachRoomKhongTrungTen();
                hienThiDanhSachDichVu();
                break;
            case "7":
                menuChinh();
                break;
            case "8":
                System.exit(0);
            default:
                System.err.println("Vui lòng nhập đúng lựa chọn.");
                hienThiDanhSachDichVu();
                break;
        }
    }


    // Hiện thị danh sách dịch vụ Villa.
    public static void hienThiDanhSachVilla() {
        int indexVilla = 1;
        for (Villa villa : villas) {
            System.out.println(indexVilla++ + ". " + villa.showInfo());
        }
    }


    // Hiển thị danh sách dịch vụ House.
    public static void hienThiDanhSachHouse() {
        int indexHouse = 1;
        for (House house : houses) {
            System.out.println(indexHouse++ + ". " + house.showInfo());
        }
    }


    // Hiển thị danh sách dịch vu Room.
    public static void hienThiDanhSachRoom() {
        int indexRoom = 1;
        for (Room room : rooms) {
            System.out.println(indexRoom++ + ". " + room.showInfo());
        }
    }

    // Hiển thị danh sách villa không trùng nhau.
    public static void hienThiDanhSachVillaKhongTrungTen() {
        Set<String> villaSet = new TreeSet<>();
        for (Villa villa : villas) {
            villaSet.add(villa.getTenDichVu());
        }

        for (String name : villaSet) {
            System.out.println(name);
        }

    }

    // Hiển thị danh sách house không trùng nhau.
    public static void hienThiDanhSachHouseKhongTrungTen() {
        Set<String> houseSet = new TreeSet<>();
        for (House house : houses) {
            houseSet.add(house.getTenDichVu());
        }

        for (String name : houseSet) {
            System.out.println(name);
        }

    }

    // Hiển thị danh sách room không trùng nhau.
    public static void hienThiDanhSachRoomKhongTrungTen() {
        Set<String> roomSet = new TreeSet<>();
        for (Room room : rooms) {
            roomSet.add(room.getTenDichVu());
        }

        for (String name : roomSet) {
            System.out.println(name);
        }
    }

    //---------------------------------------------------


    // Thêm khách hàng.
    public static void themMoiKhachHang() {
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

        KhachHang khachHang = new KhachHang(hoVaTen, ngaySinh, gioiTinh, cMND, soDienThoai,
                email, loaiKhachHang, diaChi, null);

        String line;
        line = khachHang.getHoVaTen() + COMMA + khachHang.getNgaySinh() + COMMA + khachHang.getGioiTinh() +
                COMMA + khachHang.getcMND() + COMMA + khachHang.getSoDT() + COMMA + khachHang.getEmail() + COMMA +
                khachHang.getLoaiKhachHang() + COMMA + khachHang.getDiaChi() + COMMA + khachHang.getDichVu();
        FileUntils.writeFile(FILE_CUSTOMER, line);
    }


    //---------------------------------------------------

    // Hiển thị thông tin khách hàng.
    public static void hienThiThongTinKhachHang() {
        int indexCustomer = 1;
        Collections.sort(khachHangs);
        for (KhachHang khachHang : khachHangs) {
            System.out.println(indexCustomer++ + " " + khachHang.showInfo());
        }
    }


    //---------------------------------------------------

    // Đặt dịch vụ.
    public static void datDichVu() {
        try {
            hienThiThongTinKhachHang();
            System.out.print("Chọn khách hàng: ");
            String chonKhachHang = scanner.nextLine();
            System.out.println("-----------------------------");
            System.out.println("1. Đặt dịch vụ Villa");
            System.out.println("2. Đặt dịch vụ House");
            System.out.println("3. Đặt dịch vụ Room");
            System.out.println("4. Trở lại");
            System.out.println("5. Thoát");

            System.out.println("Nhập lựa chọn của bạn");
            String luaChon = scanner.nextLine();
            switch (luaChon) {
                case "1":
                    hienThiDanhSachVilla();
                    System.out.print("Chọn villa mà bạn muốn đặt: ");
                    String chooseVilla = scanner.nextLine();
                    khachHangs.get(Integer.parseInt(chonKhachHang) - 1).setDichVu(villas.get(Integer.parseInt(chooseVilla) - 1));

                    themThongTimVaoFile(Integer.parseInt(chonKhachHang));
                    break;
                case "2":
                    hienThiDanhSachHouse();
                    System.out.print("Chọn House mà bạn muốn đặt: ");
                    String chooseHouse = scanner.nextLine();
                    khachHangs.get(Integer.parseInt(chonKhachHang) - 1).setDichVu(houses.get(Integer.parseInt(chooseHouse) - 1));

                    themThongTimVaoFile(Integer.parseInt(chonKhachHang));
                    break;
                case "3":
                    hienThiDanhSachRoom();
                    System.out.print("Chọn Villa mà bạn muốn đặt: ");
                    String chooseRoom = scanner.nextLine();
                    khachHangs.get(Integer.parseInt(chonKhachHang) - 1).setDichVu(rooms.get(Integer.parseInt(chooseRoom) - 1));

                    themThongTimVaoFile(Integer.parseInt(chonKhachHang));
                    break;
                case "4":
                    menuChinh();
                    break;
                case "5":
                    System.exit(0);
                default:
                    datDichVu();
                    break;
            }
        }catch (IndexOutOfBoundsException e) {
            System.err.println("Vui lòng nhập đúng lựa chọn");
        }
    }

    private static void themThongTimVaoFile(int chonKhachHang) {
        String line;
        line = khachHangs.get(chonKhachHang - 1).getHoVaTen() + COMMA + khachHangs.get(chonKhachHang - 1).getNgaySinh() + COMMA + khachHangs.get(chonKhachHang - 1).getGioiTinh() +
                COMMA + khachHangs.get(chonKhachHang - 1).getcMND() + COMMA + khachHangs.get(chonKhachHang - 1).getSoDT() + COMMA + khachHangs.get(chonKhachHang - 1).getEmail() + COMMA +
                khachHangs.get(chonKhachHang - 1).getLoaiKhachHang() + COMMA + khachHangs.get(chonKhachHang - 1).getDiaChi() + COMMA + khachHangs.get(chonKhachHang - 1).getDichVu().showInfo();
        FileUntils.writeFile(FILE_BOOKING, line);
    }

    //---------------------------------------------------

    public static void hienThiThongTinNhanVien() {
        for (String key : nhanVienMap.keySet()) {
            System.out.println(key + " " + nhanVienMap.get(key));
        }
        menuChinh();
    }


    //----------------------------------------------------

    public static void muaVeXemPhim4D() {

            System.out.println("--------------------------------");
            System.out.println("1. Mua vé.");
            System.out.println("2. Danh sách mua vé.");
            System.out.println("3. Trở lại.");
            System.out.println("4. Thoát.");
            System.out.println("--------------------------------");
            System.out.print("Nhập lựa chọn của bạn: ");
            String luaChon = scanner.nextLine();
            switch (luaChon) {
                case "1":
                    hienThiThongTinKhachHang();
                    try {
                    System.out.print("Nhập khách hàng muốn mua vé: ");
                    String chonKhachHang = scanner.nextLine();
                    khachHangQueue.add(khachHangs.get(Integer.parseInt(chonKhachHang) - 1));
                    } catch (IndexOutOfBoundsException e) {
                        System.err.println("Vui lòng nhập đúng lựa chọn");
                    }
                    muaVeXemPhim4D();
                    break;
                case "2":
                    int size = khachHangQueue.size();
                    if (size == 0) {
                        System.err.println("Chưa có ai mua vé.");
                    }
                    for (int i = 0; i < size; i++) {
                        System.out.println(khachHangQueue.poll().getHoVaTen());
                    }
                    muaVeXemPhim4D();
                    break;
                case "3":
                    menuChinh();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    muaVeXemPhim4D();
            }

    }

    //----------------------------------------------------

    public static void timKiemHoSoNhanVien() {
        boolean flag;
        int size = nhanVienStack.size();
        System.out.println("-----------------------------------");
        System.out.println("1. Tìm kiếm theo tên nhân viên.");
        System.out.println("2. Tìm kiếm theo id nhân viên.");
        System.out.println("3. Trở lại.");
        System.out.println("4. Thoát.");
        System.out.println("-----------------------------------");
        System.out.print("Nhập lựa chọn của bạn: ");
        String luaChon = scanner.nextLine();
        switch (luaChon) {
            case "1":
                flag = false;
                System.out.println("Nhập tên nhân viên muốn tìm");
                String tenNhanVien = scanner.nextLine();
                for (int i = 0; i < size; i++) {
                    if (nhanVienStack.peek().getHoVaTen().equals(tenNhanVien)) {
                        System.out.println(nhanVienStack.pop());
                        flag = true;
                        continue;
                    }
                    nhanVienStack.pop();
                }
                if (!flag) {
                    System.err.println("Không có nhân viên bạn muốn tìm");
                }
                timKiemHoSoNhanVien();
                break;
            case "2":
                flag = false;
                System.out.println("Nhập tên nhân viên muốn tìm");
                String iDEmployee = scanner.nextLine();
                for (int i = 0; i < size; i++) {
                    if (nhanVienStack.peek().getMaNhanVien().equals(iDEmployee)) {
                        System.out.println(nhanVienStack.pop());
                        flag = true;
                        continue;
                    }
                    nhanVienStack.pop();
                }
                if (!flag) {
                    System.err.println("Không có nhân viên bạn muốn tìm");
                }
                timKiemHoSoNhanVien();
            case "3":
                menuChinh();
                break;
            case "4":
                System.exit(0);
            default:
                System.err.println("Vui lòng nhập đúng lựa chọn.");
                timKiemHoSoNhanVien();
        }
    }

    //----------------------------------------------------

    public static void main(String[] args) {
        layThongTinVillasTuFile();
        layThongTinHousesTuFile();
        layThongTinRoomsTuFile();
        layThongTinKhachHangTuFile();
        layThongTinNhanVienTuFile();
//        NhanVien nhanVien = new NhanVien("Nguyễn Thị Thu" , "25/09/1996", "Đà Nẵng", 994000059, 358665325, "sorake.1996@gmail.com", "Đại học", "Quản lí", 100000);
//        String line;
//        line = nhanVien.getHoVaTen() + COMMA + nhanVien.getNgaySinh() + COMMA +
//                nhanVien.getDiaChi() + COMMA + nhanVien.getcMND() + COMMA + nhanVien.getSoDienThoai() + COMMA + nhanVien.getEmail() + COMMA + nhanVien.getTrinhDo() + COMMA + nhanVien.getViTri() + COMMA + nhanVien.getLuong();
//        FileUntils.writeFile(FILE_EMPLOYEE,line);
        menuChinh();
    }

    private static void layThongTinVillasTuFile() {
        List<String> listLine = FileUntils.readFile(FILE_VILLA);
        for (String line : listLine) {
            String[] split = line.split(",");
            if (split.length != 1) {
                Villa villa = new Villa(split[0], split[1], Float.parseFloat(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]),
                        split[5], split[6], split[7], Float.parseFloat(split[8]), Integer.parseInt(split[9]));
                villas.add(villa);
            }
        }
    }

    private static void layThongTinHousesTuFile() {
        List<String> listLine = FileUntils.readFile(FILE_HOUSE);
        for (String line : listLine) {
            String[] split = line.split(",");
            if (split.length != 1) {
                House house = new House(split[0], split[1], Float.parseFloat(split[2]), Integer.parseInt(split[3]),
                        Integer.parseInt(split[4]), split[5], split[6], split[7], Integer.parseInt(split[8]));
                houses.add(house);
            }
        }
    }

    private static void layThongTinRoomsTuFile() {
        List<String> listLine = FileUntils.readFile(FILE_ROOM);
        for (String line : listLine) {
            String[] split = line.split(",");
            if (split.length != 1) {
                Room room = new Room(split[0], split[1], Float.parseFloat(split[2]),
                        Integer.parseInt(split[3]), Integer.parseInt(split[4]), split[5], split[6]);
                rooms.add(room);
            }
        }
    }

    private static void layThongTinKhachHangTuFile() {
        List<String> listline = FileUntils.readFile(FILE_CUSTOMER);
        for (String list : listline) {
            String[] split = list.split(",");
            if (split.length != 1) {
                KhachHang khachHang = new KhachHang(split[0], split[1], split[2], split[3], split[4], split[5], split[6], split[7], null);
                khachHangs.add(khachHang);
            }
        }
    }

    private static void layThongTinNhanVienTuFile() {
        List<String> listLine = FileUntils.readFile(FILE_EMPLOYEE);
        for (String line : listLine) {
            String[] split = line.split(",");
            if (split.length != 1) {
                NhanVien nhanVien = new NhanVien(split[0], split[1], split[2], split[3], Long.parseLong(split[4]),
                        Long.parseLong(split[5]), split[6], split[7], split[8], Long.parseLong(split[9]));
                nhanVienMap.put(split[0], nhanVien);
                nhanVienStack.push(nhanVien);
            }
        }
    }
}
