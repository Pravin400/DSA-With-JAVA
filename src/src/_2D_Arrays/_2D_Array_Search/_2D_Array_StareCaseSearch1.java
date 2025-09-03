package _2D_Arrays._2D_Array_Search;

public class _2D_Array_StareCaseSearch1 {
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

    private static void stairCaseSearch(int[][] matrix ,int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        int start = matrix[row][col];
        while (key != start) {
            if(start > key){
                col = col - 1;
                start = matrix[row][col];
            }
            else {
                row = row + 1;
                start = matrix[row][col];
            }
        }
        if(key == start){

        System.out.println("key successfully found ");
        System.out.println("key found at index : Matrix["+row+"]["+col+"]");
        }
        else {
            System.out.println("key not found");
            System.out.println("May be key not in the matrix ");
        }
    }
}
