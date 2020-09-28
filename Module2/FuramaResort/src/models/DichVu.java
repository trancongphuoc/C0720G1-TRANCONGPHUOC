package models;

public abstract class DichVu {
    private String tenDichVu;
    private float dienTichSuDung;
    private int chiPhiThue;
    private int soLuongNguoi;
    private String kieuThue;

    public DichVu(String tenDichVu, float dienTichSuDung, int chiPhiThue, int soLuongNguoi, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
    }

    public DichVu() {
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public float getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(float dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public int getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    public void massage() {}
    public  void karaoke() {}
    public  void thucAn() {}
    public  void nuocUong() {}
    public  void thueXe() {}

    public abstract String showInfo();

}
