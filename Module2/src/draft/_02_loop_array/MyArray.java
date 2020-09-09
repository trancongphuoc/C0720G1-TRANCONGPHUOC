package _02_loop_array;


import java.util.Arrays;

public class MyArray {
    //khai bao
    static int[] arrayNumber;

    //khai bao bang tu khoa new
    static int[] arrayNumber_3 = new int[5];
    static String[] arrayNumber_4 = new String[5];


    public static void main(String[] args) {
        //khoi tao nhanh
        int []arrayNumber_2 = {1,2,3};

        System.out.println(arrayNumber_3[1]);
        System.out.println(arrayNumber_4[1]);

        arrayNumber_3[2] = 1;
        for(int index = 0; index <arrayNumber_3.length;index++){
            System.out.print(arrayNumber_3[index] + "\t");
        }

        System.out.println(Arrays.toString(arrayNumber_2));
        arrayNumber_2[1] = 0;

        // 1, 2, 3
        // ==> sau khi xoa
        // 1, 3, 0

    }
}
