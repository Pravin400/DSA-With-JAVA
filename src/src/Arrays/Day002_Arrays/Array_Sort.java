package Arrays.Day002_Arrays;

public class Array_Sort {
    public static void main(String[] args) {
        // Original unsorted array
        int[] number = {13, 4, 1, 5, 6, 7};

        System.out.println("Original array:");
        printArray(number);

        // Sort the array
        bubbleSort(number);

        System.out.println("Sorted array:");
        printArray(number);
    }

    /**
     * 🔄 Bubble Sort Algorithm
     * → Repeatedly compares adjacent elements
     * → Swaps them if they are in the wrong order
     * → After each outer loop, the largest unsorted element moves to its correct position
     * → Time Complexity: O(n^2)
     */
    public static void bubbleSort(int[] number) {
        int n = number.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            // Inner loop: goes from 0 to n - i - 1
            for (int j = 0; j < n - 1 - i; j++) {
                if (number[j] > number[j + 1]) {
                    // Swap number[j] and number[j + 1]
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no elements were swapped → array is already sorted
            if (!swapped) break;
        }
    }

    // 📤 Utility method to print array elements
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
