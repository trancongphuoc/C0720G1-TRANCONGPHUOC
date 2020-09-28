package models;

import commons.FileUntils;

import java.util.ArrayList;
import java.util.List;

public class TestDichVu {

    public static final String FILE_NAME = "src/data/test.csv";
    public static final String COMMA = " , ";

    public static void main(String[] args) {
        DichVu villa = new Villa("Villa" , 500 , 500 , 20, "Tháng" , "5*" , "Phòng vip", 20, 5);
        DichVu house = new House("House" , 300 , 300 , 10, "Tháng" , "3*" , "Phòng vip", 3);
        DichVu room = new Room("House" , 300 , 300 , 10, "Tháng" , "Ăn uống");
        List<DichVu> dichVus = new ArrayList<>();
        dichVus.add(villa);
        dichVus.add(house);
        dichVus.add(room);

        String line = null;
        for (DichVu dichVu : dichVus) {
            line = dichVu.getTenDichVu() + COMMA + dichVu.getKieuThue() + COMMA + dichVu.getChiPhiThue() + COMMA + dichVu.getSoLuongNguoi() + COMMA + dichVu.getDienTichSuDung();
            FileUntils.writeFile(FILE_NAME,line);
        }

        List<String> listLine = FileUntils.readFile(FILE_NAME);
        System.out.println(listLine);

        String[] lineSplit = listLine.get(0).split(COMMA);
        DichVu villa1 = new Villa(lineSplit[0], Integer.parseInt(lineSplit[1] ), Integer.parseInt(lineSplit[2] ), Integer.parseInt(lineSplit[3] ),lineSplit[4], lineSplit[5],lineSplit[6], Integer.parseInt(lineSplit[7] ),Integer.parseInt(lineSplit[8] ));
        System.out.println(lineSplit);
    }
}
