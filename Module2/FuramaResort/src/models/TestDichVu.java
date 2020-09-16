package models;

public class TestDichVu {
    public static void main(String[] args) {
        DichVu[] dichVus = new DichVu[3];
        dichVus[0] = new Villa("Villa" , 500 , 500 , 20, "Tháng" , "5*" , "Phòng vip", 20, 5);
        dichVus[1] = new House("House" , 300 , 300 , 10, "Tháng" , "3*" , "Phòng vip", 3);
        dichVus[2] = new Room("House" , 300 , 300 , 10, "Tháng" , "Ăn uống");
        for (DichVu dichVu : dichVus) {
            System.out.println(dichVu.showInfo());
            System.out.println();
        }

    }
}
