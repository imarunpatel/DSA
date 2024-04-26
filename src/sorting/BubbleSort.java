package sorting;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=1; j<arr.length-i; j++)
            {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {90,2,3,5,3,9,2, -90};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
