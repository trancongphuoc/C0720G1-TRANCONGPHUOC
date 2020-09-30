package java14_algorthm_sort.exercise;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 8, 1, 6};

        for (int o : array) {
            System.out.print(o + " ");
        }
        System.out.println();

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    System.out.println("insert " + array[i] + " into " + array[j]);
                    int temp = array[i];
                    for (int k = i; k > j; k--) {
                        array[k] = array[k - 1];
                    }
                    array[j] = temp;
                    for (int o : array) {
                        System.out.print(o + " ");
                    }
                    System.out.println();
                    break;
                }
            }
        }

    }
}
