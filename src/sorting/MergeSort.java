package sorting;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> list  = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }

        while(left <= mid) {
            list.add(arr[low]);
            left++;
        }

        while(right <= high) {
            list.add(arr[right]);
            right++;
        }

        for(int i=low; i <= high; i++) {
            arr[i] = list.get(i-low);
        }

    }

    static void mergeSort(int[] arr, int low, int high) {

        if(low >= high) {
            return;
        }

        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] arg) {
        int[] arr = {1,23,9,0, 20, 9};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
