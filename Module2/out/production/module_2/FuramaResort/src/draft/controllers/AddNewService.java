//package draft.controllers;
//
//import draft.commons.FileUntils;
//import draft.models.House;
//import draft.models.Room;
//import draft.models.Villa;
//import draft.rengular_exception.RengularException;
//
//import java.util.Scanner;
//
//public class AddNewService {
//    private static Scanner scanner = new Scanner(System.in);
//    private static String tenDichVu;
//    private static String dienTichSuDung;
//    private static String chiPhiThue;
//    private static String soLuongNguoi;
//    private static String kieuThue;
//    // Menu Thêm dịch vụ.
//    public static void themMoiDichVu() {
//        System.out.println("----------------------------------");
//        System.out.println("1. Thêm mới villa.");
//        System.out.println("2. Thêm mới house.");
//        System.out.println("3. Thêm mới room.");
//        System.out.println("4. Trở lại menu chính.");
//        System.out.println("5. Thoát.");
//        System.out.println("----------------------------------");
//        System.out.print("Nhập lựa chọn của bạn: ");
//        String luaChon = scanner.nextLine();
//        switch (luaChon) {
//            case "1":
//                themDichVuVilla();
//                themMoiDichVu();
//                break;
//            case "2":
//                themDichVuHouse();
//                themMoiDichVu();
//                break;
//            case "3":
//                themDichVuRoom();
//                themMoiDichVu();
//                break;
//            case "4":
//                MainMenu.menuChinh();
//                break;
//            case "5":
//                System.exit(0);
//            default:
//                System.err.println("Vui lòng nhập đúng lựa chọn.");
//                themMoiDichVu();
//                break;
//        }
//    }
//
//    //Thêm dịch vụ
//    public static void themDichVu() {
//        System.out.print("Tên dịch vụ: ");
//        tenDichVu = scanner.nextLine();
//        while (!RengularException.kiemTraTenDichVu(tenDichVu)) {
//            System.err.print("Nhập lại tên dịch vụ đúng định dạng: ");
//            tenDichVu = scanner.nextLine();
//        }
//
//        System.out.print("Diện tích sử dụng: ");
//        dienTichSuDung = scanner.nextLine();
//        while (RengularException.kiemTraDienTich(dienTichSuDung)) {
//            System.err.print("Nhập lại diện tích đúng định dạng(> 30): ");
//            dienTichSuDung = scanner.nextLine();
//        }
//
//        System.out.print("Chi phí thuê: ");
//        chiPhiThue = scanner.nextLine();
//        while (!RengularException.kiemTraChiPhi(chiPhiThue)) {
//            System.err.print("Nhập lại chi phí đúng định dạng: ");
//            chiPhiThue = scanner.nextLine();
//        }
//
//        System.out.print("Số lượng người tối đa: ");
//        soLuongNguoi = scanner.nextLine();
//        while (!RengularException.kiemTraSoLuongNguoi(soLuongNguoi)) {
//            System.err.print("Nhập lại số lượng người đúng định dạng: ");
//            soLuongNguoi = scanner.nextLine();
//        }
//
//        System.out.print("Kiểu thuê: ");
//        kieuThue = scanner.nextLine();
//        while (!RengularException.kiemTraKieuThue(kieuThue)) {
//            System.err.print("Nhập lại kiểu thuê đúng định dạng: ");
//            kieuThue = scanner.nextLine();
//        }
//    }
//
//    // Thêm dịch vụ Villa.
//    public static void themDichVuVilla() {
//        System.out.print("Nhập mã dịch vụ: ");
//        String maDichVu = scanner.nextLine();
//        boolean flag = false;
//        while (!flag) {
//            flag = true;
//            if (!RengularException.kiemTraIDVL(maDichVu)) {
//                System.err.print("Nhập lại mã dịch vụ đúng định dạng (SVVL-XXXX): ");
//                maDichVu = scanner.nextLine();
//                flag = false;
//            }
//            for (Villa villa : MainMenu.villas) {
//                if (villa.getIdService().equals(maDichVu)) {
//                    System.err.print("Mã dịch vụ đã tồn tại --- Vui lòng nhập lại: ");
//                    maDichVu = scanner.nextLine();
//                    flag = false;
//                }
//            }
//        }
//
//        themDichVu();
//        System.out.print("Tiêu chuẩn phòng: ");
//        String tieuChuanPhong = scanner.nextLine();
//        System.out.print("Mô tả: ");
//        String moTa = scanner.nextLine();
//
//        System.out.print("Diện tích hồ bơi: ");
//        String dienTichHoBoi = scanner.nextLine();
//        while (RengularException.kiemTraDienTich(dienTichHoBoi)) {
//            System.err.print("Nhập lại diện tích đúng định dạng (>30 m^2): ");
//            dienTichHoBoi = scanner.nextLine();
//        }
//
//        System.out.print("Số tầng: ");
//        String soTang = scanner.nextLine();
//        while (RengularException.kiemTraSoTang(soTang)) {
//            System.err.print("Nhập lại số tầng đúng định dạng: ");
//            soTang = scanner.nextLine();
//        }
//
//        Villa villa = new Villa(maDichVu, tenDichVu, Float.parseFloat(dienTichSuDung), Integer.parseInt(chiPhiThue),
//                Integer.parseInt(soLuongNguoi), kieuThue, tieuChuanPhong, moTa, Float.parseFloat(dienTichHoBoi),
//                Integer.parseInt(soTang));
//
//        MainMenu.villas.add(villa);
//
//        String line;
//        line = villa.getIdService() + MainMenu.COMMA + villa.getNameService() + MainMenu.COMMA + villa.getUsedArea()
//                + MainMenu.COMMA + villa.getCost() + MainMenu.COMMA + villa.getAmountOfPeople()
//                + MainMenu.COMMA + villa.getRentType() + MainMenu.COMMA + villa.getStandardRoom() + MainMenu.COMMA + villa.getDescription()
//                + MainMenu.COMMA + villa.getPoolArea() + MainMenu.COMMA + villa.getNumberOfFloor();
//        FileUntils.writeFile(MainMenu.FILE_VILLA, line);
//    }
//
//    // Thêm dịch vụ House.
//    public static void themDichVuHouse() {
//        System.out.print("Nhập mã dịch vụ: ");
//        String maDichVu = scanner.nextLine();
//        boolean flag = false;
//        while (!flag) {
//            flag = true;
//            if (!RengularException.kiemTraIDHO(maDichVu)) {
//                System.err.print("Nhập lại mã dịch vụ đúng định dạng (VLHO-XXXX): ");
//                maDichVu = scanner.nextLine();
//                flag = false;
//            }
//            for (House house : MainMenu.houses) {
//                if (house.getIdService().equals(maDichVu)) {
//                    System.err.print("Mã dịch vụ đã tồn tại --- Vui lòng nhập lại: ");
//                    maDichVu = scanner.nextLine();
//                    flag = false;
//                }
//            }
//        }
//
//        themDichVu();
//        System.out.print("Tiêu chuẩn phòng: ");
//        String tieuChuanPhong = scanner.nextLine();
//        System.out.print("Mô tả: ");
//        String moTa = scanner.nextLine();
//
//        System.out.print("Số tầng");
//        String soTang = scanner.nextLine();
//        while (RengularException.kiemTraSoTang(soTang)) {
//            System.err.print("Nhập lại số tầng đúng định dạng: ");
//            soTang = scanner.nextLine();
//        }
//
//        House house = new House(maDichVu, tenDichVu, Float.parseFloat(dienTichSuDung), Integer.parseInt(chiPhiThue),
//                Integer.parseInt(soLuongNguoi), kieuThue, tieuChuanPhong, moTa, Integer.parseInt(soTang));
//
//        MainMenu.houses.add(house);
//
//        String line;
//        line = house.getIdService() + MainMenu.COMMA + house.getNameService() + MainMenu.COMMA + house.getUsedArea()
//                + MainMenu.COMMA + house.getCost() + MainMenu.COMMA + house.getAmountOfPeople()
//                + MainMenu.COMMA + house.getRentType() + MainMenu.COMMA + house.getStandardRoom() + MainMenu.COMMA + house.getDecription()
//                + MainMenu.COMMA + house.getNumberOfFloor();
//        FileUntils.writeFile(MainMenu.FILE_HOUSE, line);
//    }
//
//    // Thêm dịch vụ Room.
//    public static void themDichVuRoom() {
//        System.out.print("Nhập mã dịch vụ: ");
//        String maDichVu = scanner.nextLine();
//        boolean flag = false;
//        while (!flag) {
//            flag = true;
//            if (!RengularException.kiemTraIDRO(maDichVu)) {
//                System.err.print("Nhập lại mã dịch vụ đúng định dạng (SVRO-XXXX): ");
//                maDichVu = scanner.nextLine();
//                flag = false;
//            }
//            for (Room room : MainMenu.rooms) {
//                if (room.getIdService().equals(maDichVu)) {
//                    System.err.print("Mã dịch vụ đã tồn tại --- Vui lòng nhập lại: ");
//                    maDichVu = scanner.nextLine();
//                    flag = false;
//                }
//            }
//        }
//
//        themDichVu();
//        System.out.print("Dịch vụ miễn phí: ");
//        String dichVuMienPhi = scanner.nextLine();
//        Room room = new Room(maDichVu, tenDichVu, Float.parseFloat(dienTichSuDung), Integer.parseInt(chiPhiThue),
//                Integer.parseInt(soLuongNguoi), kieuThue, dichVuMienPhi);
//
//        MainMenu.rooms.add(room);
//
//        String line;
//        line = room.getIdService() + MainMenu.COMMA + room.getNameService() + MainMenu.COMMA + room.getUsedArea()
//                + MainMenu.COMMA + room.getCost() + MainMenu.COMMA + room.getAmountOfPeople()
//                + MainMenu.COMMA + room.getRentType() + MainMenu.COMMA + room.getFreeService();
//        FileUntils.writeFile(MainMenu.FILE_ROOM, line);
//    }
//}
