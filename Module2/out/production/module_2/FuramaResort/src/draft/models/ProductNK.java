package draft.models;

public class ProductNK extends Product {

    Double costNK;
    String tinhThanh;
    Double thue;

    public ProductNK(int idProduct, String code, String name, Double cost, int amount, String nhaSX, Double costNK, String tinhThanh, Double thue) {
        super(idProduct,code, name, cost, amount, nhaSX);
        this.costNK = costNK;
        this.tinhThanh = tinhThanh;
        this.thue = thue;
    }

    public ProductNK(Double costNK, String tinhThanh, Double thue) {
        this.costNK = costNK;
        this.tinhThanh = tinhThanh;
        this.thue = thue;
    }

    public ProductNK() {
    }

    public Double getCostNK() {
        return costNK;
    }

    public void setCostNK(Double costNK) {
        this.costNK = costNK;
    }

    public String getTinhThanh() {
        return tinhThanh;
    }

    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

    public Double getThue() {
        return thue;
    }

    public void setThue(Double thue) {
        this.thue = thue;
    }

    @Override
    public void showInfor() {
        this.toString();
    }

    @Override
    public String toString() {
        return "ProductNK{" +
                "costNK=" + costNK +
                ", tinhThanh='" + tinhThanh + '\'' +
                ", thue=" + thue +
                ", idProduct=" + idProduct +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", amount=" + amount +
                ", nhaSX='" + nhaSX + '\'' +
                '}';
    }
}
