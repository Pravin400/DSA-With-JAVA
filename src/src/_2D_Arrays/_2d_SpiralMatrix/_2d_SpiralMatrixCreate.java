package _2D_Arrays._2d_SpiralMatrix;

public class _2d_SpiralMatrixCreate {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}
                           };
        printSpiralArray(matrix);

    }

    public static void printSpiralArray(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow && startCol <= endCol) {

            //top
            for(int j = startCol; j <= endCol; j++) {
                //row constant col increase
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int i =  startRow+1; i <= endRow; i++) {
                //col constant row increases
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for(int j = endCol-1 ; j >= startCol; j--) {
                if(startCol  == endCol) {
                    break;
                }
                //row constant col decrease

                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int j = endRow-1 ; j >= startRow+1; j--) {
                //col constant row decreases
                if(startCol  == endCol) {
                    break;
                }
                System.out.print(matrix[j][startCol ]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
}
