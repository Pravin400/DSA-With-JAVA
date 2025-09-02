package _2D_Arrays._2D_Array_DiagonalSum;

import java.util.Arrays;

public class _2D_Array_DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}} ;
        diagonalSum(matrix);
    }
    public static void diagonalSum(int[][] matrix) {
        int diagonalSum = 0;
        int []diagonalelements = new int[3];
        int count = 0;
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                if(row == col) {
                    diagonalelements[row] = matrix[row][col];
                    diagonalSum += diagonalelements[row] ;
                    count++;
                    if(count == 3) {
        System.out.println("Diagonal elemets are : " + Arrays.toString(diagonalelements));
        System.out.println("diagonal sum is " + diagonalSum);
                        return;
                    }
                }
            }
        }
    }
}
