package Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort1 {
    public static void main(String[] args) {
        int [] arr = {5, 3, 6, 2,1, 4};
        System.out.println("Actual Array: " + Arrays.toString(arr));

        increasingsorting(arr);
        System.out.println("Increasing Sorted Array: " + Arrays.toString(arr));
        decreasingsorting(arr);
        System.out.println("Decreasing Sorted Array: " + Arrays.toString(arr));

    }

    private static void decreasingsorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[min]) {
                    min = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }

    public static void increasingsorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

    }
}
