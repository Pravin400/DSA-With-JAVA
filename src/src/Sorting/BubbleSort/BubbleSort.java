package Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] number = {5,4,1,3,2};
        bubblesort(number);
        bubblesort1(number);
    }

    private static void bubblesort1(int[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - i - 1; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;

                }
            }
        }
            System.out.println(Arrays.toString(number));
    }

    private static void bubblesort(int[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length-1; j++) {
                if (number[j] > number[j+1]) {
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(number));
        }
    }

