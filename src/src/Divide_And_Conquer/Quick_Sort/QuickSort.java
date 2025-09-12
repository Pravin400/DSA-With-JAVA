package Divide_And_Conquer.Quick_Sort;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quicksort(arr, 0, arr.length - 1);
        printSortedArray(arr);
    }

    public static void printSortedArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    // Recursive QuickSort function
    public static void quicksort(int arr[], int si, int ei) {
        // Base case: when subarray has 0 or 1 element it is already sorted
        if (si >= ei) return;

        // Partition the array and get pivot index where pivot is placed correctly
        int pIdx = partition(arr, si, ei);

        // Recursively sort left part
        quicksort(arr, si, pIdx - 1);

        // Recursively sort right part
        quicksort(arr, pIdx + 1, ei);
    }

    // Lomuto partition scheme: pivot = arr[ei]
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];          // choose last element as pivot
        int i = si - 1;               // boundary for elements smaller than pivot

        // Iterate and move elements smaller than pivot to the left side
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[j] and arr[i]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Place pivot at correct position (just after the last smaller element)
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i; // pivot's final index
    }
}