package sorting;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int min_idx = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] arg) {
        int[] arr = {1,2,3,5,3,9,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
