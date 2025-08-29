package Sorting.CountingSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingSort {
    public static void main(String[] args) {
        Integer[] arr = {1, 5, 2, 1, 3, 5, 2, 1, 1, 3, 9, 4, 7, 8, 7, 7, 6};

        System.out.println("Original array: " + Arrays.toString(arr));

        countingSort(arr);


    }

    public static void countingSort(Integer[] arr) {
        // Step 1: Find maximum value
        List<Integer> numberList = Arrays.asList(arr);
        int max = Collections.max(numberList);

        // Step 2: Create count array
        int[] countArray = new int[max + 1];

        // Step 3: Count occurrences of each number
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }

        System.out.println("Count array: " + Arrays.toString(countArray));


    }
}
