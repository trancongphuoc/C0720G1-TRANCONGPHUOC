package draft.main_menu;

import draft.commons.FileUntil;
import draft.models.Product;
import draft.models.ProductNK;
import draft.models.ProductXK;
import furama_resort.controllers._00_main_menu.MainMenu;

import java.util.Scanner;

public class Add {
    static int idProduct;
    static String code;
    static String name;
    static String cost;
    static String nhaSX;
    static String amount;

    public static void menuAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. add product NK");
        System.out.println("2. add product XK.");
        System.out.println("3. Back");
        System.out.println("4. Exit");

        System.out.println("Enter choice");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                addProductNK();
                break;
            case "2":
                addProductXK();
                break;
            case "3":
                break;
            case "4":
                break;
            default:
                menuAdd();
        }
    }

    public static void addNewProduct() {
        Scanner scanner = new Scanner(System.in);

        idProduct =  (Menu.productList.size() == 0) ? (idProduct = 1 ) : (idProduct = Menu.productList.size() + 1);

        System.out.print("Enter code Product: ");
        code = scanner.nextLine();

        System.out.print("Enter name Product: ");
        name = scanner.nextLine();

        System.out.println("Enter cost Product: ");
        cost = scanner.nextLine();

        System.out.println("Enter amount: ");
        amount = scanner.nextLine();

        System.out.print("Enter nhaSX: ");
        nhaSX = scanner.nextLine();
    }

    public static void addProductNK() {
        Scanner scanner = new Scanner(System.in);
        addNewProduct();
        System.out.println("Enter costNK");
        String costNK = scanner.nextLine();

        System.out.println("Enter tinh Thanh");
        String tinhThanh = scanner.nextLine();

        System.out.println("Enter thueNK");
        String thueNK = scanner.nextLine();

        ProductNK productNK = new ProductNK(idProduct,code,name,Double.parseDouble(cost),
                Integer.parseInt(amount),nhaSX,Double.parseDouble(costNK),tinhThanh,Double.parseDouble(thueNK));
        Menu.productList.add(productNK);
        String line = idProduct + Menu.COMA + code + Menu.COMA + name + Menu.COMA + cost + Menu.COMA +
                amount + Menu.COMA + nhaSX + Menu.COMA + costNK + Menu.COMA + tinhThanh + Menu.COMA + thueNK;

        Menu.listLine = FileUntil.readFile(Menu.PATH_FILE);
        Menu.listLine.add(0, "id,code,name,cost,amount,nhaSX");
        Menu.listLine.add(line);

        FileUntil.writeInFile(Menu.PATH_FILE, Menu.listLine);

    }

    public static void addProductXK() {
        Scanner scanner = new Scanner(System.in);
        addNewProduct();
        System.out.println("Enter costXK");
        String costNK = scanner.nextLine();

        System.out.println("Enter quoc gia");
        String quocgia = scanner.nextLine();


        ProductXK productXK = new ProductXK(idProduct,code,name,Double.parseDouble(cost),
                Integer.parseInt(amount),nhaSX,Double.parseDouble(costNK),quocgia);
        Menu.productList.add(productXK);
        String line = idProduct + Menu.COMA + code + Menu.COMA + name + Menu.COMA + cost + Menu.COMA +
                amount + Menu.COMA + nhaSX + Menu.COMA + costNK + Menu.COMA + quocgia;

        Menu.listLine = FileUntil.readFile(Menu.PATH_FILE);
        Menu.listLine.add(line);

        FileUntil.writeInFile(Menu.PATH_FILE, Menu.listLine);

    }


}
