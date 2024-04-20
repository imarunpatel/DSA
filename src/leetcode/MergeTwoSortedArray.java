package leetcode;

import java.util.Arrays;

public class MergeTwoSortedArray {

    static int[] mergeArray(int[] arr1, int[] arr2) {

        int[] merged = new int[arr1.length + arr2.length];

        int index = 0;
        int i=0;
        int j=0;
        while(index < arr1.length && index < arr2.length) {
            if(arr1[i] < arr2[j]) {
                merged[index] = arr1[i];
                i++;
            } else {
                merged[index] = arr2[j];
                j++;
            }
            index++;
        }

        while(i < arr1.length) {
            merged[index] = arr1[i];
            i++;
            index++;
        }

        while(j < arr2.length) {
            merged[index] = arr2[j];
            j++;
            index++;
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,6,7};
        int[] arr2 = {4,8,9,10,23};

        int[] merged = mergeArray(arr1, arr2);
        System.out.print(Arrays.toString(merged));
    }
}
