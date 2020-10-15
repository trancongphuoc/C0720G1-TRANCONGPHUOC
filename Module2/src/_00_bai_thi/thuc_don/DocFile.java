package _00_bai_thi.thuc_don;

import _00_bai_thi.dung_chung.FileUntil;
import _00_bai_thi.lop.GiaoVien;
import _00_bai_thi.lop.LopHoc;
import _00_bai_thi.lop.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class DocFile {
    public static void docFileBatch() {
        ThucDonChinh.listLine = FileUntil.readFile(ThucDonChinh.FILE_BACTCHS);
        ThucDonChinh.lopHocList = new ArrayList<>();
        for (String line : ThucDonChinh.listLine) {
            String[] split = line.split(",");
            LopHoc lopHoc = new LopHoc(Integer.parseInt(split[0]), split[1], split[2]);

            ThucDonChinh.lopHocList.add(lopHoc);
        }
    }

    public static void docFileSinhVien() {
        ThucDonChinh.listLine = FileUntil.readFile(ThucDonChinh.FILE_SINHVIEN);
        ThucDonChinh.sinhVienList = new ArrayList<>();
        for (String line : ThucDonChinh.listLine) {
            String[] split = line.split(",");
            SinhVien sinhVien = new SinhVien(Integer.parseInt(split[0]), split[1],
                    split[2], split[3], split[4], Integer.parseInt(split[5]));

            ThucDonChinh.sinhVienList.add(sinhVien);
        }
    }

    public static void docFileGiaoVien() {
        ThucDonChinh.listLine = FileUntil.readFile(ThucDonChinh.FILE_GIAOVIEN);
        List<GiaoVien> giaoVienList = new ArrayList<>();
        for (String line : ThucDonChinh.listLine) {
            String[] split = line.split(",");
            GiaoVien giaoVien = new GiaoVien(Integer.parseInt(split[0]),
                    split[1], split[2], split[3], split[4]);

            giaoVienList.add(giaoVien);
        }
        for (GiaoVien giaoVien : giaoVienList) {
            System.out.println(giaoVien);
        }
    }
}
