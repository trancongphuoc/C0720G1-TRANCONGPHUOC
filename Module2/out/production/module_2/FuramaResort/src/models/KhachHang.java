package models;

public class KhachHang {
    private String hoVaTen;
    private String ngaySinh;
    private String gioiTinh;
    private String cMND;
    private String soDT;
    private String email;
    private String loaiKhachHang;
    private DichVu diaChi;
    private DichVu thuocTinh;

    public KhachHang(String hoVaTen, String ngaySinh, String gioiTinh, String cMND,
                     String soDT, String email, String loaiKhachHang, DichVu diaChi, DichVu thuocTinh) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.soDT = soDT;
        this.email = email;
        this.loaiKhachHang = loaiKhachHang;
        this.diaChi = diaChi;
        this.thuocTinh = thuocTinh;
    }

    public KhachHang() {
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getcMND() {
        return cMND;
    }

    public void setcMND(String cMND) {
        this.cMND = cMND;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public DichVu getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DichVu diaChi) {
        this.diaChi = diaChi;
    }

    public DichVu getThuocTinh() {
        return thuocTinh;
    }

    public void setThuocTinh(DichVu thuocTinh) {
        this.thuocTinh = thuocTinh;
    }

    public String showInfo() {
        return "Họ và tên: " + getHoVaTen() +
                "Ngày sinh: " + getNgaySinh() +
                "Giới tính: " + getGioiTinh() +
                "Số chứng minh: " + getcMND() +
                "Số điện thoại: " + getSoDT() +
                "Email: " + getEmail() +
                "Loại khách hàng: " + getLoaiKhachHang() +
                "Địa chỉ: " + getDiaChi() +
                "Thuộc tính: " + getThuocTinh();
    }
}
