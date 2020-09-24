package java12_collection_framework.exercise.practice_arraylist_linkedlist;

public class Product {
    String nameProduct;
    Float price;
    int id;

    public Product(int id,String nameProduct, float price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
