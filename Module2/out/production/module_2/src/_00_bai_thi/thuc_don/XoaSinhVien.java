package _00_bai_thi.thuc_don;

import _00_bai_thi.dung_chung.FileUntil;
import _00_bai_thi.lop.SinhVien;
import _00_bai_thi.validate.NotFoundStudentException;
import _00_bai_thi.validate.Validate;

import java.util.ArrayList;
import java.util.Scanner;

public class XoaSinhVien {
    public static void xoaSinhVien() {
        DocFile.docFileSinhVien();
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        int idSinhVien = 0;
        do {
            flag = true;
            try {
                System.out.print("Nhap id sinh vien: ");
                idSinhVien = scanner.nextInt();
                scanner.nextLine();
                Validate.kiemTraID(idSinhVien);
            } catch (NotFoundStudentException e) {
                e.printStackTrace();
                flag = false;
            }

        } while (!flag);


        for (int i = 0; i < ThucDonChinh.sinhVienList.size(); i++) {
            if (ThucDonChinh.sinhVienList.get(i).getId() == idSinhVien) {
                System.out.println("Yes or No");
                if (scanner.nextLine().equals("Yes")) {
                    ThucDonChinh.sinhVienList.remove(i);
                    i--;
                } else {
                    return;
                }
            }
        }

        ThucDonChinh.listLine = new ArrayList<>();
        for (SinhVien sinhVien : ThucDonChinh.sinhVienList) {
            String line = sinhVien.getId() + ThucDonChinh.COMA + sinhVien.getHoVaTen() + ThucDonChinh.COMA +
                    sinhVien.getNgaySinh() + ThucDonChinh.COMA + sinhVien.getGioiTinh() + ThucDonChinh.COMA +
                    sinhVien.getSoDienThoai() + ThucDonChinh.COMA + sinhVien.getIdLopHoc();
            ThucDonChinh.listLine.add(line);
        }

        FileUntil.writeFile(ThucDonChinh.FILE_SINHVIEN, ThucDonChinh.listLine);
        HienThiDanhSachSinhVien.hienThi();

    }
}
