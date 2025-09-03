package _2D_Arrays._2D_Array_Search;

public class _2D_Array_StareCaseSearch3 {
    public static void main(String[] args) {
        int [] [] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        int key = 33;

        stairCaseSearch(matrix,key);
    }

    private static boolean stairCaseSearch(int[][] matrix ,int key) {
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
