package _2D_Arrays._2D_Array_Search;

public class _2D_Array_StareCaseSearchHighEfficiency {
    public static void main(String[] args) {
        int [] [] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}

        };
        int key = 33;
        int x = 0;
        int y = matrix.length-1;
        int upper = matrix[x][y];
        int lower = matrix[y][x];

        if(upper<lower){

        stairCaseSearch(matrix,key);
            System.out.println("Upper Key is use for efficent search because it closer to key");
        }
        else {
            stairCaseSearch1(matrix,key);
            System.out.println("lower Key is use for efficent search because it closer to key");

        }

    }
    private static boolean stairCaseSearch(int[][] matrix ,int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        int start = matrix[row][col];
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("key : "+key+ " successfully found ");
                System.out.println(key+" found at index : Matrix[" + row + "][" + col + "]");
                return true;
            } else if (matrix[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key : "+key+ " not found !!! ");
        return false;
    }
    private static boolean stairCaseSearch1(int[][] matrix ,int key) {
        int row = matrix.length-1;
        int col = 0;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("key : "+key+ " successfully found ");
                System.out.println(key+" found at index : Matrix[" + row + "][" + col + "]");
                return true;
            } else if (matrix[row][col] > key) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("key : "+key+ " not found !!! ");
        return false;
    }
}
