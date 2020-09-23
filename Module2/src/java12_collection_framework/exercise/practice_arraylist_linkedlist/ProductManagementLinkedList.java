package java12_collection_framework.exercise.practice_arraylist_linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagementLinkedList {
    static LinkedList<Product> products = new LinkedList<>();
    static void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Enter Price: ");
        float price = scanner.nextFloat();
        Product product = new Product(id,nameProduct,price);
        products.add(product);
    }

    static void  setProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name: ");
        String nameProduct = scanner.nextLine();
        for (Product product : products) {
            if (product.getId() == id) {
                product.setNameProduct(nameProduct);
            }
        }
    }

    static void delProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
            }
        }
    }

    static void displayProduct() {
        for (Product product: products) {
            System.out.println(product);
        }
    }

    static void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String nameProduct = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getNameProduct().equals(nameProduct)) {
                System.out.println(products.get(i));
            }
        }
    }

    static void ascending() {
        Collections.sort(products, new ProductComparatorAscending());
        for (Product product: products) {
            System.out.println(product);
        }
    }

    static void decrease() {
        Collections.sort(products, new ProductComparatorDecrease());
        for (Product product: products) {
            System.out.println(product);
        }
    }

    static void menu() {
        System.out.println("1. Add product. ");
        System.out.println("2. Set information product(id). ");
        System.out.println("3. Del product(id). ");
        System.out.println("4. Display list product. ");
        System.out.println("5. Search for product by name. ");
        System.out.println("6. Display for product by price(ascending). ");
        System.out.println("7. Display for product by price(decrease). ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                addProduct();
                menu();
                break;
            case 2:
                setProduct();
                menu();
                break;
            case 3:
                delProduct();
                menu();
                break;
            case 4:
                displayProduct();
                menu();
                break;
            case 5:
                searchProduct();
                menu();
                break;
            case 6:
                ascending();
                menu();
                break;
            case 7:
                decrease();
                menu();
                break;
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
