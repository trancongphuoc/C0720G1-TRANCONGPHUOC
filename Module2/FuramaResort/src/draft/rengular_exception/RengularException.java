package draft.rengular_exception;

import draft.libs.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RengularException {
    // Kiểm tra mã dịch vụ Villa.
    public static boolean kiemTraIDVL(String id) {
        String regex = "SVVL-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.find();
    }

    // Kiểm tra mã dịch vụ HOUSE.
    public static boolean kiemTraIDRO(String id) {
        String regex = "SVRO-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.find();
    }

    // Kiểm tra mã dịch vụ ROOM.
    public static boolean kiemTraIDHO(String id) {
        String regex = "SVHO-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.find();
    }

    // Kiểm tra tên.
    public static void kiemTraTen(String ten) throws NameException {
        String regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ten);
        if (!matcher.find()) throw new NameException("Nhập lại tên đúng định dạng.");
    }

    // Kiểm tra tên dịch vụ
    public static boolean kiemTraTenDichVu(String ten) {
        String regex = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ten);
        return matcher.find();
    }

    // Kiểm tra diện tích hồ bơi.
    public static boolean kiemTraDienTich(String dienTich) {
        String regex = "^([3][0]\\.\\d+)|([3][1-9]\\.?\\d*)|([4-9]\\d\\.?\\d*)|(\\d{3,}\\.?\\d*)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dienTich);
        return !matcher.find();
    }

    // Kiểm tra chi phí thuê.
    public static boolean kiemTraChiPhi(String chiPhi) {
        String regex = "^[1-9]\\d*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(chiPhi);
        return matcher.find();
    }

    // Kiểm tra số lượng người thuê.
    public static boolean kiemTraSoLuongNguoi(String soLuongNguoi) {
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
    public static void kiemTraNgaySinh(String ngaySinh) throws NgaySinhException {
        String regex = "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][0]([012])|[1][9]\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ngaySinh);
        if (!matcher.find()) throw new NgaySinhException("Nhập lại ngày sinh đúng định dạng.");
    }

    // Kiểm tra số tầng.
    public static boolean kiemTraSoTang(String soTang) {
        String regex = "^[1-9]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soTang);
        return !matcher.find();
    }

    // Kiểm tra kiểu thuê.
    public static boolean kiemTraKieuThue(String kieuThue) {
        String regex = "^(gio|ngay|tuan|thang|nam|Gio|Ngay|Tuan|Thang|Nam|Giờ|Ngày|Tuần|Tháng|Năm|giờ|ngày|tuần|tháng|năm)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(kieuThue);
        return matcher.find();
    }

    // Kiểm tra giới tính.
    public static void kiemTraGioiTinh(String gioiTinh) throws GenderException {
        String regex = "^(nam|nu|Nam|Nu|bede|Bede|nữ|Nữ)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(gioiTinh);
        if (!matcher.find()) throw new GenderException("Nhập lại giới tính đúng định dạng");
    }

    // Kiểm tra số chứng minh.
    public static void kiemTraCMND(String cMND) throws IDCardException {
        String regex = "^\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cMND);
        if (!matcher.find()) throw new IDCardException("Nhập lại ID đúng định dạng (XXXXXXXXX)");
    }

    // Kiểm tra số điện thoại.
    public static void kiemTraSoDienThoai(String soDienThoai) throws NumberPhoneException {
        String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(soDienThoai);
        if (!matcher.find()) throw new NumberPhoneException("Nhập lại số điện thoại đúng định dạng!!!");
    }

    // Kiểm tra email.
    public static void kiemTraEmail(String email) throws EmailException {
        String regex = "^\\w{3,}(\\.?\\w+)*@[a-z]{2,7}(.[a-z]{2,5}){1,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.find()) throw new EmailException("Nhập lại email đúng định dạng");

    }

    // Kiểm tra loại khách hàng.
    public static void kiemTraLoaiKhachHang(String loaiKhachHang) throws CustomerException {
        String regex = "^(member|sliver|gold|platinium|diamond|Member|Sliver|Gold|Platinium|Diamond)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(loaiKhachHang);
        if (!matcher.find()) throw new CustomerException("Nhập đúng định dạng");
    }
}
