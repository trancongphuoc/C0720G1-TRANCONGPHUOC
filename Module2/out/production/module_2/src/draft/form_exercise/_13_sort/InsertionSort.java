package _13_sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] myArray = {8, 7, 9, 3, 1, 11};
        //int[] myArray = {1, 2, 3, 4};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private static void sort(int[] list) {
        for (int i = 1; i < list.length; i++) {

            int currentElement = list[i];
            int k = i - 1;
            for (; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
//            while (k >= 0 && list[k] > currentElement) {
//                list[k + 1] = list[k];
//                k--;
//            }

            list[k + 1] = currentElement;
        }
    }
}
