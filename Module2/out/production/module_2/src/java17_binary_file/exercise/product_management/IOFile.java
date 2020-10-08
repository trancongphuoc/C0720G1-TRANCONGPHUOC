package java17_binary_file.exercise.product_management;

import java.io.*;
import java.util.List;

public class IOFile {
    public static void writeInFile(String filePath, List<Product> products, Product product) {
        try {
            takeData(filePath, products);

            OutputStream outputStream = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(outputStream);
            products.add(product);
            oos.writeObject(products);
            oos.close();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> takeData(String filePath, List<Product> products) {
        try {
            InputStream inputStream = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(inputStream);

            List<Product> product = (List<Product>) ois.readObject();

            for (Object obj : product) {
                products.add((Product) obj);
            }
            ois.close();
            inputStream.close();

        } catch (EOFException e) {
            System.out.println("File Rong");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void printFromFile(String filePath) {
        try {
            InputStream inputStream = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(inputStream);

            List<Product> product = (List<Product>) ois.readObject();

            for (Object obj : product) {
                System.out.println(obj);
            }

            ois.close();
            inputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
