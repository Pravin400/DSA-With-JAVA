package _2D_Arrays._2D_Array_DiagonalSum;

import java.util.Arrays;

public class _2D_Array_PrimaryDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,10},
                {4,5,6,11},
                {7,8,9,12},
                {13,14,15,16}
        };
        diagonalSum(matrix);
    }

    public static void diagonalSum(int[][] matrix) {
        int diagonalSum = 0;
        int[] diagonalElements = new int[matrix.length];

        for(int i = 0; i < matrix.length; i++) {
            diagonalElements[i] = matrix[i][i];
            diagonalSum += matrix[i][i];
        }

        System.out.println("Primary Diagonal Elements: " + Arrays.toString(diagonalElements));
        System.out.println("Primary Diagonal Sum: " + diagonalSum);
    }
}
