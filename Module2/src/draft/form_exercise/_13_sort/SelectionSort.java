package _13_sort;

import java.util.Arrays;

public class SelectionSort {
    private static void sort(int[] myArray) {
        for(int i=0; i<myArray.length-1; i++){
            int min = myArray[i];
            int index = i;

            for(int j = i+1; j < myArray.length; j++){
                if(min > myArray[j]){
                    min = myArray[j];
                    index = j;
                }
            }

            if(index != i){
                int temp = myArray[i];
                myArray[i] = min;
                myArray[index] = temp;
//                myArray[index] = myArray[i];
//                myArray[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {8, 7, 9, 3, 1, 11};
        //int[] myArray = {1, 2, 3, 4};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }


}
