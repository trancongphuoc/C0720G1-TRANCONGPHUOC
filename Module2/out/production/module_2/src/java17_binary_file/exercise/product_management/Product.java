package java17_binary_file.exercise.product_management;

import java.io.*;

public class Product implements Serializable {
    private String maSanPham;
    private String tenSanPham;
    private String hangSanPham;
    private float giaSanPham;
    private String moTa;

    public Product(String maSanPham, String tenSanPham, String hangSanPham, float giaSanPham, String moTa) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanPham = hangSanPham;
        this.giaSanPham = giaSanPham;
        this.moTa = moTa;
    }

    public Product() {
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanPham() {
        return hangSanPham;
    }

    public void setHangSanPham(String hangSanPham) {
        this.hangSanPham = hangSanPham;
    }

    public float getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(float giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham='" + getMaSanPham() + '\'' +
                ", tenSanPham='" + getTenSanPham() + '\'' +
                ", hangSanPham='" + getHangSanPham() + '\'' +
                ", giaSanPham=" + getGiaSanPham() +
                ", moTa='" + getMoTa() + '\'' +
                '}' + "\n";
    }
}
