package _00_bai_thi.thuc_don;

import _00_bai_thi.lop.LopHoc;
import _00_bai_thi.lop.SinhVien;

public class HienThiDanhSachSinhVien {
    public static void hienThi() {
        DocFile.docFileSinhVien();
        DocFile.docFileBatch();
        if (ThucDonChinh.sinhVienList.isEmpty()) {
            System.out.println("Khong co sinh vien nao");
            return;
        }
        for (SinhVien sinhVien : ThucDonChinh.sinhVienList) {
            for (LopHoc lopHoc : ThucDonChinh.lopHocList) {
                if (sinhVien.getIdLopHoc() == lopHoc.getIdLopHoc()) {
                    System.out.println( "Lop" + lopHoc.getTenLopHoc() + " " + sinhVien);
                }
            }
//            System.out.println(sinhVien);
        }
    }
}
