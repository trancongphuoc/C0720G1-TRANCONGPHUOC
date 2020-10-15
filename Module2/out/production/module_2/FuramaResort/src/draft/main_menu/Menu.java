package draft.main_menu;

import draft.models.Product;
import draft.models.ProductNK;
import draft.models.ProductXK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static List<String> listLine = new ArrayList<>();
    static List<Product> productList = new ArrayList<>();
    static List<ProductNK> productNKList = new ArrayList<>();
    static List<ProductXK> productXKList = new ArrayList<>();
    static final String COMA = ",";
    static final String PATH_FILE = "src/draft/data/product.csv";
    public static void displayMainMenu() {
        String choice;
        do {
            System.out.println("1. Add.");
            System.out.println("2. Delete.");
            System.out.println("3. Print list.");
            System.out.println("4. Find.");
            System.out.println("5. Exit.");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Add.menuAdd();
                    break;
                case "2":
                    Print.prints();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    System.exit(0);
                default:
                    displayMainMenu();
            }
        } while (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) < 6);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
