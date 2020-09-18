package models;

public class Villa extends DichVu {
    private String tieuChuanPhong;
    private String moTa;
    private int dienTichHoBoi;
    private int soTang;

    public Villa(String tenDichVu, int dienTichSuDung, int chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanPhong,String moTa, int dienTichHoBoi, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTa = moTa;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String tieuChuanPhong,String moTa, int dienTichHoBoi, int soTang) {
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

    public int getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(int dienTichHoBoi) {
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
        return "Tên dịch vụ: " + getTenDichVu() +
                "\nMô tả: " + getMoTa() +
                "\nTiêu chuẩn phòng: " + getTieuChuanPhong() +
                "\nDiện tích sử dụng: " + getDienTichSuDung() +
                "\nChi phí thuê: " + getChiPhiThue() +
                "\nSố lượng người tối đa: " + getSoLuongNguoi() +
                "\nKiểu thuê: " + getKieuThue() +
                "\nDiện tích hồ bơi: " + getDienTichHoBoi() +
                "\nSố tầng:" + getSoTang() ;
    }
}
