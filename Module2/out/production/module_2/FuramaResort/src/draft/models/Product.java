package draft.models;

public abstract class Product {
    int idProduct;
    String code;
    String name;
    Double cost;
    int amount;
    String nhaSX;

    public Product(int idProduct,String code, String name, Double cost, int amount, String nhaSX) {
        this.idProduct = idProduct;
        this.code = code;
        this.name = name;
        this.cost = cost;
        this.amount = amount;
        this.nhaSX = nhaSX;
    }

    public Product() {
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public abstract void showInfor();
}
