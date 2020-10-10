//package draft.controllers;
//
//import java.util.Scanner;
//
//public class Cinema {
//    public static void muaVeXemPhim4D() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("--------------------------------");
//        System.out.println("1. Mua vé.");
//        System.out.println("2. Danh sách mua vé.");
//        System.out.println("3. Trở lại.");
//        System.out.println("4. Thoát.");
//        System.out.println("--------------------------------");
//        System.out.print("Nhập lựa chọn của bạn: ");
//        String luaChon = scanner.nextLine();
//        switch (luaChon) {
//            case "1":
//                ShowInforCustomer.hienThiThongTinKhachHang();
//                try {
//                    System.out.print("Nhập khách hàng muốn mua vé: ");
//                    String chonKhachHang = scanner.nextLine();
//                    MainMenu.customerQueue.add(MainMenu.customers.get(Integer.parseInt(chonKhachHang) - 1));
//                } catch (IndexOutOfBoundsException e) {
//                    System.err.println("Vui lòng nhập đúng lựa chọn");
//                }
//                muaVeXemPhim4D();
//                break;
//            case "2":
//                int size = MainMenu.customerQueue.size();
//                if (size == 0) {
//                    System.err.println("Chưa có ai mua vé.");
//                }
//                for (int i = 0; i < size; i++) {
//                    System.out.println(MainMenu.customerQueue.poll().getFullName());
//                }
//                muaVeXemPhim4D();
//                break;
//            case "3":
//                MainMenu.menuChinh();
//                break;
//            case "4":
//                System.exit(0);
//                break;
//            default:
//                muaVeXemPhim4D();
//        }
//
//    }
//}
