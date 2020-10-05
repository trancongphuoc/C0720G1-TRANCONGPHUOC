package java17_binary_file.exercise.product_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static final String FILE_DAT = "src/java17_binary_file/exercise/product_management/PRODUCT.DAT";
    static List<Product> products = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void addProduct() {
        System.out.print("Nhập mã sản phẩm: ");
        String maSanPham = scanner.nextLine();
        System.out.print("Tên sản phẩm: ");
        String tenSanPham = scanner.nextLine();
        System.out.print("Hãng sản phẩm: ");
        String hangSanPham = scanner.nextLine();
        System.out.print("Giá sản phẩm: ");
        String giaTien = scanner.nextLine();

        System.out.print("Mô tả sản phẩm: ");
        String moTa = scanner.nextLine();

        Product product = new Product(maSanPham,tenSanPham,hangSanPham,Float.parseFloat(giaTien),moTa);

        IOFile.writeInFile(FILE_DAT, products,product);
    }

    public static void findProduct() {
        System.out.println("1. Tìm kiếm sản phẩm theo tên.");
        System.out.println("2. Tìm kiếm sản phẩm theo id.");
        System.out.println("3. Trở lại");
        System.out.println("4. Thoát");

        System.out.print("Nhập lựa chọn của bạn: ");
        String choose = scanner.nextLine();
        switch (Integer.parseInt(choose)) {
            case 1:
                boolean flag = false;
                System.out.print("Nhập tên sản phẩm bạn muốn tìm: ");
                String nameProduct = scanner.nextLine();
                for (Product product : products) {
                    if (product.getTenSanPham().equals(nameProduct)) {
                        System.out.println(product);
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Không tìm thấy. ");
                }
                findProduct();
                break;
            case 2:
                flag = false;
                System.out.print("Nhập id sản phẩm bạn muốn tìm: ");
                String idProduct = scanner.nextLine();
                for (Product product : products) {
                    if (product.getMaSanPham().equals(idProduct)) {
                        System.out.println(product);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("Không tìm thấy. ");
                }
                findProduct();
                break;
            case 3:
                mainMenu();
            case 4:
                System.exit(0);
        }
    }

    public static void mainMenu() {
        System.out.println("1. Thêm mới sản phẩm");
        System.out.println("2. Hiển thị danh sách sản phẩm");
        System.out.println("3. Tìm kiếm sản phẩm");
        System.out.println("4. Thoát.");

        System.out.print("Nhập lựa chọn của bạn: ");
        String choose = scanner.nextLine();
        switch (Integer.parseInt(choose)) {
            case 1:
                addProduct();
                mainMenu();
                break;
            case 2:
                IOFile.printFromFile(FILE_DAT);
                mainMenu();
                break;
            case 3:
                findProduct();
            case 4:
                System.exit(0);
        }
    }



    public static void main(String[] args) {
        IOFile.takeData(FILE_DAT, products);
        mainMenu();



    }
}
