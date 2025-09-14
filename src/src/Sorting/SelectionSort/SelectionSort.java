package Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

            int[] arr = {5, 3, 6, 2, 4};
            selectionSort(arr);
            System.out.println("Sorted Array: " + Arrays.toString(arr));
        }

        public static void selectionSort ( int[] arr){
            int n = arr.length;

            // Outer loop moves boundary of unsorted array
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                // Find the minimum element in unsorted part
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                // Swap minimum element with first element of unsorted part
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

