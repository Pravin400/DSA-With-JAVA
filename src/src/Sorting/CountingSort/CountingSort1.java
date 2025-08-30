package Sorting.CountingSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingSort1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 5, 2, 1, 3, 5, 2, 1, 1, 3, 9, 4, 7, 8, 7, 7, 6};

        System.out.println("Original array: " + Arrays.toString(arr));

        countingSort(arr);


    }

    public static void countingSort(Integer[] arr) {
       int large = Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
           large = Math.max(large, arr[i]);
       }

       int count [] = new int[large+1];
       for (int i = 0; i < arr.length; i++) {
           count[arr[i]]++;
       }
       int j =0;
       for (int i = 0; i < count.length; i++) {
           while (count[i] > 0) {
               arr[j] =i;
               j++;
               count[i]--;
           }
       }

        System.out.println("Count array: " + Arrays.toString(arr));


    }
}
