package algorithms.heap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxHeap {
    int[] arr;
    int heapSize;
    int maxSize;

    MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        heapSize = 0;
    }

    int parent(int i) {
        return (i-1)/2;
    }

    int lChild(int i) {
        return 2*i+1;
    }

    int rChild(int i) {
        return 2*i+2;
    }

    void MaxHeapify(int i) {
        int l = lChild(i);
        int r = rChild(i);
        int largest = i;
        if(l < heapSize && arr[l] > arr[i]) {
            largest = l;
        }
        if(r < heapSize && arr[r] > arr[largest]) {
            largest = r;
        }
        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            MaxHeapify(largest);
        }
    }

    int removeMax() {
        if(heapSize <= 0) {
            return Integer.MIN_VALUE;
        }

        if(heapSize == 1) {
            heapSize--;
            return arr[0];
        }

        int root = arr[0];

        arr[0] = arr[heapSize-1];
        heapSize--;

        MaxHeapify(0);
        return root;
    }


    void insertKey(int x) {
        if(maxSize == heapSize) {
            System.out.println("Overflow: Could not add key");
            return;
        }

        heapSize++;
        int i = heapSize - 1;
        arr[i] = x;

        while(i != 0 && arr[parent(i)] < arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    static public void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        heap.insertKey(2);
        heap.insertKey(13);
        heap.insertKey(1);

        heap.removeMax();

        System.out.println(Arrays.toString(heap.arr));
    }
}
