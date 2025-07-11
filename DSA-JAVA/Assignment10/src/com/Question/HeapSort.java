package com.Question;

import java.util.Arrays;

public class HeapSort {
	//logic of heapSort
	private static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }
	//putting on heap
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }
    //swap
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    
    //main
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 451, 21, 4, 12};
        System.out.println("Original: " + Arrays.toString(arr));
        heapSort(arr);
        System.out.println("Sorted Ascending: " + Arrays.toString(arr));
    }

}
