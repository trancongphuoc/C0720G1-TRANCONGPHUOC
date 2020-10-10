//package draft.controllers;
//
//import draft.commons.FileUntils;
//import draft.libs.*;
//import draft.models.Customer;
//import draft.rengular_exception.RengularException;
//
//import java.util.Scanner;
//
//public class AddNewCustomer {
//    // Thêm khách hàng.
//    public static void themMoiKhachHang() {
//        Scanner scanner = new Scanner(System.in);
//        String hoVaTen = "";
//        boolean flag;
//        do {
//            flag = true;
//            try {
//                System.out.print("Nhập họ và tên: ");
//                hoVaTen = scanner.nextLine();
//                RengularException.kiemTraTen(hoVaTen);
//            } catch (NameException e) {
//                System.err.println(e.getMessage());
//                System.out.println();
//                flag = false;
//            }
//        } while (!flag);
//
//
//        String ngaySinh = "";
//        do {
//            try {
//                flag = true;
//                System.out.print("Ngày sinh: ");
//                ngaySinh = scanner.nextLine();
//                RengularException.kiemTraNgaySinh(ngaySinh);
//            } catch (NgaySinhException e) {
//                System.err.println(e.getMessage());
//                System.out.println();
//                flag = false;
//            }
//
//        } while (!flag);
//
//
//        String gioiTinh = "";
//        do {
//            flag = true;
//            try {
//                System.out.print("Giới tính: ");
//                gioiTinh = scanner.nextLine();
//                RengularException.kiemTraGioiTinh(gioiTinh);
//            } catch (GenderException e) {
//                System.err.println(e.getMessage());
//                System.out.println();
//                flag = false;
//            }
//        } while (!flag);
//
//
//        String cMND = "";
//        do {
//            flag = true;
//            try {
//                System.out.print("Số chứng minh: ");
//                cMND = scanner.nextLine();
//                RengularException.kiemTraCMND(cMND);
//            } catch (IDCardException e) {
//                System.err.println(e.getMessage());
//                System.out.println();
//                flag = false;
//            }
//        } while (!flag);
//
//
//        String soDienThoai = "";
//        do {
//            flag = true;
//            try {
//                System.out.print("Số điện thoại: ");
//                soDienThoai = scanner.nextLine();
//                RengularException.kiemTraSoDienThoai(soDienThoai);
//            } catch (NumberPhoneException e) {
//                System.err.println(e.getMessage());
//                System.out.println();
//                flag = false;
//            }
//        } while (!flag);
//
//
//        String email = "";
//        do {
//            try {
//                flag = true;
//                System.out.print("Email: ");
//                email = scanner.nextLine();
//                RengularException.kiemTraEmail(email);
//            } catch (EmailException e) {
//                System.err.println(e.getMessage());
//                System.out.println();
//                flag = false;
//            }
//        } while (!flag);
//
//
//        String loaiKhachHang = "";
//        do {
//            flag = true;
//            try {
//                System.out.print("Loại khách hàng: ");
//                loaiKhachHang = scanner.nextLine();
//                RengularException.kiemTraLoaiKhachHang(loaiKhachHang);
//            } catch (CustomerException e) {
//                System.err.println(e.getMessage());
//                System.out.println();
//                flag = false;
//            }
//        } while (!flag);
//
//
//        System.out.print("Địa chỉ: ");
//        String diaChi = scanner.nextLine();
//
//        Customer customer = new Customer(hoVaTen, ngaySinh, gioiTinh, cMND, soDienThoai,
//                email, loaiKhachHang, diaChi, null);
//
//        String line;
//        line = customer.getFullName() + MainMenu.COMMA + customer.getDateOfBirth() + MainMenu.COMMA + customer.getGender() +
//                MainMenu.COMMA + customer.getIdCard() + MainMenu.COMMA + customer.getNumberPhone() + MainMenu.COMMA + customer.getEmail() + MainMenu.COMMA +
//                customer.getCustomerType() + MainMenu.COMMA + customer.getAddress() + MainMenu.COMMA + customer.getService();
//        FileUntils.writeFile(MainMenu.FILE_CUSTOMER, line);
//    }
//}
