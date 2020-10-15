package _00_bai_thi.thuc_don;

import _00_bai_thi.lop.SinhVien;

import java.util.Scanner;

public class TimKiem {
    public static void timKiem() {
        boolean flag = false;
        DocFile.docFileSinhVien();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien can tim kiem: ");
        String tenSinhVien = scanner.nextLine();

        for (SinhVien sinhVien : ThucDonChinh.sinhVienList) {
            if (sinhVien.getHoVaTen().contains(tenSinhVien)) {
                System.out.println(sinhVien);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("khong tim thay");
        }

    }
}
