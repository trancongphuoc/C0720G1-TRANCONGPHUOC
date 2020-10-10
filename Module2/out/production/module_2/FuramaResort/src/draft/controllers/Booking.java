//package draft.controllers;
//
//import draft.commons.FileUntils;
//
//import java.util.Scanner;
//
//public class Booking {
//    public static void datDichVu() {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            ShowInforCustomer.hienThiThongTinKhachHang();
//            System.out.print("Chọn khách hàng: ");
//            String chonKhachHang = scanner.nextLine();
//            System.out.println("-----------------------------");
//            System.out.println("1. Đặt dịch vụ Villa");
//            System.out.println("2. Đặt dịch vụ House");
//            System.out.println("3. Đặt dịch vụ Room");
//            System.out.println("4. Trở lại");
//            System.out.println("5. Thoát");
//
//            System.out.println("Nhập lựa chọn của bạn");
//            String luaChon = scanner.nextLine();
//            switch (luaChon) {
//                case "1":
//                    ShowListService.hienThiDanhSachVilla();
//                    System.out.print("Chọn villa mà bạn muốn đặt: ");
//                    String chooseVilla = scanner.nextLine();
//                    MainMenu.customers.get(Integer.parseInt(chonKhachHang) - 1).setService(MainMenu.villas.get(Integer.parseInt(chooseVilla) - 1));
//
//                    themThongTimVaoFile(Integer.parseInt(chonKhachHang));
//                    break;
//                case "2":
//                    ShowListService.hienThiDanhSachHouse();
//                    System.out.print("Chọn House mà bạn muốn đặt: ");
//                    String chooseHouse = scanner.nextLine();
//                    MainMenu.customers.get(Integer.parseInt(chonKhachHang) - 1).setService(MainMenu.houses.get(Integer.parseInt(chooseHouse) - 1));
//
//                    themThongTimVaoFile(Integer.parseInt(chonKhachHang));
//                    break;
//                case "3":
//                    ShowListService.hienThiDanhSachRoom();
//                    System.out.print("Chọn Villa mà bạn muốn đặt: ");
//                    String chooseRoom = scanner.nextLine();
//                    MainMenu.customers.get(Integer.parseInt(chonKhachHang) - 1).setService(MainMenu.rooms.get(Integer.parseInt(chooseRoom) - 1));
//
//                    themThongTimVaoFile(Integer.parseInt(chonKhachHang));
//                    break;
//                case "4":
//                    MainMenu.menuChinh();
//                    break;
//                case "5":
//                    System.exit(0);
//                default:
//                    datDichVu();
//                    break;
//            }
//        }catch (IndexOutOfBoundsException e) {
//            System.err.println("Vui lòng nhập đúng lựa chọn");
//        }
//    }
//
//    private static void themThongTimVaoFile(int chonKhachHang) {
//        String line;
//        line = MainMenu.customers.get(chonKhachHang - 1).getFullName() + MainMenu.COMMA + MainMenu.customers.get(chonKhachHang - 1).getDateOfBirth() + MainMenu.COMMA + MainMenu.customers.get(chonKhachHang - 1).getGender() +
//                MainMenu.COMMA + MainMenu.customers.get(chonKhachHang - 1).getIdCard() + MainMenu.COMMA + MainMenu.customers.get(chonKhachHang - 1).getNumberPhone() + MainMenu.COMMA + MainMenu.customers.get(chonKhachHang - 1).getEmail() + MainMenu.COMMA +
//                MainMenu.customers.get(chonKhachHang - 1).getCustomerType() + MainMenu.COMMA + MainMenu.customers.get(chonKhachHang - 1).getAddress() + MainMenu.COMMA + MainMenu.customers.get(chonKhachHang - 1).getService().showInfo();
//        FileUntils.writeFile(MainMenu.FILE_BOOKING, line);
//    }
//
//}
