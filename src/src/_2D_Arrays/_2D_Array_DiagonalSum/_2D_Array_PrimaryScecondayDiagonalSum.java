package _2D_Arrays._2D_Array_DiagonalSum;

import java.util.Arrays;

public class _2D_Array_PrimaryScecondayDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}} ;
        diagonalSum(matrix);
    }
    public static void diagonalSum(int[][] matrix) {
        int diagonalSum = 0;
        int []pridiagonalelements = new int[matrix.length];
        int []secdiagonalelements = new int[matrix.length];
        int n = matrix.length;
        for(int i = 0; i < matrix.length; i++) {
            //primary diagonal
            diagonalSum += matrix[i][i];
            pridiagonalelements[i] = matrix[i][i];

            if(i != n - i - 1){
                diagonalSum += matrix[i][n - i - 1];
                secdiagonalelements[i] = matrix[i][n - i - 1];
                }
            }
        System.out.println("Primary Diagonal Elements: " + Arrays.toString(pridiagonalelements));
        System.out.println("Secondary Diagonal Elements: " + Arrays.toString(secdiagonalelements));
        System.out.println("Sum of Primary and Secondary Diagonal : " + diagonalSum);
        }
    }

