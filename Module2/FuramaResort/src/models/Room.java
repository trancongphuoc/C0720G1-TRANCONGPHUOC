package models;

public class Room extends DichVu{
    private String dichVuMienPhi;

    public Room(String tenDichVu, float dienTichSuDung, int chiPhiThue, int soLuongNguoi, String kieuThue, String dichVuMienPhi) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room() {
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }


    @Override
    public String showInfo() {
        return "Tên dịch vụ: " + getTenDichVu() +
                "\nDiện tích sử dụng: " + getDienTichSuDung() +
                "\nChi phí thuê: " + getChiPhiThue() +
                "\nSố lượng người tối đa: " + getSoLuongNguoi() +
                "\nKiểu thuê: " + getKieuThue() +
                "\nDịch vụ miên phí đi kèm: " + getDichVuMienPhi();
    }
}
