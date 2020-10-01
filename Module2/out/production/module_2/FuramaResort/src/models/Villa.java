package models;

public class Villa extends DichVu {
    private String tieuChuanPhong;
    private String moTa;
    private float dienTichHoBoi;
    private int soTang;

    public Villa(String maDichVu, String tenDichVu, float dienTichSuDung, int chiPhiThue, int soLuongNguoi,
                 String kieuThue, String tieuChuanPhong, String moTa, float dienTichHoBoi, int soTang) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTa = moTa;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String tieuChuanPhong, String moTa, int dienTichHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTa = moTa;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa() {
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public float getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(float dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }


    @Override
    public String showInfo() {
        return  "Mã dịch vụ: " + getMaDichVu() +
                "Tên dịch vụ: " + getTenDichVu() +
                "\nMô tả: " + getMoTa() +
                "\nTiêu chuẩn phòng: " + getTieuChuanPhong() +
                "\nDiện tích sử dụng: " + getDienTichSuDung() +
                "\nChi phí thuê: " + getChiPhiThue() +
                "\nSố lượng người tối đa: " + getSoLuongNguoi() +
                "\nKiểu thuê: " + getKieuThue() +
                "\nDiện tích hồ bơi: " + getDienTichHoBoi() +
                "\nSố tầng:" + getSoTang();
    }
}
