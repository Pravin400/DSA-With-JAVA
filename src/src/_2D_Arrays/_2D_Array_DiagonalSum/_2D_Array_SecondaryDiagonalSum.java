package _2D_Arrays._2D_Array_DiagonalSum;

import java.util.Arrays;

public class _2D_Array_SecondaryDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        diagonalSum(matrix);
    }

    public static void diagonalSum(int[][] matrix) {
        int diagonalSum = 0;
        int[] diagonalElements = new int[matrix.length];
        int n = matrix.length;

        for(int i = 0; i < matrix.length; i++) {
            diagonalElements[i] = matrix[i][n - i - 1];
            diagonalSum += diagonalElements[i];
        }

        System.out.println("Secondary Diagonal Elements: " + Arrays.toString(diagonalElements));
        System.out.println("Secondary Diagonal Sum: " + diagonalSum);
    }
}
