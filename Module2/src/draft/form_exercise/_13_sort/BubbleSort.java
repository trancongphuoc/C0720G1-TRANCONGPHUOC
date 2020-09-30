package _13_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] array) {
        int count = 0;
        boolean flag = true;
        for (int i = 1; i < array.length && flag; i++) {
            count++;
            flag = false;
            for (int k = 0; k < array.length - i; k++) {
                count++;
                if (array[k] > array[k + 1]) {
                    flag = true;
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        System.out.println("loop number:" + count);
    }

    public static void main(String[] args) {
        //int[] myArray = {8, 7, 9, 3, 1, 11};
        int[] myArray = {1, 2, 3, 4};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
