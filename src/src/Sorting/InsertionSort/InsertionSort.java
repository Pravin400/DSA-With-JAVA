package Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5,3,4,1,2};
        System.out.println("Actual Array: " + Arrays.toString(arr));
        insertionsort(arr);
        System.out.println("Actual Array: " + Arrays.toString(arr));
    }

    private static void insertionsort(int[] arr) {

        for (int i = 1; i < arr.length ; i++) {
            int current = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
    }
}
