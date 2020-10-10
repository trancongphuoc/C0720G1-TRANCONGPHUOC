//package draft.controllers;
//
//import draft.models.House;
//import draft.models.Room;
//import draft.models.Villa;
//
//import java.util.Scanner;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class ShowListService {
//
//    // Menu hiển thị danh sách dịch vụ
//    public static void hienThiDanhSachDichVu() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("---------------------------------------");
//        System.out.println("1. Hiển thị danh sách Villa.");
//        System.out.println("2. Hiện thị danh sách House.");
//        System.out.println("3. Hiện thị danh sách Room.");
//        System.out.println("4. Hiển thị danh sách Villa không trùng tên.");
//        System.out.println("5. Hiển thị danh sách House không trùng tên.");
//        System.out.println("6. Hiển thị danh sách Room không trùng tên.");
//        System.out.println("7. Trở lại.");
//        System.out.println("8. Thoát.");
//        System.out.println("---------------------------------------");
//        System.out.print("Nhập lựa chọn của bạn: ");
//        String luaChon = scanner.nextLine();
//
//        switch (luaChon) {
//            case "1":
//                hienThiDanhSachVilla();
//                hienThiDanhSachDichVu();
//                break;
//            case "2":
//                hienThiDanhSachHouse();
//                hienThiDanhSachDichVu();
//                break;
//            case "3":
//                hienThiDanhSachRoom();
//                hienThiDanhSachDichVu();
//                break;
//            case "4":
//                hienThiDanhSachVillaKhongTrungTen();
//                hienThiDanhSachDichVu();
//                break;
//            case "5":
//                hienThiDanhSachHouseKhongTrungTen();
//                hienThiDanhSachDichVu();
//                break;
//            case "6":
//                hienThiDanhSachRoomKhongTrungTen();
//                hienThiDanhSachDichVu();
//                break;
//            case "7":
//                MainMenu.menuChinh();
//                break;
//            case "8":
//                System.exit(0);
//            default:
//                System.err.println("Vui lòng nhập đúng lựa chọn.");
//                hienThiDanhSachDichVu();
//                break;
//        }
//    }
//
//
//    // Hiện thị danh sách dịch vụ Villa.
//    public static void hienThiDanhSachVilla() {
//        int indexVilla = 1;
//        for (Villa villa : MainMenu.villas) {
//            System.out.println(indexVilla++ + ". " + villa.showInfo());
//        }
//    }
//
//
//    // Hiển thị danh sách dịch vụ House.
//    public static void hienThiDanhSachHouse() {
//        int indexHouse = 1;
//        for (House house : MainMenu.houses) {
//            System.out.println(indexHouse++ + ". " + house.showInfo());
//        }
//    }
//
//
//    // Hiển thị danh sách dịch vu Room.
//    public static void hienThiDanhSachRoom() {
//        int indexRoom = 1;
//        for (Room room : MainMenu.rooms) {
//            System.out.println(indexRoom++ + ". " + room.showInfo());
//        }
//    }
//
//    // Hiển thị danh sách villa không trùng nhau.
//    public static void hienThiDanhSachVillaKhongTrungTen() {
//        Set<String> villaSet = new TreeSet<>();
//        for (Villa villa : MainMenu.villas) {
//            villaSet.add(villa.getNameService());
//        }
//
//        for (String name : villaSet) {
//            System.out.println(name);
//        }
//
//    }
//
//    // Hiển thị danh sách house không trùng nhau.
//    public static void hienThiDanhSachHouseKhongTrungTen() {
//        Set<String> houseSet = new TreeSet<>();
//        for (House house : MainMenu.houses) {
//            houseSet.add(house.getNameService());
//        }
//
//        for (String name : houseSet) {
//            System.out.println(name);
//        }
//
//    }
//
//    // Hiển thị danh sách room không trùng nhau.
//    public static void hienThiDanhSachRoomKhongTrungTen() {
//        Set<String> roomSet = new TreeSet<>();
//        for (Room room : MainMenu.rooms) {
//            roomSet.add(room.getNameService());
//        }
//
//        for (String name : roomSet) {
//            System.out.println(name);
//        }
//    }
//}
