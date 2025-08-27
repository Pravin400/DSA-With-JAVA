package Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortswap {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5};

        bubblesort1(number);
    }

    private static void bubblesort1(int[] number) {
            int swap  = 0;
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - i - 1; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                    swap++;

                }
            }
        }
            if (swap == 0){
                System.out.println("No swap already sorted");
            }

            System.out.println(Arrays.toString(number));
    }


    }

