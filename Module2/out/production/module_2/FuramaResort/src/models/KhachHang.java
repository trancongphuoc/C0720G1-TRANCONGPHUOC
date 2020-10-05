package models;

public class KhachHang implements Comparable<KhachHang> {
    private String hoVaTen;
    private String ngaySinh;
    private String gioiTinh;
    private String cMND;
    private String soDT;
    private String email;
    private String loaiKhachHang;
    private String diaChi;
    private DichVu dichVu;

    public KhachHang(String hoVaTen, String ngaySinh, String gioiTinh, String cMND,
                     String soDT, String email, String loaiKhachHang, String diaChi, DichVu dichVu) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
        this.soDT = soDT;
        this.email = email;
        this.loaiKhachHang = loaiKhachHang;
        this.diaChi = diaChi;
        this.dichVu = dichVu;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public String showInfo() {
        return "Họ và tên: " + getHoVaTen() +
                "\nNgày sinh: " + getNgaySinh() +
                "\nGiới tính: " + getGioiTinh() +
                "\nSố chứng minh: " + getcMND() +
                "\nSố điện thoại: " + getSoDT() +
                "\nEmail: " + getEmail() +
                "\nLoại khách hàng: " + getLoaiKhachHang() +
                "\nĐịa chỉ: " + getDiaChi() +
                "\nThuộc tính: " + getDichVu() + "\n";
    }

    @Override
    public int compareTo(KhachHang o) {
        int result = this.hoVaTen.compareTo(o.getHoVaTen());
        if (result == 0) {
            result= this.ngaySinh.substring(6, 10).compareTo(o.getNgaySinh().substring(6, 10));
        }
        return result;
    }
}
