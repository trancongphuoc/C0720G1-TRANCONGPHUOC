package draft.models;

public class ProductXK extends Product {

    Double costXK;
    String quocGia;

    public ProductXK(int idProduct,String code, String name, Double cost, int amount, String nhaSX, Double costXK, String quocGia) {
        super(idProduct,code, name, cost, amount, nhaSX);
        this.costXK = costXK;
        this.quocGia = quocGia;
    }

    public ProductXK(Double costXK, String quocGia) {
        this.costXK = costXK;
        this.quocGia = quocGia;
    }

    public ProductXK() {
    }

    public Double getCostXK() {
        return costXK;
    }

    public void setCostXK(Double costXK) {
        this.costXK = costXK;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public void showInfor() {
        this.toString();
    }

    @Override
    public String toString() {
        return "ProductXK{" +
                "costXK=" + costXK +
                ", quocGia='" + quocGia + '\'' +
                ", idProduct=" + idProduct +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", amount=" + amount +
                ", nhaSX='" + nhaSX + '\'' +
                '}';
    }
}
