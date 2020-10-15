package _00_bai_thi.thuc_don;

import _00_bai_thi.dung_chung.FileUntil;
import _00_bai_thi.lop.LopHoc;
import _00_bai_thi.lop.SinhVien;
import _00_bai_thi.validate.NgaySinhException;
import _00_bai_thi.validate.SoDienThoaiException;
import _00_bai_thi.validate.TenException;
import _00_bai_thi.validate.Validate;

import java.util.Scanner;

public class ThemSinhVien {
    public static void themMoiSinhVien() {
        DocFile.docFileBatch();
        DocFile.docFileSinhVien();
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        int idSinhVien = 0;
        idSinhVien = (ThucDonChinh.sinhVienList.size() == 0) ? 1 : idSinhVien + (ThucDonChinh.sinhVienList.get(ThucDonChinh.sinhVienList.size() - 1).getId() + 1);
        String tenSinhVien = null;
        do {
            flag = true;
            try {
                System.out.print("Nhap ten sinh vien: ");
                tenSinhVien = scanner.nextLine();
                Validate.kiemTraTen(tenSinhVien);
            } catch (TenException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);

        String ngaySinh = null;
        do {
            flag = true;
            try {
                System.out.print("Nhap ngay sinh: ");
                ngaySinh = scanner.nextLine();
                Validate.kiemTraNgaySinh(ngaySinh);
            } catch (NgaySinhException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);
        
        String gioiTinh;
        do {
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = scanner.nextLine();
        } while (gioiTinh.equals(""));

        String soDienThoai = null;
        do {
            flag = true;
            try {
                System.out.print("Nhap so dien thoai: ");
                soDienThoai = scanner.nextLine();
                Validate.kiemTraSoDienThoai(soDienThoai);
            } catch (SoDienThoaiException e) {
                e.printStackTrace();
                flag = false;
            }

            for (SinhVien sinhVien : ThucDonChinh.sinhVienList) {
                if (sinhVien.getSoDienThoai().equals(soDienThoai)) {
                    System.out.println("So dien thoai da ton tai !!!");
                    flag = false;
                    break;
                }
            }
        } while (!flag);

        int idLopHoc;
        do {
            flag = false;
            System.out.print("Nhap ma lop hoc: ");
            idLopHoc = scanner.nextInt();
            for (LopHoc lopHoc : ThucDonChinh.lopHocList) {
                if (lopHoc.getIdLopHoc() == idLopHoc) {
                    flag = true;
                    break;
                }
            }
            System.out.println("Ma lop hoc khong ton tai");
        } while (!flag);


        SinhVien sinhVien = new SinhVien(idSinhVien, tenSinhVien, ngaySinh, gioiTinh, soDienThoai, idLopHoc);

        String line = sinhVien.getId() + ThucDonChinh.COMA + sinhVien.getHoVaTen() + ThucDonChinh.COMA +
                sinhVien.getNgaySinh() + ThucDonChinh.COMA + sinhVien.getGioiTinh() + ThucDonChinh.COMA +
                sinhVien.getSoDienThoai() + ThucDonChinh.COMA + sinhVien.getIdLopHoc();

        ThucDonChinh.listLine = FileUntil.readFile(ThucDonChinh.FILE_SINHVIEN);
        ThucDonChinh.listLine.add(line);
        FileUntil.writeFile(ThucDonChinh.FILE_SINHVIEN, ThucDonChinh.listLine);
        System.out.println("Them thanh cong");
    }


}
