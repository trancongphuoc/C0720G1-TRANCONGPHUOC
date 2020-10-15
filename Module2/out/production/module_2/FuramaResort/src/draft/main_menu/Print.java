package draft.main_menu;

import draft.commons.FileUntil;
import draft.models.Product;
import draft.models.ProductNK;
import draft.models.ProductXK;

import java.util.ArrayList;

public class Print {
    public static void prints() {
        readFile();
        for (Product product : Menu.productList) {
            System.out.println(product);
//            if (product instanceof ProductNK) {
//                System.out.println(product.showInfor(););
//            }
        }
    }
    public static void readFile() {
        Menu.productList = new ArrayList<>();
        Menu.listLine = FileUntil.readFile(Menu.PATH_FILE);

        for (String line: Menu.listLine) {
            String[] split = line.split(",");
            if (split.length == 9) {
                ProductNK productNK = new ProductNK(Integer.parseInt(split[0]),split[1],split[2],Double.parseDouble(split[3]),
                        Integer.parseInt(split[4]),split[5],Double.parseDouble(split[6]),split[7],Double.parseDouble(split[8]));
                Menu.productList.add(productNK);
            } else if (split.length == 8) {
                ProductXK productXK = new ProductXK(Integer.parseInt(split[0]),split[1],split[2],Double.parseDouble(split[3]),
                        Integer.parseInt(split[4]),split[5],Double.parseDouble(split[6]),split[7]);
                Menu.productList.add(productXK);
            }

        }
    }
}
