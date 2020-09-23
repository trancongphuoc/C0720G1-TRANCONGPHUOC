package java12_collection_framework.exercise.practice_arraylist_linkedlist;

import java.util.Comparator;

public class ProductComparatorAscending implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        float price1 = o1.getPrice();
        float price2 = o2.getPrice();
        if (price1 > price2) {
            return 1;
        } else if (price1 == price2) {
            return 0;
        } else {
            return -1;
        }
    }
}
