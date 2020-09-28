package models;

public class House extends DichVu {
    private String tieuChuanPhong;
    private String moTa;
    private int soTang;

    public House(String tenDichVu, float dienTichSuDung, int chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanPhong, String moTa, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTa = moTa;
        this.soTang = soTang;
    }

    public House(String tieuChuanPhong, String moTa, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTa = moTa;
        this.soTang = soTang;
    }

    public House() {
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
                "\nSố tầng:" + getSoTang();
    }
}
