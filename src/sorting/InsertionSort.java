package sorting;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] arg) {
        int[] arr = {90,2,3,5,3,9,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}








