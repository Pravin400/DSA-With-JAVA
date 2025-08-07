package Arrays.Day002_Arrays;

public class Array_Binary_Search {
    public static void main(String[] args) {

        // Sorted array (required for binary search)
        int[] number = {3, 4, 5, 6, 8, 10, 15, 20, 42, 54, 56, 66, 90};

        int keyy = 54;  // Key to search
        int founded = binarySearch(number, keyy);

        if (founded != -1) {
            System.out.println(keyy + " Key At index : " + founded);
        } else {
            System.out.println("Key Not in the array ");
        }
    }

    // 🔍 Binary Search Method (Iterative)
    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        // Loop until the search space is exhausted
        while (start <= end) {
            // Prevents overflow compared to (start + end) / 2
            int mid = start + (end - start) / 2;

            if (number[mid] == key) {
                System.out.println("Key Found At The Index : " + mid);
                return mid;
            } else if (key > number[mid]) {
                start = mid + 1; // Search in right half
            } else {
                end = mid - 1; // Search in left half
            }
        }

        return -1; // Key not found
    }
}
