package draft.controllers;

public class ShowInforEmployee {
    public static void hienThiThongTinNhanVien() {
        for (String key : MainMenu.nhanVienMap.keySet()) {
            System.out.println(key + " " + MainMenu.nhanVienMap.get(key));
        }
        MainMenu.menuChinh();
    }
}
